package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\Driver\\chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement multi=driver.findElement(By.id("cars"));
	Select s=new Select(multi);
	boolean a= s.isMultiple();
	System.out.println(a);
	Thread.sleep(4000);
	 
	s.selectByIndex(3);
	Thread.sleep(4000);
	s.selectByValue("opel");
	Thread.sleep(4000);
	s.selectByVisibleText("Volvo");
	Thread.sleep(4000);
	
	WebElement f=s.getFirstSelectedOption();
	System.out.println("First selected option:"+f.getText());
	
	List<WebElement>all=s.getAllSelectedOptions();
	System.out.println("all selected option");
	for(WebElement allselected:all)
		{
		System.out.println(allselected.getText());
	}
	
	List <WebElement> ao=s.getOptions();
	int size=ao.size();
	System.out.println("size of list:"+size);
	System.out.println("all options in the list:");
	for(int i=0;i<size;i++)
	{
		if(i%2==0)
		{
		System.out.println(ao.get(i).getText());
	}}
	
	
	

	}

}
