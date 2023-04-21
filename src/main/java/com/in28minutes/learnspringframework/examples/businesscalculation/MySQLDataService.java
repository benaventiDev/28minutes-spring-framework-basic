package com.in28minutes.learnspringframework.examples.businesscalculation;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[]{6, 7, 8, 9, 10};
    }
}
