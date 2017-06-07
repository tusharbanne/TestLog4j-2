package com.tushar.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerPerformance {

	 private static Logger logger = LogManager.getLogger("hello");
	    public static void main(String args[])
	    {
	            String name = "Sachin";
	    		String lastName = "Tendulkar";
	    		
	    		for (int i = 0; i < 100000; i++) {
	    			logger.info("This is logger without parameters " + name + " Last name is " + lastName);    // This should not print anything
	    			
	    			logger.info("This is logger without parameters {} Last name is {}", name, lastName);
				}
	    }

	  
	
}
