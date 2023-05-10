package com.in28minutes.learnspringframework.examples.businesscalculation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[]{6, 7, 8, 9, 10};
    }
}
