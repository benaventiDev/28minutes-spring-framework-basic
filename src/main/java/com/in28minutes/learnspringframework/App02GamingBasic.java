package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.Arrays;

public class App02GamingBasic {
    public static void main(String[] args) {
        //1) Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2) Configure the things what we want Spring to manage through a @Configuration class
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person4Qualifier"));
        //Print all beans names
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        //System.out.println(context.getBean("addressBean"));
        System.out.println(context.getBean(Address.class));
    }
}
