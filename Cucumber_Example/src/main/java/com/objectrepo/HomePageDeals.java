package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePageDeals {

	
	public HomePageDeals() {
		
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement  Txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Txt_password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement Btn_submit;
	
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deal_btn;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newdeal_btn;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout_btn;
	
	
	
	public WebElement Username() {
		 return Txt_username;
		 
	}
	
	public WebElement Password() {
		return Txt_password;
	}
	
	public WebElement Submit() {
		return Btn_submit;
	}
	
	public WebElement deal() {
		return deal_btn;
	}
	
	public WebElement Newdeal() {
		return newdeal_btn;
	}
	
	public WebElement logout() {
		
		return logout_btn;
	}
	
	
	
	
	
	
	
}
