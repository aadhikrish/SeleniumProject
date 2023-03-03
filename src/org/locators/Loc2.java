package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("name"));
		email.sendKeys("ak@gmail.com");
		boolean a=email.isDisplayed();
		System.out.println(a);
		
		Thread.sleep(4000);
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("the345");

	}

}
