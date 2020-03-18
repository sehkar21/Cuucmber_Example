package com.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FunctionalLibrary extends ReadData{
	
	public static WebDriver driver;
	
	public static WebDriver openbrowser(String BrowserName) {

		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		if (BrowserName.equals("chrome")) {
			 driver = new ChromeDriver();
		}

		else if (BrowserName.equals("ie")) {
			 driver = new InternetExplorerDriver();
		}

		else if (BrowserName.equals("firefox")) {
				driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	
	public static void closeBrowser() {
		
		driver.quit();
	}

	}
