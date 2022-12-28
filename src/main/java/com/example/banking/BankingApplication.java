package com.example.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public abstract class BankingApplication {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ApplicationContext context = SpringApplication.run(BankingApplication.class, args);

		Car car = context.getBean(Car.class);
		simulate(car);
	}

	public static void simulate(Car model) {
        for(int i = 0; i<10; i++) {
			model.accelerateOneSecond();
            double speed = model.getCurrentSpeed();

            System.out.println("" + i + "sec.speed is" + speed);
        }
    }

}
