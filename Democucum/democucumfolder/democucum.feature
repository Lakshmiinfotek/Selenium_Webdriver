Feature: feature to test login functionality
Scenario: check login is successfull with valid credentials
Given  User is on login page
When  User enters username and password

And   click on login button
Then  User is navigated to the homepage

