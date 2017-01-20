package org.tennis.core.data;

import java.util.Date;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.info("Info: Hello World");
		logger.warning("Warning: Hello World");
		logger.severe("Severe: Hello World");
		
		long sleepTime = 5000;
		
		while (true == true) {
			try {
				logger.warning("About to go to sleep for " + sleepTime + " milliseconds");
				Thread.sleep(sleepTime);
				logger.info("I am awake!  It is " + new Date().toGMTString());
			}
			catch (InterruptedException ie) {
				logger.info("I was interrupted - exiting!!!");
				break;
			}
		}
	}

}
