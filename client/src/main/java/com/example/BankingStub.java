package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

@Component // @Service 
public class BankingStub implements IBanking{

    @Override
    public Integer deposit(Integer money) throws Exception {
        Socket client = new Socket("localhost", 9090); // portNumber 9090

        System.out.println("Trying connecting to server");

        InputStream in = client.getInputStream();

        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println("deposit:" + money);
        pw.flush();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String returnValue = reader.readLine(); // balance 100, 200, 300
        String[] propertyAndValue = returnValue.split(":");

        client.close();

        return Integer.parseInt(propertyAndValue[1]);
    }
}