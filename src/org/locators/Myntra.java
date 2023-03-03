package org.locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/men-casual-shirts");
	//driver.manage().window().maximize();
	List<WebElement> dprice=driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling :: span[@class='product-discountedPrice']"));
   List<Integer> price=new ArrayList<>();// changing to array
	for (WebElement webElement : dprice) {
	  String rep=webElement.getText().replace("Rs. ", "");//replace
	  int ctoint=Integer.parseInt(rep);//converting string to int
	  price.add(ctoint);
	 
} System.out.println(price);
Collections.sort(price); //sorting in ascending order
System.out.println(price);
Collections.sort(price,Collections.reverseOrder());//descending order
System.out.println(price);
System.out.println("product size:"+price.size());
System.out.println("Maximum Price:"+Collections.max(price));//to find max price
System.out.println("Minimum Price:"+Collections.min(price));//to find min price
}}
