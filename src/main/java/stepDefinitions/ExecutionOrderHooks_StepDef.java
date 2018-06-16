package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ExecutionOrderHooks_StepDef {

	/*
	 * The very important thing to note here is:
	@Before(order = int) : This runs in increment order, means value 0 would run first and 1 would be after 0.
	@After(order = int) : This runs in decrements order, means apposite of @Before. Value 1 would run first and 0 would be after 1.
	 */

	@Before(order=0)
	public void beforeScenario(){
		System.out.println("This will run before the every Scenario");
	}	
	@Before(order=1)
	public void beforeScenarioStart(){
		System.out.println("-----------------Start of Scenario-----------------");
	}	
	@After(order=0)
	public void afterScenarioFinish(){
		System.out.println("-----------------End of Scenario-----------------");
	}	
	@After(order=1)
	public void afterScenario(){
		System.out.println("This will run after the every Scenario");
	}

}
