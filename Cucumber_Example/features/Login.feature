@sprint1
Feature: Login functionality of freecrm 

  @tag1
  Scenario: Succefull login in freecrm
	
		Given the user opens the browser 
		Then user is in the freecrm website
		When user enter the value as "sehkar" and "csksehkar1" 
		And clicks the submit button
		Then user goes into the homepage
		Then user clicks the logout button 
		Then user closes the browser
		   
