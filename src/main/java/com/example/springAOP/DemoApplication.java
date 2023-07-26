package com.example.springAOP;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// AOP separates Cross cutting concerns like
		// Logging
		// Authorisation and Authentication
		// Validation

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		ShoppingCart sc = context.getBean(ShoppingCart.class);
		sc.checkout();
		((AbstractApplicationContext) context).close();
	}

}
