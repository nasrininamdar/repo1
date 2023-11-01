package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample7 {
	
	@Test
	@Parameters("url")
	void method70(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver drv= new ChromeDriver();
		drv.get(url);
		System.out.println("i m method 70");
		
	}

	@Test
	void method71() {
		System.out.println("i m method 71");
		
	}


	@Test
	void method72() {
		System.out.println("i m method 72");
		
	}

}
