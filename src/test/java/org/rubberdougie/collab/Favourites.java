package org.rubberdougie.collab;

// https://www2.hm.com/en_us/favourites

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Favourites extends PageObject {
	@FindBy(xpath = "//*[@id=\"0677930023\"]/div[3]/button[2]")
	private WebElement firstItemFavouriteDelete;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/h1")
	private WebElement favouritesHeading;

	public Favourites(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return favouritesHeading.isDisplayed();
	}

	public WebElement getFavouritesHeading() {
		return favouritesHeading;
	}

	public WebElement getFirstItemFavouriteDelete() {
		return firstItemFavouriteDelete;
	}
}
