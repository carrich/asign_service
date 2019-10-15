package example.assignment.controller;

import example.assignment.cusEnum.Role;
import example.assignment.cusEnum.Status;

import example.assignment.entity.PlaceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service12.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    HelloWorld helloWorld;

    @Autowired
    HttpSession session;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index(Model model) throws RemoteException {
        List<Place> list = new ArrayList<Place>();
        list =  Arrays.asList(helloWorld.getAllPlace());


        model.addAttribute("list", list);
        return "post/home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login(Model model) {
        model.addAttribute("member", new Member());
        return "member/login";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/logout")
    public String logout() {
          session.removeAttribute("currentLoggedIn");
        return "redirect: /";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/post")
    public String post(Model model) {
//        model.addAttribute("member", new Member());
        Member member = (Member) session.getAttribute("currentLoggedIn");
        if (member == null) {
            return "member/login";
        }
        return "post/post";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@Valid Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "member/login";
        }
        try {
            Member currentMember = new Member();
            currentMember = (Member) helloWorld.login(member.getUsername(), member.getPassword());
            if (currentMember == null) {
                return "member/login";
            } else {
                if (currentMember.getStatus() == Status.ACTIVE.getValue()) {
                    if (currentMember.getRole() == Role.GUIDE.getValue()) {
                        session.setAttribute("currentLoggedIn", currentMember);
                        return "post/post";
                    } else if (currentMember.getRole() == Role.TRAVELER.getValue()) {
                        session.setAttribute("currentLoggedIn", currentMember);
                        return "post/home";
                    }
                } else {
                    return "member/login";
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            return "member/login";
        }
        return "member/login";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public String createMember(Model model) {
        model.addAttribute("member", new Member());
        return "member/register";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String storeMember(@Valid Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "member/register";
        }
        try {
            helloWorld.register(member);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return "post/home";
    }

}
