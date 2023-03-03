package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Launch1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		String title1=driver.getTitle();
		System.out.println("First Title:"+title1);
		
		driver.navigate().to("https://www.facebook.com/");
		String title2=driver.getTitle();
		System.out.println("Second Title:"+title2);
		driver.navigate().forward();
		
		driver.get("https://www.amazon.in");
		String title3=driver.getTitle();
		System.out.println("Third Title:"+title3);
		driver.navigate().forward();
		
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		String title4=driver.getTitle();
		System.out.println("Fourth Title:"+title4);

}}
