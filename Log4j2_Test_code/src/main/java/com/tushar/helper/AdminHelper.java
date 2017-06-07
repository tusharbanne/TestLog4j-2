package com.tushar.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminHelper {

	//Logger adminLog = LogManager.getLogger("adminLogger"+AdminHelper.class);
	Logger adminLog = LogManager.getLogger("hello");
	
	
	public void logAdminLogs(String name){
		adminLog.traceEntry("Name is {}", name);
		adminLog.info("This is admin info Log");
		adminLog.error("This is admin error Log");
		adminLog.debug("This is admin debug parameterized Log {}", name);
		//adminLog.traceExit();
		
	}
	
	public void testExceptionFlow(){
		LogsHelper helper = new LogsHelper();
		helper.throwException();
	}
	
}
