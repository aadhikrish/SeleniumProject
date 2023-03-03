package org.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecu {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,9000)");
		System.out.println("Scroll down done");
		Thread.sleep(2000);
		// WebElement sview=driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		// j.executeScript("arguments[0].ScrollIntoView();", sview);
		 j.executeScript("window.scrollBy(0,-5000)");
		 System.out.println("Scroll up done");
		
		 WebElement clk=driver.findElement(By.xpath("//a[@aria-label='Computers & Accessories']"));
		 j.executeScript("arguments[0].click();",clk);
		 System.out.println("clicked");
		 

	}

}
