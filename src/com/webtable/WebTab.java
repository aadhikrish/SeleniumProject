package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97155\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
	    driver.manage().window().maximize();
	    WebElement table=driver.findElement(By.xpath("//img[@alt='Table']"));
	    table.click();
	  List  <WebElement> head= driver.findElements(By.xpath("//table//tbody//tr//td"));
	  for (WebElement webElement : head) {
		System.out.println(webElement.getText());
	}
	   
	   
}}
