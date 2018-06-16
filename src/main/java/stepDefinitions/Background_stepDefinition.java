package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background_stepDefinition {

	/*
	 * Any feature level dependency should be tie with the background and any scenario level dependency should be tie with hooks.
	 */

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		System.out.println("I am at the LogIn Page");
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
		System.out.println("I Submit my Username and Password");
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		System.out.println("I am logged on to the website");
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_item() throws Throwable {
		System.out.println("Bag is now contains the added product");
	}

	@Given("^User navigate for Lenovo Laptop$")
	public void user_navigate_for_Lenovo_Laptop() throws Throwable {
		System.out.println("User navigated for Lenovo Laptop");
	}

	@When("^Add the laptop to the basket$")
	public void add_the_laptop_to_the_basket() throws Throwable {
		System.out.println("Laptop added to the basket");
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_searched_for_Lenovo_Laptop() throws Throwable {
		System.out.println("User searched for Lenovo Laptop");
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() throws Throwable {
		System.out.println("First search result added to bag");
	}

	/*
	 * Background with Hooks
	This is so interesting to see the working of Background with Hooks. 
	The background is run before each of your scenarios but after any of your @Before hook.
	To get it straight, let’s assign a task to the Before & After Hook in the same test.

	@Before: Print the starting logs
	@Before: Start browser and Clear the cookies
	@After:  Close the browser
	@After: Print the closing logs
	 */
	
	//	
	//	@Before(order=0)
	//	public void beforeScenario(){
	//		System.out.println("This will run before the every Scenario");
	//	}	
	//	@Before(order=1)
	//	public void beforeScenarioStart(){
	//		System.out.println("-----------------Start of Scenario-----------------");
	//	}	
	//	@After(order=0)
	//	public void afterScenarioFinish(){
	//		System.out.println("-----------------End of Scenario-----------------");
	//	}	
	//	@After(order=1)
	//	public void afterScenario(){
	//		System.out.println("This will run after the every Scenario");
	//	}

}
