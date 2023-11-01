package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample4 {

	SoftAssert soft= new SoftAssert();
	@Test
	public static void method40() {
	String actual="google";
	Assert.assertEquals(actual, "google","title is not");
	Assert.assertTrue(true);
	System.out.println("equal title is matching");
	}
	
	@Test
	public static void method41() {
		SoftAssert soft= new SoftAssert();
	String title="jio";
	soft.assertEquals(title, "jio1","title is not matching");
		System.out.println("title is  matching");
	}
	
	
	@Test
	public static void method42() {
		System.out.println("i am test 42");
	}
	@Test
	public static void method43() {
		System.out.println("i am test 43");
	}
	
	@Test
	public static void method44() {
		System.out.println("i am test 44");
	}
	
}
