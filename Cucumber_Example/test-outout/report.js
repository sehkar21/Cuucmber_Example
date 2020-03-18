$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality of freecrm",
  "description": "",
  "id": "login-functionality-of-freecrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 11043861600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Succefull login in freecrm",
  "description": "",
  "id": "login-functionality-of-freecrm;succefull-login-in-freecrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is in the freecrm website",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter the value as \"sehkar\" and \"csksehkar1\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "clicks the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user goes into the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks the logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.the_user_opens_the_browser()"
});
formatter.result({
  "duration": 9695006100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_in_the_freecrm_website()"
});
formatter.result({
  "duration": 4432997400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sehkar",
      "offset": 25
    },
    {
      "val": "csksehkar1",
      "offset": 38
    }
  ],
  "location": "HomePageSteps.user_enter_the_value_as_and(String,String)"
});
formatter.result({
  "duration": 3309268900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clicks_the_submit_button()"
});
formatter.result({
  "duration": 8826998100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_goes_into_the_homepage()"
});
formatter.result({
  "duration": 3011947000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_the_logout_button()"
});
formatter.result({
  "duration": 1688909300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 722290500,
  "status": "passed"
});
formatter.after({
  "duration": 683689100,
  "status": "passed"
});
formatter.uri("LoginDataTable.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9584148500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "sehkar",
        "csksehkar1"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDealsSteps.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 5803983800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 10980100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 213166500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 6565035800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 10303300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 2237212100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 390722300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDealsSteps.close_the_browser()"
});
formatter.result({
  "duration": 732732400,
  "status": "passed"
});
formatter.after({
  "duration": 22400,
  "status": "passed"
});
});