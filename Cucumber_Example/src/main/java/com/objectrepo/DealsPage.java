package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class DealsPage {

	
	public DealsPage() {
		
		PageFactory.initElements(FunctionalLibrary.driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='title']")
	WebElement Txt_title;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement Txt_company;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement Txt_Amount;
	
	@FindBy(xpath="//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='prospectForm']/table/tbody/tr/td/input[1]")
	WebElement Btn_savedeal;
	
	public WebElement DealTitle()
	{
		return Txt_title;
	}
	
	public WebElement DealCompany()
	{
		return Txt_company;
	}
	public WebElement DealAmount()
	{
		return Txt_Amount;
	}
	public WebElement Dealsave()
	{
		return Btn_savedeal;
	}
	
	
	
	
	
	
	
	
	
	
}
