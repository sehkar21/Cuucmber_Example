@sprint2
Feature: Free crm create new contacts

Scenario Outline: Free crm create a new contacts

Given user is on the login page
When title of the page is free crm
Then user enters the "<Username>" and "<Password>"
Then user clicks on login button
Then user is on the Homepage
Then user moves on to the contacts page
Then user enters the contacts details "<firstname>" and "<lastname>" and "<position>"
Then closes the browser

Examples:
						|Username|Password  |firstname|lastname|position|
						|sehkar  |csksehkar1|Tom      |peter   |manager |
						|sehkar  |csksehkar1|andrew   |Russel	 |master  |