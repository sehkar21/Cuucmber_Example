package com.Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepo.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps {

	static WebDriver driver;

	
	@Given("^the user opens the browser$")
	public void the_user_opens_the_browser() throws Throwable {
			System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\Cucumber_Example\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			

		
	}

	@Then("^user is in the freecrm website$")
	public void user_is_in_the_freecrm_website() throws Throwable {
			
			driver.get("https://www.crmpro.com/");
			
		
	}

	@When("^user enter the value as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_value_as_and(String usname, String pwd) throws InterruptedException {

			driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(usname);
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
			
			Thread.sleep(3000);
			
	}

	@When("^clicks the submit button$")
	public void clicks_the_submit_button() throws InterruptedException {
		
		WebElement button =driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(3000);
	}

	
	@SuppressWarnings("deprecation")
	@Then("^user goes into the homepage$")
	public void user_goes_into_the_homepage() throws Throwable {

		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO",title);
		 Thread.sleep(3000);
		 
		
	}

	@Then("^user clicks the logout button$")
	public void user_clicks_the_logout_button()  {

		driver.switchTo().frame("mainpanel");
		 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", logout);

	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
			
		driver.quit();

		
	}


	
}
