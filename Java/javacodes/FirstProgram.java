package com.edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProgram {
	WebDriver driver;
	String currDir = System.getProperty("user.dir");

	public void openBrowser(String browser, String url){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", currDir+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", currDir+"\\driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("htmlunitdriver")){
			driver= new HtmlUnitDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			driver= new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
	}

	public void closeBrowser(){
		if(driver!=null){
			driver.close();
		}
	}

	public void quitBrowser(){
		if(driver!=null){
			driver.quit();
		}
	}

	public void getCommands(){
		/*		String title = driver.getTitle();
		System.out.println("Page Title = "+title);
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("Test case passed");
		}
		else{
			System.out.println("Test case Failed");
		}*/
		//		System.out.println("Current url - "+driver.getCurrentUrl());
		//		System.out.println(driver.getPageSource());
		//		System.out.println(driver.getWindowHandle());
	}

	public void navigationCommands(){
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

	public void locatorTest(){
		//		driver.findElement(By.id("email")).sendKeys("id test");
		//		driver.findElement(By.name("email")).sendKeys("name test");
		//		driver.findElement(By.className("inputtext")).sendKeys("Class Test");
		//		driver.findElement(By.tagName("input")).sendKeys("tag test");
		//		driver.findElement(By.linkText("Forgotten account?")).click();
		//		driver.findElement(By.partialLinkText("gotten acc")).click();
		//		driver.findElement(By.cssSelector("#email")).sendKeys("From Css selector");
		/*		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("u_0_a")).click();*/

		//		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("from xpath");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");


		//		//xpath - email
		//				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramesh-xpath-data-testid");

		//xpath - contains ==> FB create an account button ==> By Text
		//				driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		//		driver.findElement(By.xpath("//button[contains(text(),'an')]")).click();
		//		driver.findElement(By.xpath("//button[contains(text(),'account')]")).click();

		//xpath - By Attribute
		//				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test-from-xpath-attribute");
		//on FB == Forgotten account?
		//				driver.findElement(By.xpath("//a[contains(@href, 'recover/initiate?')]")).click();

		//xpath - starts with
		//				driver.findElement(By.xpath("//input[starts-with(@id, 'email')]")).sendKeys("xpath-starts with example");

		//xpath-following axes
		//input[@id='email']/following::*
		//input[@id='email']/following::tr
		//input[@id='email']/following::td/input[@id='pass']
		//				driver.findElement(By.xpath("//input[@id='email']/following::td/input[@id='pass']")).sendKeys("testpassword");

				//Element Displayed
				WebElement radioButton = driver.findElement(By.id("u_0_a"));
//				boolean exists = radioButton.isDisplayed();
//				System.out.println("Radio button exists - "+exists);
		//		
		//		//Enabled
		//		boolean enabled = radioButton.isEnabled();
		//		System.out.println("Radio button enabled Before- "+enabled);
		//		
		//		
				//Selected
				//Before
				boolean selected = radioButton.isSelected();
				System.out.println("Radio button Selected (before clicking) - "+selected);
				//After
				radioButton.click();
				selected = radioButton.isSelected();
				System.out.println("Radio button Selected (after clicking) - "+selected);

	}

	public static void main(String[] args) {
		FirstProgram test = new FirstProgram();
		test.openBrowser("chrome", "https://www.fb.com");
		test.getCommands();
		//		test.closeBrowser();
		//		test.quitBrowser();
		//		test.navigationCommands();
		test.locatorTest();
	}

}
