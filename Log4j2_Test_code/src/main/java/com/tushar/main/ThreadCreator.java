package com.tushar.main;

public class ThreadCreator{


	public static void main(String[] args) {
		TestLogs logs = new TestLogs();
		
		TestLogs logs1 = new TestLogs();
		
		TestLogs logs2 = new TestLogs();
		
		TestLogs logs3 = new TestLogs();
		
		Thread t1 = new Thread(logs1);
		t1.start();
		
		Thread t2 = new Thread(logs2);
		t2.start();
		
		Thread t3 = new Thread(logs3);
		t3.start();
		
		Thread t4 = new Thread(logs);
		t4.start();
	}
	
}
