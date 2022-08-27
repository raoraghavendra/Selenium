package stepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageobjects.Homepage;
import pageobjects.LoginTC;
import resource.Basicprop;

@RunWith(Cucumber.class)

public class stepDefinations extends Basicprop {

	@Given("User is on landing page {string}")
	public void user_is_on_landing_page(String string) throws IOException {

		gotoApp();

	}

	 @When("^User login into application with (.+) and (.+)  and  Clicked on submit button$")
	    public void user_login_into_application_with_and_and_clicked_on_submit_button(String username, String password) throws Throwable {

			LoginTC ln = new LoginTC(driver);
			ln.username().sendKeys(username);
			ln.password().sendKeys(password);
			ln.submitButton().click();
	 
	 }
	 

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		
		Homepage hp = new Homepage(driver);
		hp.homepage().click();
		getScreenShotPath("home");
		
		
	}

}
