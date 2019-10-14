package example.assignment.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service11.HelloWorld;
import service11.HelloWorldServiceLocator;


import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {

    @Bean
    HelloWorld helloWorld() throws ServiceException {
        return new HelloWorldServiceLocator().getHelloWorldPort();
    }

}
