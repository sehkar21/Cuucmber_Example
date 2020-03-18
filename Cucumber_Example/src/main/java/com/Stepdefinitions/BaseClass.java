package com.Stepdefinitions;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {

	
	@Before
	public void Beforescenario() {
		
		FunctionalLibrary.openbrowser("chrome");
	}
	
	@After
	public void Afterscenario() {
		
		FunctionalLibrary.closeBrowser();
	}
	
	
	
	
	
	
	
	
}
