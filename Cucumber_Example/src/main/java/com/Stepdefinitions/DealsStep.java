package com.Stepdefinitions;


import com.objectrepo.DealsPage;
import com.resources.FunctionalLibrary;
import com.resources.ReadData;


import cucumber.api.java.en.Then;

public class DealsStep extends FunctionalLibrary {

		
	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters(String dealdetails)  {
		
		int row = Integer.parseInt(dealdetails);

		
		DealsPage deal = new DealsPage();
		deal.DealTitle().sendKeys(ReadData.getData().get(row).get("Title"));
		deal.DealAmount().sendKeys(ReadData.getData().get(row).get("Amount"));
		deal.DealCompany().sendKeys(ReadData.getData().get(row).get("Company"));
				
		
	}

	@Then("^clicks on save button$")
	public void clicks_on_save_button() throws Throwable {

		DealsPage deal = new DealsPage();
		deal.Dealsave().click();
		
		
	}

}
