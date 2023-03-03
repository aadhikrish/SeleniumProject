package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.id("first-name"));
		first.sendKeys("Krishna");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ak123@gmail.com");
		Thread.sleep(2000);
		
		WebElement mobile=driver.findElement(By.id("mobile"));
		mobile.sendKeys("65975986754");
		
		WebElement country=driver.findElement(By.name("country"));
		Select c1=new Select(country);
		c1.selectByValue("4");
		List<WebElement> all=c1.getOptions();
		for (WebElement alloptions : all) {
			System.out.println(alloptions.getText());
			
		}
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement message=driver.findElement(By.name("message"));
		message.sendKeys("Email me the details");
		
		
		
		
	}

}
