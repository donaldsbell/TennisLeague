package org.tennis.core.data;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.info("Info: Hello World");
		logger.warning("Warning: Hello World");
		logger.severe("Severe: Hello World");
	}

}
