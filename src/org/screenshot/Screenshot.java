package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot s=(TakesScreenshot)driver;
		File sc = s.getScreenshotAs(OutputType.FILE);
		File dt=new File("C:\\Users\\97155\\Desktop\\Screenshot\\google.png");
		FileUtils.copyFile(sc, dt);
		
				

	}

}
