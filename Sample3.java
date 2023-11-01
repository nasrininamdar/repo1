
package com.testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample3 {


	@Test(timeOut=2)
	void method30() {
		System.out.println("i m test 30..");
		
	}

	@Test
	@Ignore
	void method31() {
		System.out.println("i m test 31..");
		
	}

	
	@Test(invocationCount=3)
	void method32() {
		System.out.println("i m test 32..");
		
	}
	

	@Test(enabled=true)
	void method33() {
		System.out.println("i m test 33..");
		
	}
	
	@Test(enabled=false)
	void method34() {
		System.out.println("i m test 34..");
		
	}
	
	@Test
	void method35() {
		System.out.println("i m test 35..");
		
	}
	
	@Test(alwaysRun=true)
	void method36() {
		System.out.println("i m test 36..");
		
	}
	@Test(dependsOnMethods= {"method35"})
	void method37() {
		System.out.println("i m test 37..");
		
	}
	
	
	
}
