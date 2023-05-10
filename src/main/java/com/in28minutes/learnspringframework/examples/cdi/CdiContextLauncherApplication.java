package com.in28minutes.learnspringframework.examples.cdi;




import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService{
    private DataService dataService;

    DataService getDataService(){
        return dataService;
    }
    //@Autowired
    @Inject
    public void setDataService(DataService dataService){
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}


//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try(var context =  new AnnotationConfigApplicationContext(com.in28minutes.learnspringframework.examples.cdi.CdiContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.printf(context.getBean(BusinessService.class).getDataService()+ "\n");
        }
    }
}
