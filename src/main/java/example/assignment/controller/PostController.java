package example.assignment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service12.*;

import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    HelloWorld helloWorld;
    @Autowired
    HttpSession session;

    @RequestMapping(method = RequestMethod.GET , value = "/home")
    public String homePage(Model model) throws ServiceException, RemoteException {
        List<PlaceDTO> list = new ArrayList<PlaceDTO>();
        list =  Arrays.asList(helloWorld.getPlaceDTO());
        model.addAttribute("list", list);
        return "post/home";
    }
    @RequestMapping(method = RequestMethod.POST , value = "/search")
    public String search(Model model, @RequestParam("search")String searchString) throws ServiceException, RemoteException {
        List<Place> list2 = new ArrayList<Place>();
        list2 =  Arrays.asList(helloWorld.getPlaceByName(searchString));
        model.addAttribute("list", helloWorld.getPlaceByName(searchString));
        return "post/home";
    }

    @RequestMapping("/detail/{id}")
    public String getDetail(Model model, @PathVariable("id")long id) throws ServiceException, RemoteException {
        HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
        HelloWorld helloWorld = locator.getHelloWorldPort();
        session.setAttribute("Post_id",id);
        Place place = helloWorld.getDetailPlace(id);

        List<CommentDto> commentDTOList = Arrays.asList(helloWorld.getCommentRating(id));

        model.addAttribute("list_comment", commentDTOList);
        model.addAttribute("place", place);
        return "post/detail";
    }

    @PostMapping("/saveComment")
    public String  saveComment(Model model, @RequestParam("diem")int diet, @RequestParam("content") String content) throws ServiceException, RemoteException {
        Long Post_id = (Long) session.getAttribute("Post_id");
        Member member = (Member) session.getAttribute("currentLoggedIn");
        int diem = diet;
        String noidung = content;
        HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
        HelloWorld helloWorld = locator.getHelloWorldPort();
        Comment comment = new Comment();
        comment.setComment(noidung);
        comment.setPid(Post_id);
        comment.setMember(member);
        comment.setId(Calendar.getInstance().getTimeInMillis());
        comment.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        comment.setStatus(1);

        helloWorld.createComment(comment);

        Rating rating = new Rating();
        rating.setId(Calendar.getInstance().getTimeInMillis());
        rating.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        rating.setPid(1);
        rating.setValue(diem);
        helloWorld.createRating(rating);
        return "redirect:detail";
    }
}
