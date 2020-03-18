package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class ContactsPage {

	
	public ContactsPage() {
		
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement Contact_btn;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact_btn;
	
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txt_fname;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement txt_Lname;
	
	
	@FindBy(xpath="//input[@id='company_position']")
	WebElement Txt_position;
	
	@FindBy(xpath="//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='contactForm']/table/tbody/tr/td/input[2]")
	WebElement Btn_save;
	
	
	public WebElement contact() {
		
		return Contact_btn;
	}
	
	public WebElement Newcontact() {
		
		return newContact_btn;
	}

	public WebElement FirstName() {
		
		return txt_fname;
	}
	public WebElement LastName() {
		
		return txt_Lname;
	}
	
	public WebElement Position() {
		
		return Txt_position;
	}
	
	public WebElement save_btn() {
		
		return Btn_save;
	}
	
	
	
}
