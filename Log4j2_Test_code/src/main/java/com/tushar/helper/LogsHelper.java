package com.tushar.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogsHelper {
	
	
	Logger fileLogger = LogManager.getLogger("wow");
	public void contextInitialized() {
		fileLogger.info("hello");
	}
	
	public void throwException() {
		String s = null;
		s.toString();
	}
}
