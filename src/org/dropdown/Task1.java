package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/");
		Thread.sleep(2000);
		
	    WebElement creative	=driver.findElement(By.xpath("//body[@class='DesktopMediaFilter-module__mainLabel___h1cMI']"));
	    Select s=new Select(creative);
	    Thread.sleep(2000);
	    s.selectByVisibleText("Video");
		

	}

}
