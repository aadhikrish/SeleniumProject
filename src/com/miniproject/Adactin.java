package com.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
public static void main(String[] args) throws IOException, Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	//login
	driver.findElement(By.id("username")).sendKeys("Rubsaadi");
	driver.findElement(By.id("password")).sendKeys("adactin314");
	driver.findElement(By.id("login")).click();
	
	//searchHotel
	WebElement location = driver.findElement(By.id("location"));
	Select s=new Select(location);
	s.selectByIndex(2);
	
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1=new Select(hotels);
	s1.selectByVisibleText("Hotel Cornice");
	
	WebElement roomtype=driver.findElement(By.id("room_type"));
	Select s2=new Select(roomtype);
	s2.selectByValue("Standard");
	
	WebElement roomnumber = driver.findElement(By.id("room_nos"));
	Select s3=new Select(roomnumber);
	s3.selectByIndex(2);
	
	WebElement checkin = driver.findElement(By.name("datepick_in"));
	checkin.sendKeys("04/08/2022");
	
	WebElement checkout = driver.findElement(By.id("datepick_out"));
	checkout.sendKeys("06/08/2022");
	
	WebElement adultperroom=driver.findElement(By.name("adult_room"));
	Select s4=new Select(adultperroom);
	s4.selectByIndex(2);
	
	WebElement childperroom = driver.findElement(By.name("child_room"));
	Select s5=new Select(childperroom);
	s5.selectByValue("0");
	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	
	//select hotel
	
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	
	
	//book a hotel
	
	driver.findElement(By.id("first_name")).sendKeys("A");
	driver.findElement(By.id("last_name")).sendKeys("K");
	driver.findElement(By.name("address")).sendKeys("dubai");
	driver.findElement(By.name("cc_num")).sendKeys("2345765498763456");
	
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	Select s6=new Select(cardtype);
	s6.selectByVisibleText("VISA");
	
	WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
	Select s7=new Select(expirymonth);
	s7.selectByIndex(3);
	
	WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
	Select s8=new Select(expiryyear);
	s8.selectByValue("2022");
	
	driver.findElement(By.id("cc_cvv")).sendKeys("123");
	
	driver.findElement(By.id("book_now")).click();
	
	
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File desc=new File("C:\\Users\\97155\\Desktop\\Screenshot\\hotel1.png");
	FileUtils.copyFile(src, desc);
	 Thread.sleep(2000);
driver.findElement(By.id("logout")).click();
	
}
}
