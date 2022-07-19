package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	private static SeleniumDriver seleniumdriver;
	
	//initialize webdriver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public static final int TIMEOUT = 300;
	public static final int PAEG_LOAD_TIMEOUT = 500;
	
	private SeleniumDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAEG_LOAD_TIMEOUT));
		
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(seleniumdriver == null) {
			seleniumdriver = new SeleniumDriver();	//made constructor private and instantiated by setupdriver method
		}
	}
	
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumdriver = null;
	}
	public static WebDriverWait getWaitDriver() {
		return waitDriver;
	}
	public static void setWaitDriver(WebDriverWait waitDriver) {
		SeleniumDriver.waitDriver = waitDriver;
	}
	
}
