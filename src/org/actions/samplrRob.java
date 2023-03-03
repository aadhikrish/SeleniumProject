package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class samplrRob {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		Actions act=new Actions(driver);
		WebElement sell=driver.findElement(By.xpath("//a[text()='Sell']"));
		url
	}

}
