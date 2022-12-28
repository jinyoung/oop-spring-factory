package com.example.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		BankingApplication server = SpringApplication.run(BankingApplication.class, args).getBean(Server.class);

		server.run();
	}

}
