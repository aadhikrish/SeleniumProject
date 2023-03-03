package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch3 {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
	    String url=driver.getCurrentUrl();
	    System.out.println("First url:"+url);
	    
	   // driver.navigate().forward();
	    
	    driver.get("http://demo.automationtesting.in/Register.html ");
	    String url1=driver.getCurrentUrl();
	    System.out.println("Second url:"+url1);
	     
	   
		
		driver.get("http://www.greenstechnologys.com/");
		 String url2=driver.getCurrentUrl();
		 System.out.println("Third Title:"+url2);
		
		 driver.get("http://greenstech.in/selenium-course-content.html");
		 
		 String url3=driver.getCurrentUrl();
		
		 System.out.println(url3);
}}
