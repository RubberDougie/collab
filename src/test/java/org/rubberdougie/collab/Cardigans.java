package org.rubberdougie.collab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// https://www2.hm.com/en_us/women/products/cardigans-sweaters.html

public class Cardigans extends PageObject {

	@FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[2]/div[1]/div/div/div[2]/section/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div/section/div[1]/div/div/div/div[2]/div/div[2]/dl/dd[1]/ul/li[1]/a/button")
	private WebElement gastroSearchButton;

	@FindBy(xpath = "/html/head/meta[2]")
	private WebElement url;

	public Cardigans(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return url.getAttribute("content").contains("https://www.cochranelibrary.com");
	}

	public CochraneLibraryTopicSearchResult gastroSearch() {
		gastroSearchButton.click();
		return new CochraneLibraryTopicSearchResult(driver);
	}

	public WebElement getGastroSearchButton() {
		return gastroSearchButton;
	}
}
