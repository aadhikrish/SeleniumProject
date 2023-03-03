package org.actions;

import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions  {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		
		Actions act=new Actions(driver);
		WebElement bs=driver.findElement(By.linkText("Best Sellers"));
		act.contextClick(bs).build().perform();
		
		Robot r=new Robot();
		
		
}}
