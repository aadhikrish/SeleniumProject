package com.dynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElement {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.heroku.com/");
WebElement image=driver.findElement(By.xpath("//h4[text()='Heroku Runtime']//preceding-sibling::*[name()='svg']/*[name()='use']"));
System.out.println(image);
	
}}