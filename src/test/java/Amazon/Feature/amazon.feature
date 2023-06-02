Feature: User Taking Product Count In Amazon Website
Scenario: User Log In In Amazon Site
Given user Launch The Application
When user Selects Baby Category From Dropdown
And  user Enters Toys In The Search Field
Then user Clicks And It Navigates To Next Page

Scenario: User Taking Count Of The Product
Given
When user Get The Title Of The Product
Then user Close The Website 