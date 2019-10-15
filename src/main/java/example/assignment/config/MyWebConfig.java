package example.assignment.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service12.HelloWorld;
import service12.HelloWorldServiceLocator;


import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {

    @Bean
    HelloWorld helloWorld() throws ServiceException {
        return new HelloWorldServiceLocator().getHelloWorldPort();
    }

}
