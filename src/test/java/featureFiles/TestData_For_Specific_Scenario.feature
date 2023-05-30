Feature: Login Functionality

Scenario: Login functionality with Valid Credentials
Given User Navigates to Login Page
When User enter the following details
			|VaniGadhagoni@gmail.com |12345    |
			|GadhagoniVani@gmail.com |123456789|

And clciks on Login button
Then User should get login Scuccessfully 