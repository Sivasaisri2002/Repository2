Feature: Hotel App Login
@SmokeTest @sanityTest
Scenario: Login Successful
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
When I enter password as "vasu1234"
And I Click Login 
Then I am logged in Successfully

@E2ETest @SanityTest
Scenario: Search Location
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
When I enter password as "vasu1234"

Then I am logged in Successfully
When I select location as "Sydney"
And Click on the search button
Then I can see the hotel