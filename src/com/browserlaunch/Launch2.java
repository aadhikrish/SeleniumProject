package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
    String t1=driver.getTitle();
    System.out.println("First Title:"+t1);
    
    driver.navigate().to(" http://gmail.com/");
    String url=driver.getCurrentUrl();
    System.out.println("Second url:"+url);
     
    //driver.navigate().forward();
	
	driver.get("http://www.flipkart.com/");
	 String t3=driver.getTitle();
	 System.out.println("Third Title:"+t3);
	
	 driver.get("http://greenstech.in/selenium-course-content.html\r\n");
	 String t4=driver.getTitle();
	 String url1=driver.getCurrentUrl();
	 System.out.println(t4);
	 System.out.println(url1);
	}

}
