package com.tushar.main;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tushar.helper.AdminHelper;
import com.tushar.helper.LogsHelper;


public class TestLogs implements Runnable {

	
	public void logTester() {
		/*System.setProperty("Log4jContextSelector",
	            "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");*/
		Logger logger = LogManager.getLogger("MyFile");
		Long startTime = System.currentTimeMillis();
		

		for (int j = 0; j< 10000; j++) {
			
		for (int i = 0; i < 10; i++) {
			logger.info("Index :: {}", i + " :: Message object logging!");
			logger.error("Index :: " + i + " :: String Concatation message logging !");
		}
		LogsHelper contextListener = new LogsHelper();
		contextListener.contextInitialized();
	
		AdminHelper adminHelper = new AdminHelper();
		adminHelper.logAdminLogs("tushar");
		try{
		adminHelper.testExceptionFlow();
		}
		catch(Exception e){
			logger.error("EXCEPTION LOG :: ",e);
		}
		
		increaseArraySize();
		
		}
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Total time taken :: "+totalTime + "  "+ Thread.currentThread().getName());
	}
	
	
	public void increaseArraySize(){
		
		Integer[] nums = new Integer[10];
		
		for (int i = 0; i < 20; i++) {
			if (i == 9) {
				nums = Arrays.copyOf(nums, nums.length + 10);
			}
			nums[i] = i; 
		}
	
				
	}


	@Override
	public void run() {
		logTester();
		
	}
	
}
