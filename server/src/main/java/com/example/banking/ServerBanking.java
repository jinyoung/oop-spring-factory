package com.example.banking;

@Component
public class ServerBanking implements IBanking{
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }
}