Feature: User able to login with valid username and password
Scenario: User login with valid username, password varify the page

Given User able to open any browser 
And User able to enter the URL

When User able to click on Signin button
And User able to enter the Username 
And User able to enter the PW
And User able to click on submit button

Then User able to login in susscessfully
And User able to verify the page title