package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLeaf {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropbutton=driver.findElement(By.xpath("//a[@href='pages/Dropdown.html\']"));
		dropbutton.click();
		
		WebElement d1=driver.findElement(By.id("dropdown1"));
		Select s1=new Select(d1);
		s1.selectByIndex(1);
		boolean a=s1.isMultiple();
		System.out.println(a);
		
		WebElement d2=driver.findElement(By.name("dropdown2"));
		Select s2=new Select(d2);
		s2.selectByVisibleText("Appium");
		boolean b=s2.isMultiple();
		System.out.println(b);
		Thread.sleep(2000);
		
		WebElement d3=driver.findElement(By.id("dropdown3"));
		Select s3=new Select(d3);
		s3.selectByValue("3");
		
		WebElement d4=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s4=new Select(d4);
		s4.selectByValue("4");
	    boolean c=  s4.isMultiple();
	    System.out.println(c);
	    List<WebElement> alloptions=s4.getOptions();
	    int size1=alloptions.size();
	    System.out.println(size1);
	    
	  //  d5=driver.findElement(By.)
		
	    
		
		
	}

}
