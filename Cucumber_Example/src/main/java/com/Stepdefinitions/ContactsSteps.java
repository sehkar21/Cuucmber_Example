package com.Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.objectrepo.ContactsPage;
import com.objectrepo.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactsSteps extends FunctionalLibrary {

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
			
		driver.get("https://www.crmpro.com/index.html");

	}

	
	@When("^title of the page is free crm$")
	public void title_of_the_page_is_free_crm() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		Thread.sleep(4000);

	}

	@Then("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String Username, String Password) throws Throwable {

			HomePage home = new HomePage();
			home.Username().sendKeys(Username);
			home.Password().sendKeys(Password);
			Thread.sleep(2000);
		WebElement login=home.Submit();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", login);
		
	}

	@Then("^user is on the Homepage$")
	public void user_is_on_the_Homepage() throws Throwable {
			
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);

		
	}

	@Then("^user moves on to the contacts page$")
	public void user_moves_on_to_the_contacts_page() throws Throwable {
			
		ContactsPage con = new ContactsPage();
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(con.contact()).build().perform();
		con.Newcontact().click();
		

		
	}

	@Then("^user enters the contacts details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_contacts_details_and_and(String firstname, String lastname, String position) throws Throwable {

		ContactsPage con = new ContactsPage();
		con.FirstName().sendKeys(firstname);
		con.LastName().sendKeys(lastname);
		con.Position().sendKeys(position);
		con.save_btn().click();
		

	}

	@Then("^closes the browser$")
	public void closes_the_browser() throws Throwable {

			driver.quit();
		
	}

}
