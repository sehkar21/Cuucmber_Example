package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class TasksPage {

	public TasksPage() {
		
		PageFactory.initElements(FunctionalLibrary.driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement txt_task;
	
	@FindBy(xpath="//a[contains(text(),'New Task')]")
	WebElement txt_newtask;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement txt_tasktitle;
	
	@FindBy(xpath="//img[@id='f_trigger_c_deadline']")
	WebElement txt_deadline;
	
	@FindBy(xpath="/html[1]/body[1]/div[11]/table[1]/tbody[1]/tr[2]/td[4]")
	WebElement btn_date;
	
	@FindBy(xpath="//select[@name='task_type']")
	WebElement txt_tasktype;
	
	@FindBy(xpath="//option[@value='Client Visit']")
	WebElement txt_clientvisit;
	
	@FindBy(xpath="//option[@value='Delivery']")
	WebElement txt_delivery;
	
	@FindBy(xpath="//option[@value='Presentation']")
	WebElement txt_presentation;
	
	@FindBy(xpath="//input[@name='case_lookup']")
	WebElement txt_case;
	
	@FindBy(xpath="//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='taskForm']/table/tbody/tr[1]/td[1]/input[1]")
	WebElement btn_save;
	
	public WebElement tasks() {
		return txt_task;
	}
	
	public WebElement newtasks() {
		return txt_newtask;
	}
	
	public WebElement tasktitle() {
		return txt_tasktitle;
	}
	
	public WebElement taskdeadline() {
		return txt_deadline;
	}
	
	public WebElement datepicker() {
		return btn_date;
	}
	
	
	public WebElement tasktype() {
		return txt_tasktype;
	}
	
	public WebElement taskclient() {
		return txt_clientvisit;
	}
	
	public WebElement taskdelivery() {
		return txt_delivery;
	}
	
	public WebElement taskpresentation() {
		return txt_presentation;
	}
	public WebElement taskcase() {
		return txt_case;
	}
	public WebElement taskssave() {
		return btn_save;
	}
	
}
