package steps;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mazda.methods.mazda_filter;
public class mazda_search {

private WebDriver driver;

public mazda_search()
{
	driver= Hooks.driver;
}

	@Given("I am on the Mazda website homepage")
	public void i_am_on_the_mazda_website_homepage() throws InterruptedException {
	    mazda_filter.MazdaHomePage(driver);

	}

	@When("I click the VEHICLES")
	public void i_click_the_vehicles() throws InterruptedException {
	    mazda_filter.clickVehicles(driver);

	}

	@When("I click the Sports Cars")
	public void i_click_the_sports_cars() {
	    mazda_filter.clickSportsCarsMenu(driver);


	}

	@Then("I should see results related to Sports Cars")
	public void i_should_see_results_related_to_sports_cars() {
	  mazda_filter.carResult(driver);

	}
}
