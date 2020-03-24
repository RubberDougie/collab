package org.rubberdougie.collab;

// https://www2.hm.com/en_us/favourites

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Favourites extends PageObject {
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/div[3]/ul/li[1]/article/div[1]/a/div/button")
	private WebElement firstItemFavorite;

	public Favourites(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return cochraneReviewsTab.isDisplayed();
	}

	public WebElement getCochraneReviewsTab() {
		return cochraneReviewsTab;
	}

	public WebElement getTopicTitle1() { // should make a parameterized version taking in the name
		return topicTitle1;
	}
}
