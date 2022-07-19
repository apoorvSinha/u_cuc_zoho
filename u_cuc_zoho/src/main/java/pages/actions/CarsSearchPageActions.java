package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarsSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	public void selectCarMakes(String carBrand) {
		Select selectCarMakes = new Select(carSearchPageLocators.select_car_make_dropdown);
		selectCarMakes.selectByVisibleText(carBrand);
	}
	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(carSearchPageLocators.select_model_dropdown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location) {
		Select selectLoc = new Select(carSearchPageLocators.select_location_dropdown);
		selectLoc.selectByVisibleText(location);
	}
	public void selectPrice(String price) {
		Select selectPrice = new Select(carSearchPageLocators.price_dropdown);
		selectPrice.selectByVisibleText(price);
	}
	public void clickOnFindMyNextCarButton() {
		carSearchPageLocators.find_my_next_car_button.click();
	}
	
}