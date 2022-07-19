package stepdefs;

import java.util.List;

import cucumber.api.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	
	@Given("I am on the Homepage of {string}")
	public void i_am_on_the_homepage_of(String URL) {
		
		SeleniumDriver.openPage(URL);
	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> list) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		String menu = list.get(1);
		System.out.println("Menu selected is: " + menu);
		carsGuideHomePageActions.moveToBuy_Sell();

	}

	@And("select on {string} link")
	public void select_on_link(String searchCars) {
		carsGuideHomePageActions.clickOnSearchCarMenu();

	}

	@And("select car brand as {string} from anymake dropdown")
	public void select_car_brand_as_from_anymake_dropdown(String carBrand) {
		carsSearchPageActions.selectCarMakes(carBrand);
	}

	@And("select car model as {string} from any mode dropdown")
	public void select_car_model_as_from_any_mode_dropdown(String carModel) {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@And("select location as {string} from anylocation dropdown")
	public void select_location_as_from_anylocation_dropdown(String location) {
		carsSearchPageActions.selectLocation(location);
	}

	@And("selected max price is {string} from price max dropdown")
	public void selected_max_price_is_from_price_max_dropdown(String price) {
		carsSearchPageActions.selectPrice(price);
	}

	@Then("click on find my next car")
	public void click_on_find_my_next_car() {
		carsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	}

	@And("page title should be {string}")
	public void page_title_should_be(String string) {
	}

}
