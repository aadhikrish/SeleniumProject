package com.dynamicXpath;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static WebDriver driver;
	
	public static void getAllProductPrice() {
		System.out.println("All dicounted Prices");
		
		List<WebElement> discountedprices=driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement dprices : discountedprices) {
			System.out.println(dprices.getText());
		}
		int size=discountedprices.size();
        System.out.println("Total number of discountedprices:"+size);

	}
	
	public static void getParticularProductName(int i) {
		int givenprice=i;
		 List<WebElement> alldiscountedprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	      	for (WebElement dprice : alldiscountedprice) {
				String price=dprice.getText().replace("Rs. ", "");
				if(Integer.parseInt(price)==givenprice) {
					WebElement productname = dprice.findElement(By.xpath("//ancestor::div[@class='product-price']//preceding-sibling::h3"));
				String pname=productname.getText();
				System.out.println("Productname:"+pname);
				}
			}	
//prive=//div[@class="product-price"]/span/span[text()="899"]//ancestor::div[@class="product-price"]//preceding::h
	}
	public static void particularProduct(int givenprice) {
		
		List <WebElement> productprice = driver.findElements
				(By.xpath("//div[@class=\"product-price\"]/span/span[text()="+givenprice+"]//ancestor::div[@class=\"product-price\"]//preceding::h3"));
	     for (WebElement price : productprice) {
	    	 String givenpriceproductname = price.getText();
	    	 System.out.println(givenpriceproductname);
			
		}
	}
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//getAllProductPrice();
		//getParticularProductName(399);
		particularProduct(697
				) ;
		
		
      
       
	}}


