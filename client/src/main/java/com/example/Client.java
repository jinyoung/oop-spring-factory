package com.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@Component
public class Client
{

    @Autowired
    IBanking banking;

    public void run() throws Exception {

        System.out.println(banking.deposit(100));
    }
   
}