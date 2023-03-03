package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FileHandlerScreenshot {

	public static void main(String[] args) throws IOException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\97155\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.nykaa.com/");
	 TakesScreenshot ts=(TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\97155\\eclipse-workspace\\Selenium\\src\\org\\screenshot\\nykaa.png");
	FileHandler.copy(source, destination);
	System.out.println("done");
	}

}
