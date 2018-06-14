Feature: moolya login feature

Scenario Outline: moolya login scenario test without examples
#with Examples Keyword we use Scenario Outline

Given user is already on login page
When title of the login page is moolya
Then user enters "<username>" and "<password>"
Then user clicks on signin button
Then user verify the home page
Then close the browser

Examples:
		| username | password |
		| saikiran.telapalli@raksan.in | MoolyaAdmin@123 |
		| platformadmin@moolya.global | MoolyaAdmin@123 |
		