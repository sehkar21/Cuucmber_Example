package com.Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.objectrepo.HomePageDeals;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;

public class HomePageDealsSteps extends FunctionalLibrary {


	

	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		
			
			driver.get("https://www.crmpro.com/index.html");

	}

	@SuppressWarnings("deprecation")
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
		
		List<List<String>> data = credentials.raw();
		//home.Username().sendKeys(data.get(0).get(0));
		//home.Password().sendKeys(data.get(0).get(1));
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		
				
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
			
				HomePageDeals home = new HomePageDeals();
			WebElement button =home.Submit();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", button);
	}

	@SuppressWarnings("deprecation")
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
			
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		
		
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws Throwable {
		
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();	
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData) throws Throwable {

		List<List<String>> dealValues =  dealData.cells(0);
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {

			driver.quit();


	}
}
