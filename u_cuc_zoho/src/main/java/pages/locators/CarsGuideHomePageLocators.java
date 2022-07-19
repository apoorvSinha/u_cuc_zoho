package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"u_H\\\"]/div/div[1]/ul/li[1]/a")
	public WebElement buy_sell_link;
	@FindBy(how = How.LINK_TEXT, using = "reviews")
	public WebElement car_reviews_link;
	@FindBy(how = How.LINK_TEXT, using = "news")
	public WebElement news_link;
	@FindBy(how = How.LINK_TEXT, using = "advice")
	public WebElement advice_link;
	@FindBy(how = How.LINK_TEXT, using = "pricing + specs")
	public WebElement price_specs_link;
	@FindBy(how = How.LINK_TEXT, using = "guides")
	public WebElement guides_link;
	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	public WebElement search_cars_link;
	@FindBy(how = How.LINK_TEXT, using = "Used")
	public WebElement used_cars_link;
	@FindBy(how = How.LINK_TEXT, using = "New")
	public WebElement new_cars_link;
	
	
	
}
