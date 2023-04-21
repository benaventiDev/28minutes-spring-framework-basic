package com.in28minutes.learnspringframework.examples.businesscalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[]{1, 2, 3, 4, 5};
    }
}
