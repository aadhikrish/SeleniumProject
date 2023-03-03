package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasLoc {

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(4000);
		//driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("ak@gmail.com");
		boolean a=email.isDisplayed();
		System.out.println(a);
		
		Thread.sleep(4000);
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("the345");
		
		
		
		

	}

}
