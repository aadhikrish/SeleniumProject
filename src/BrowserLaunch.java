import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class BrowserLaunch {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\Desktop\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/accounts/login/?hl=en");
		 driver.manage().window().maximize();
		 
		 String title=driver.getTitle();
		 System.out.println("First title"+title);
		 
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 driver.navigate().to("https://www.twitter.com");
		
		
		 /*String twitter=driver.getTitle();
		 System.out.println("Second Title:"twitter);*/
		 
		 driver.navigate().forward();
		 
		 driver.navigate().to("https://www.facebook.com");
		 
		/* String facebook=driver.getTitle();
		 System.out.println("Third Title:"facebook);*/
		 
		 driver.get("https://www.twitter.com");
		 String title1=driver.getTitle();
		 System.out.println(" Last title"+title1);
		 
		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.close();
		 
		 

	}

}
