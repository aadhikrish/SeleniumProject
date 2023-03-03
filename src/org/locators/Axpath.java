package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement emaill=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
	    emaill.sendKeys("a");
	    WebElement pass= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
	    pass.sendKeys("68rg87");
	    WebElement login=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div[2]/button"));
	    login.click();
	   
	    
	}

}
