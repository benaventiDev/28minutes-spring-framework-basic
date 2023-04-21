package com.in28minutes.learnspringframework.examples.businesscalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationLauncherApp {
    public static void main(String[] args) {
        try(var context =  new AnnotationConfigApplicationContext(BusinessCalculationLauncherApp.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            //System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
