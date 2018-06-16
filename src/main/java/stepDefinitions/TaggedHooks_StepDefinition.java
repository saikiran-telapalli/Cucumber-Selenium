package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks_StepDefinition {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

	
	/*
	 * Note: We learned that @Before & @After hooks runs before & after every Scenario. 
	 * But @Before(“@First”) will run only before the first scenario and like wise other tagged hooks
	 */
	
	@Before("@First")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	@Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }

	@After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");   
    }	

}
