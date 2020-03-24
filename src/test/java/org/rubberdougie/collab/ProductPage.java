package org.rubberdougie.collab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

	@FindBy(xpath = "/html/body/header/nav/a[2]")
	private WebElement homepageLink;
	
	@FindAll({
		@FindBy(xpath = "//*[@id=\"picker-1\"]/ul/li")
	})
	private List<WebElement> sizeListElements;
	
	@FindBy(xpath = "//*[@id=\"picker-1\"]/button")
	private WebElement sizeListOpener;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li[4]/span/a/span")
	private WebElement shoppingCartCount;
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean addProductToCart(int size) {
		sizeListOpener.click();
		WebElement sizeButtonContainer = sizeListElements.get(size + 1);
		WebElement sizeButton = sizeButtonContainer.findElement(By.xpath(".//div/button"));
		sizeButton.click();
		addToCartButton.click();
		return true;
	}
	
	public int[] getProductSizes() {
		int numberOfElements = sizeListElements.size();
		int[] sizes = new int[numberOfElements - 1];
		for(int i = 0; i < sizes.length; i++) {
			sizes[i] = i;
		}
		return sizes;
	}
	
	public WebElement getShoppingCartCount() {
		return shoppingCartCount;
	}
	
	public boolean isInitialized() {
		return homepageLink.isDisplayed();
	}
	
	public WebElement getHomepageLink() {
		return homepageLink;
	}
	
}
