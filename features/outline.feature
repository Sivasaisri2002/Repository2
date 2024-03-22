Feature: Hotel App Login

Scenario: Login Successful
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I click Login
Then I am Logged in Successfully

Scenario Outline: Login Successful
Given I am on Hotel App Login Page
When I enter username as <username>
And I enter password as <password>
And I click Login
Then I am Logged in Successfully
Examples:
| username | password |
| "vasuvespag" | "vasu1234" |
| "Sriyaseth" | "Sriya@86" |
| "Varsharaj" | "Varsharaj" |
| "chaithuuu" | "12309876" |