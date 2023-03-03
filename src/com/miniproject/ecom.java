package com.miniproject;

import org.openqa.selenium.By;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ecom {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login=driver.findElement(By.xpath("//a[@class='login']"));
		login.click();
		
		WebElement email=driver.findElement(By.id("email_create"));
		email.sendKeys("rubsaadi1@gmail.com");
		
		WebElement create=driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
		create.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement gender=driver.findElement(By.id("uniform-id_gender2"));
		gender.click();
		
		WebElement fname=driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("AA");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("kk");
		
		WebElement pass=driver.findElement(By.id("passwd"));
		pass.sendKeys("ak314");
		
		WebElement day=driver.findElement(By.name("days"));
		Select s=new Select(day);
		s.selectByValue("4");
		WebElement month=driver.findElement(By.name("months"));
		Select s1=new Select(month);
		s1.selectByVisibleText("March ");
		
		WebElement year=driver.findElement(By.name("years"));
		Select s2=new Select(year);
		s2.selectByValue("2007");
		
		
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2500)");
//		WebElement view=driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		view.click();
//		Thread.sleep(1000);
//		//int size=driver.findElements(By.tagName("iframe")).size();
//		//System.out.println(size);
//		
//		
//		//WebElement frame1=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")); 
//		//driver.switchTo().frame(0);
//		
//		
//		
//		WebElement size=driver.findElement(By.xpath("//select[@name='group_1']"));
//		Select s=new Select(size);
//		s.selectByValue("3");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		
//		WebElement add=driver.findElement(By.xpath("//span[text()='Add to cart'] "));
//		add.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//driver.switchTo().frame(0);	
//
//		WebElement ptopay=driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
//	    ptopay.click();
//		
//		
//		
//		
	}

}
