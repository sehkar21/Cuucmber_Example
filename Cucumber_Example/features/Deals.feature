@sprint3
Feature: creating a new deal

Scenario Outline: free crm create a new deal datadriven

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| sehkar | csksehkar1 |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters "<dealdetails>"
Then clicks on save button

Examples: 
					|dealdetails|
					|     3     |       
					|     2    	|
					|			1     |