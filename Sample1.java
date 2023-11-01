package com.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseclass.Basic;

public class Sample1 extends Basic{
	@BeforeClass
	void method() {
		System.out.println("i m before class once 1 ...");
		
	}
	
	@BeforeMethod
	void method2() {
		System.out.println("i m  before method  i m run before each test 2...");
	}

	@Test
	void method3() {
		System.out.println(" i am test  3");
	}
	

	@Test
	void method4() {
		System.out.println(" i am test  4");
	}
	

	@Test
	void method5() {
		System.out.println(" i am test  5");
	}
	

	@BeforeMethod
	void method6() {
		System.out.println(" i am test method 6");
	}
	

	@BeforeSuite
	void method7() {
		System.out.println(" i am beforesuite 7 onece first");
	}
}
