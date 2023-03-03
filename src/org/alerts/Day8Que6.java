package org.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Que6 {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	
	WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	

}}
