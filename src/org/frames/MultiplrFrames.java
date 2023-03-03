package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplrFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement second= driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		second.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		WebElement mframes=driver.findElement(By.xpath("//input[@type='text']"));
		mframes.sendKeys("hi");

	}

}
