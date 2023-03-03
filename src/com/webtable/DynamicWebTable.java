package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static WebDriver driver;
	static int populationindex;
	static int countryindex;
	static String givencountry = "India";

	public static void Browser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

	}

	public static void getIndex() {
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> allheader = allrows.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < allheader.size(); j++) {
				String header = allheader.get(j).getText();
				// System.out.println(header);
				if (header.contains("Country")) {
					countryindex = j;
					System.out.println(j);
				} else if (header.contains("Population")) {
					populationindex = j;
				}
			}
		}
	}

	public static void allData() {
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j <= alldata.size(); j++)
				System.out.println(alldata.get(i).getText());
		}
	}

	public static void particularRow() {

		System.out.println("Particular Row");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				if (j == countryindex) {
					if (alldata.get(j).getText().equalsIgnoreCase(givencountry)) {
						// System.out.println(givencountry);
						for (int k = 0; k < alldata.size(); k++) {
							System.out.print(alldata.get(k).getText());
						}
					}
				}
			}
		}
	}

	public static void particularcolumn() {
		System.out.println("Particular Column");
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < allrow.size(); i++) {
			List<WebElement> alldata = allrow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				if (j == countryindex)
					// if(alldata.get(j).getText().equalsIgnoreCase("Total Recovered")){
					// for (int k = 0; k < alldata.size(); k++)
					System.out.println(alldata.get(j).getText());
			}
		}

	}

	public static void particularData() {
		System.out.println("Particular Data");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				if (j == countryindex) {
					if (alldata.get(j).getText().equalsIgnoreCase(givencountry)) {
						for (int k = 0; k < alldata.size(); k++)
							if (k == populationindex) {
								System.out.println(alldata.get(k).getText());
							}
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Browser();
//allData();
		getIndex();

		particularcolumn();
		particularData();
		particularRow();

	}
}
