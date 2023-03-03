package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actio_perform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/buttons");
		Actions a=new Actions(driver);
	WebElement dclk	=driver.findElement(By.id("doubleClickBtn"));
	a.doubleClick(dclk).build().perform();
	
	WebElement rclk=driver.findElement(By.id("rightClickBtn"));
	a.contextClick(rclk).build().perform();
	
	WebElement clk=driver.findElement(By.xpath("(//button[@type='button']) [4]"));
	a.click(clk).build().perform();
	
	WebElement move=driver.findElement(By.xpath("//div[text()='Buttons']"));
	a.moveToElement(move).build().perform();
	

	}}

