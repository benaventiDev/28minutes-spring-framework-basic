package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ranga";
    }
    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address){
        return new Person(name, age, address);
    }
    @Bean(name = "addressBean")
    public Address address(){
        return new Address("Baker Street", "London");
    }

    @Bean
    @Primary
    public Address address2(){
        return new Address("Las Vegas Street", "London");
    }
    @Bean(name = "addressBean1")
    @Qualifier("address3Qualifier")
    public Address address3Qualifier(){
        return new Address("Baker Street", "London");
    }

}
