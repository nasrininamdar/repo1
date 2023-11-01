package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampl6 {
	
	@Test
	void method60() {
		WebDriverManager.edgedriver().setup();
		WebDriver drv= new EdgeDriver();
		drv.get("https://www.google.com/");
		System.out.println("i m method 60");
		
	}
	
	@Test
	void method61() {
		WebDriverManager.chromedriver().setup();
		WebDriver drv= new ChromeDriver();
		drv.get("https://www.google.com/");
		System.out.println("i m method 61");
		
	}
	
}
