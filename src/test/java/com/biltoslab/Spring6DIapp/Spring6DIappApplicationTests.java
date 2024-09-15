package com.biltoslab.Spring6DIapp;

import com.biltoslab.Spring6DIapp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DIappApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.hello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.hello());

	}

	@Test
	void contextLoads() {
	}

}
