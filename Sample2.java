package com.testcases;

import org.testng.annotations.Test;

public class Sample2 {

	
	@Test(priority=1)
	void method20() {
		System.out.println("i m test 20..");
		
	}
	
	@Test(priority=2)
	void method21() {
		System.out.println("i m test 21..");
		
	}
	
	@Test(priority=3)
	void method22() {
		System.out.println("i m test 22..");
		
	}
	
	@Test(priority=-1)
	void method23() {
		System.out.println("i m test 23..");
		
	}
	
	@Test(priority=0)
	void method24() {
		System.out.println("i m test 24..");
		
	}
	

}
