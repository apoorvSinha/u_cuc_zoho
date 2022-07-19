package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	@FindBy(how = How.CSS, using = "#makes")
	public WebElement select_car_make_dropdown;
	@FindBy(how = How.CSS, using = "#models")
	public WebElement select_model_dropdown;
	@FindBy(how = How.CSS, using = "#locations")
	public WebElement select_location_dropdown;
	@FindBy(how = How.CSS, using = "#priceTo")
	public WebElement price_dropdown;
	@FindBy(how = How.CSS, using = "#search-submit")
	public WebElement find_my_next_car_button;
}
