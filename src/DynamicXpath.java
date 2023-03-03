import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("All dicounted Prices");
		int i=540;
		List<WebElement> discountedprices=driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement dprices : discountedprices) {
			System.out.println(dprices.getText());
		}
		int size=discountedprices.size();
        System.out.println("Total number of discountedprices:"+size);
      
        List<WebElement> alldiscountedprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
      	for (WebElement dprice : alldiscountedprice) {
			String price=dprice.getText().replace("Rs. ", "");
			if(Integer.parseInt(price)==i) {
				WebElement productname = dprice.findElement(By.xpath("//ancestor::div[@class='product-price']//preceding-sibling::h4"));
			String pname=productname.getText();
			System.out.println("Productname:"+pname);
			}
		}
	}}


