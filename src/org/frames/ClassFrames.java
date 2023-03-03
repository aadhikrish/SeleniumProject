package org.frames;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFrames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "r.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement single=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		single.click();
		Thread.sleep(2000);
		
		WebElement sframe=driver.findElement(By.id("singleframe"));//frame xpath
		driver.switchTo().frame(sframe);
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("single");
		System.out.println("Single frame");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		WebElement Multiple=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		Multiple.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement tex=driver.findElement(By.xpath("//input[@type='text']"));
		tex.sendKeys("Multiple");
		System.out.println("multiple frame");
		driver.switchTo().defaultContent();
		
		TakesScreenshot sc=(TakesScreenshot) driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\97155\\Desktop\\Screenshot\\frames.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		

	}

}
