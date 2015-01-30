package com.waelawada.learn.springboot;

import java.util.Arrays;
import java.util.Date;

import com.waelawada.learn.springboot.dao.UserDao;
import com.waelawada.learn.springboot.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.waelawada.learn.springboot")
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;
    private static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(applicationClass, args);
        UserDao userDao = ctx.getBean(UserDao.class);

        User sampleUser = new User();
        sampleUser.setId(1L);
        sampleUser.setEmail("mypersonal@email.com");
        sampleUser.setJoinDate(new Date());
        sampleUser.setLastLogin(new Date());
        sampleUser.setName("Wael Awada");
        sampleUser.setPassword("hellopassword");

        userDao.save(sampleUser);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}