
Feature: feature login feature of new website for testing 
Scenario: login test for new website 
Given I am on the demo website "https://opensource-demo.orangehrmlive.com" 
When I type username = "Admin" and password = "admin123" 
And I click sign-in button 
Then I should get the homepage