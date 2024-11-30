package StepDef;

import java.io.IOException;
import io.cucumber.java.en.*;

public class StepDefinitions extends Test_Base  {
	
	@Given("User launches Browser")
	public void user_launches_browser() {
	    System.out.println("Browser Enter");
	    br.init("chrome");
	}

	@And("User enters {string};")
	public void user_enters(String url) throws InterruptedException, IOException {
	    br.navigateTo(utils.getProperty("url"));
	}

	@When("User enters credentials and click on login")
	public void user_enters_username_and_password() throws IOException, InterruptedException {
	    lp.using(driver).login();
	}

	@Then("User is on homepage")
	public void user_is_on_homepage() {
		lp.using(driver).verify_Title();
	}


}
