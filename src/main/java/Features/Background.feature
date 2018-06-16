Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
# A Background is much like a scenario containing a number of steps. 
# But it runs before each and every scenario where for a feature in which it is defined.

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
 
Scenario: Search a product and add the first product to the User basket
	Given User search for Lenovo Laptop
	When Add the first laptop that appears in the search result to the basket
	Then User basket should display with added item
 
Scenario: Navigate to a product and add the same to the User basket
	Given User navigate for Lenovo Laptop
	When Add the laptop to the basket
	Then User basket should display with added item