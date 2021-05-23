package com.edureka.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FirstProgram {
	WebDriver driver;
	String currDir = System.getProperty("user.dir");

	public void openBrowser(String browser, String url){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", currDir+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", currDir+"\\driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.get(url);
	}
	
	public static void main(String[] args) {
		FirstProgram test = new FirstProgram();
		test.openBrowser("FireFox", "https://www.facebook.com");
		test.openBrowser("chrome", "https://www.google.com");
		

	}

}
