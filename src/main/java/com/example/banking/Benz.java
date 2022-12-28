package com.example.banking;

import org.springframework.stereotype.Component;

@Component
public class Benz extends Car{

    @Override
    public double getZeroToHundred() {
        // TODO Auto-generated method stub
        return 8;
    }

    @Override
    public double getCurrentFuelEconomy() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
