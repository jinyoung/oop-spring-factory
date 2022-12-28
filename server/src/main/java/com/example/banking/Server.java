package com.example.banking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@Component
public class Server 
{

    @Autowired
    IBanking banking;

    public void run() throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        while(true) {
            Socket socket = server.accept();

            System.out.println("A Client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            String depositCommend = reader.readLine();
            String commandAndParam[] = depositCommend.split(":");

            int balance = 0;
            if("deposit".equals(commandAndParam[0])) {
                balance = banking.deposit(Integer.parseInt(commandAndParam[1]));
            }
            
            pw.println("balance:" + balance);
            pw.flush();
        }
    }
}