package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensScreenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		TakesScreenshot shot=(TakesScreenshot) driver;
		File s=shot.getScreenshotAs(OutputType.FILE);
	   File d= new File("C:\\Users\\97155\\Desktop\\Screenshot\\greens1.png");
	   FileUtils.copyFile(s, d);
	   System.out.println("Screenshot taken");
		

	}

}
