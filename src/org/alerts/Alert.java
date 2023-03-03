package org.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		  WebElement simple=driver.findElement(By.id("alertButton")); 
		  simple.click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();
		  
			
		  
		  WebElement alert=driver.findElement(By.id("confirmButton"));
		  alert.click();
		  driver.switchTo().alert().accept();
		 
		
		 WebElement prompt=driver.findElement(By.id("promtButton"));
		 prompt.click();
		System.out.println( driver.switchTo().alert().getText());
		 Thread.sleep(2000);
		 driver.switchTo().alert().sendKeys("Krishna");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		
		
		 
		
		

	}

}
