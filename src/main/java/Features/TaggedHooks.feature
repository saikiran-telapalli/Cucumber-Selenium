Feature: Test Tagged Hooks

#But what if we have different pre-requisites for different scenarios. And we need to have different hooks for different scenarios.
#Again, Cucumbers has given feature of Tagged Hooks to solve the above situation where we need to perform different tasks before and after scenarios.

@First 
Scenario: This is First Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step

@Second
Scenario: This is Second Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step
	
	
@Third
Scenario: This is Third Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step
