package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;
	
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
		
	}
	public void moveToBuy_Sell() {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomePageLocators.buy_sell_link).perform();
		
	}
	public void clickOnSearchCarMenu() {
		carsGuideHomePageLocators.search_cars_link.click();
	}
	public void clickOnUsedCarsSearchMenu() {
		carsGuideHomePageLocators.used_cars_link.click();
	}
	public void clickOnNewCarsSearchMenu() {
		carsGuideHomePageLocators.new_cars_link.click();
	}
	
}
