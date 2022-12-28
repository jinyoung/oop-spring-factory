package com.example.banking;

import org.springframework.stereotype.Component;

//@Component
public class BMW extends Car{

    @Override
    public double getZeroToHundred() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public double getCurrentFuelEconomy() {
        // TODO Auto-generated method stub
        return 100;
    }
    
}
