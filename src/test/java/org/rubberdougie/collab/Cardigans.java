package org.rubberdougie.collab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// https://www2.hm.com/en_us/women/products/cardigans-sweaters.html

public class Cardigans extends PageObject {

	@FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/div[3]/ul/li[1]/article/div[1]/a/div/button")
	private WebElement firstItemFavourite;

	@FindBy(xpath = "/html/body/header/nav/ul[1]/li[3]/a")
	private WebElement favouritesButton;

	public Cardigans(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return firstItemFavourite.isDisplayed();
	}

	public Favourites navigateToFavourites() {
		clickFavouritesText();
		return new Favourites(driver);
	}

	public WebElement getFirstItemFavourite() {
		return firstItemFavourite;
	}

	private void clickFavouritesText() {
		Actions actions = new Actions(driver);
		actions.moveToElement(favouritesButton).click().perform();
	}

	public void clickFirstItemFavourite() {
		Actions actions = new Actions(driver);
		actions.moveToElement(firstItemFavourite).click().perform();
	}
}
