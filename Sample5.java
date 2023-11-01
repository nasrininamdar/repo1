package com.testcases;

import org.testng.annotations.Test;

public class Sample5 {

	@Test(groups= {"sanity"})
	public static void method50() {
		System.out.println("i am test 50");
	}
	@Test(groups= {"Regression"})
	public static void method51() {
		System.out.println("i am test 51");
	}
	
	@Test(groups= {"sanity","Regression"})
	public static void method52() {
		System.out.println("i am test 52");
	}
	
	@Test(groups= {"Regression"})
	public static void method53() {
		System.out.println("i am test 53");
	}
	@Test(groups= {"Regerssion"})
	public static void method54() {
		System.out.println("i am test 54");
	}
	
	@Test(groups= {"sanity"})
	public static void method55() {
		System.out.println("i am test 55");
	}
	
	
}
