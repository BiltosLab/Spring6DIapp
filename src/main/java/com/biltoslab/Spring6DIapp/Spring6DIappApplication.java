package com.biltoslab.Spring6DIapp;

import com.biltoslab.Spring6DIapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DIappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6DIappApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("Main Method");
		System.out.println(controller.hello());


	}

}
