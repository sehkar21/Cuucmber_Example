package com.Stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.objectrepo.TasksPage;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TasksSteps extends FunctionalLibrary {

	@Given("^the user is in the freecrm loginpage$")
	public void the_user_is_in_the_freecrm_loginpage() throws Throwable {

		driver.get("https://www.crmpro.com/");
		
	}

	@When("^user enter the valid username and password$")
	public void user_enter_the_valid_username_and_password(DataTable credentials) throws Throwable {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
	
			 WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
			
		}
		
	}

	@Then("^user moves into the homepage$")
	public void user_moves_into_the_homepage() throws Throwable {
			
		String title = driver.getTitle();
		System.out.println(title);

	Assert.assertEquals("CRMPRO",title);	
	}

	@When("^user clicks the tasks$")
	public void user_clicks_the_tasks() throws Throwable {
			driver.switchTo().frame("mainpanel");
			TasksPage task = new TasksPage();
			Actions acc = new Actions(driver);
			acc.moveToElement(task.tasks()).build().perform();
			task.newtasks().click();
		
	}

	@When("^user enters the task details$")
	public void user_enters_the_task_details(DataTable dealdata) throws Throwable {
		     TasksPage task = new TasksPage();
		     
			for(Map<String,String> data: dealdata.asMaps(String.class, String.class)) {
				
				task.tasktitle().sendKeys(data.get("title"));
				
				
				task.taskdeadline().click();
				Thread.sleep(3000);
				Actions acc2 = new Actions(driver);
				acc2.moveToElement(task.datepicker()).click();
				//task.taskdeadline().sendKeys(data.get("deadline"));
				
				Actions acc = new Actions(driver);
				acc.moveToElement(task.tasktype()).click();
				
				task.tasktype().sendKeys(data.get("type"));
				
				task.taskcase().sendKeys(data.get("case"));
				
				Thread.sleep(1000);
				task.taskssave().click();
				
				Actions acc1 = new Actions(driver);
				acc1.moveToElement(task.tasks()).build().perform();
				task.newtasks().click();
				
			}
		
		
	}

}
