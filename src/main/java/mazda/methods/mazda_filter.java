package mazda.methods;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import mazda.pageobjects.mazda_filterOR;

public class mazda_filter {
	final static Logger logger = LogManager.getLogger(mazda_filter.class);

	public static void MazdaHomePage(WebDriver driver) throws InterruptedException {

		try {
			driver.get("https://www.mazdausa.com/");
			Thread.sleep(5000);
		} catch (TimeoutException e) {
			logger.info("Not able to load the URL within 20 sec ", e);
		}
		logger.info("URL is loaded successfully ");
	}

	public static void clickVehicles(WebDriver driver) throws InterruptedException {
		try {
//	  	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//	  	    		WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.id("evidon-accept-button")));

			boolean cookiepresent = driver.findElement(By.id("_evidon-accept-button")).isDisplayed();
			if (cookiepresent == true) {

				driver.findElement(By.id("_evidon-accept-button")).click();
			} else {
				System.out.println("Popup is not there ");
			}

			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.className("mdp-navigation-global__menu-link-1"))).click().build()
					.perform();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			logger.info("Not able to locate vehicles ", e);
		}
		logger.info("Vehicle located successfully");
	}

	public static void clickSportsCarsMenu(WebDriver driver) {
		try {
//	    		JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollBy(0,250)", "");
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(mazda_filterOR.SPORTS_CAR_LOCATOR)).click().build().perform();
		} catch (NoSuchElementException e) {
			logger.info("Not able to locate sports cars ", e);
		}
		logger.info("Sports cars located successfully");
	}

	public static void carResult(WebDriver driver) {
		try {
			boolean cname = driver
					.findElement(By.xpath("//h4[@class='vehicle-nav__name'][normalize-space()='Mazda MX-5 Miata RF']"))
					.isDisplayed();
			if (cname == true) {

				System.out.println("Results are correct ");
			} else {
				System.out.println("Results are incorrect ");
			}
		} catch (NoSuchElementException e) {
			logger.info("Not able to locate sports cars as result", e);
		}
		logger.info("Sports cars results located successfully ");
	}

}
