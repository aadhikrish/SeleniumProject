package org.dropdown;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement createaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createaccount.click();
		Thread.sleep(4000);
		WebElement Month=driver.findElement(By.id("month"));
		Select a=new Select(Month);
		a.selectByIndex(1);
		Thread.sleep(4000);
		WebElement Date=driver.findElement(By.name("birthday_day"));
		Select b=new Select(Date);
		b.selectByValue("4");
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select c=new Select(year);
		c.selectByVisibleText("2020");
		Thread.sleep(4000);
		
		
		
		

	}

}
