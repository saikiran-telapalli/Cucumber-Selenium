package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginWithExamples {

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://qaapp.moolya.global/login");
		driver.manage().window().fullscreen();
	}

	@When("^title of the login page is moolya$")
	public void title_of_the_login_page_is_moolya() {
		String title= driver.getTitle();
		System.out.println("title: "+title);
		Assert.assertEquals("", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@Then("^user clicks on signin button$")
	public void user_clicks_on_signin_button() {
		WebElement login_button = driver.findElement(By.className("ml_submit_btn"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", login_button);
	}
	
	@Then("^user verify the home page$")
	public void user_verify_the_home_page() {
		String chapter_Priming = driver.findElement(By.xpath("//a[text()='Chapters']")).getText();
		Assert.assertEquals("Chapter", chapter_Priming);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
