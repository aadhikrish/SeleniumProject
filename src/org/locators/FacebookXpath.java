package org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookXpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97155\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    //create
	    WebElement create=driver.findElement(By.cssSelector("input.inputtext. _55r1. _6luy")) ; 
	    create.click();
	   Thread.sleep(2000);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement first=driver.findElement(By.name("firstname"));
	    first.sendKeys("Krishna");
	    Thread.sleep(1000);
	    
	    WebElement last=driver.findElement(By.name("lastname"));
	    last.sendKeys("krish");
	    Thread.sleep(1000);
	    
	    WebElement mobile=driver.findElement(By.name("reg_email__"));
	    mobile.sendKeys("6769789676579");
	    Thread.sleep(1000);
	    
	    WebElement password=driver.findElement(By.name("reg_passwd__"));
	    password.sendKeys("876ashdg");
	    Thread.sleep(1000);
	    
	    
	    
	    
	    
	}

}