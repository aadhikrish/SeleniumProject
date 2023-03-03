package org.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Que3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement contin=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		Thread.sleep(1000);
	
		contin.click();
		//Thread.sleep(1000);
		
	//driver.switchTo().alert().accept();
		
	}

}
