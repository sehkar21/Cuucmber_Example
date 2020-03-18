@sprint5
Feature: Create a new Task

Scenario: create a new task in free crm

Given the user is in the freecrm loginpage
When user enter the valid username and password
|username|password  |
|sehkar  |csksehkar1|
Then user moves into the homepage
When user clicks the tasks
And user enters the task details
        |title   |    deadline     |type        |case|
        |manager |22-Mar-2020      |Client Visit|001 |
        |teamlead|22-Mar-2020      |Delivery    |002 |
        |director|22-Mar-2020      |Presentation|003 |