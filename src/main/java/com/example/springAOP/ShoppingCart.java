package com.example.springAOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	private static Logger log = LoggerFactory.getLogger(ShoppingCart.class);

	public void checkout() {
		log.info("ShoppingCart :: Checkout Method from Shopping Cart Called");
	}
}
