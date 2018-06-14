Feature: moolya login feature

Scenario: moolya login scenario test without examples
#without Examples Keyword

Given user is already on login page
When title of the login page is moolya
Then user enters "saikiran.telapalli@raksan.in" and "MoolyaAdmin@123"
Then user clicks on signin button
Then user verify the home page