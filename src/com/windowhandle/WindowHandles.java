package com.windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {
	static WebDriver driver;
	// static String title;

	public static void Browser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	public static void windowhandletwo() {

		System.out.println("==========TwoWindows==============");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 promax");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Graphite, 128 GB)']")).click();

		String parentid = driver.getWindowHandle();
		System.out.println("ParentId:" + parentid);

		Set<String> allid = driver.getWindowHandles();
		for (String currentid : allid) {
			if (!(currentid.equals(parentid))) {
				String title = driver.switchTo().window(currentid).getTitle();

				System.out.println("ChildId:" + title);
			}
		}

	}

	public static void windowHandles() {

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 promax");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Graphite, 128 GB)']")).click();

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Gold, 1 TB)']")).click();

		String parentid = driver.getWindowHandle();
		System.out.println("parrentId:" + parentid);

		Set<String> allid = driver.getWindowHandles();
		for (String currentid : allid) {
			if (!currentid.equals(parentid)) {
				String currenttitle = driver.switchTo().window(currentid).getTitle();
				
				WebElement gold = driver.findElement(By.xpath("//h1/span"));

				if (gold.getText().contains("Gold")) {
					System.out.println("currentId:"+currentid);
					System.out.println("currentTitle:"+currenttitle);
					driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
					System.out.println("successfully added to card");
				}
			}

		}
	}

	public static void main(String[] args) {
		Browser();
		windowHandles();
		// windowhandletwo();
	}

}
