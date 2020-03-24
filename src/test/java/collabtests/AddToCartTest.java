package collabtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rubberdougie.collab.Favourites;
import org.rubberdougie.collab.GlobalPageMethods;
import org.rubberdougie.collab.ProductPage;

public class AddToCartTest extends GlobalPageMethods {

	private WebDriverWait wait;
	private ProductPage productPage;

	@Before
	public void beforeFunction() {
		driver.manage().window().setSize(new Dimension(900, 900));
		driver.navigate().to("https://www2.hm.com/en_us/productpage.0687635001.html");

		productPage = new ProductPage(driver);

		assertTrue(productPage.isInitialized());
	}
	
	@Test
	public void testAddingToFavourites() {

		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(productPage.getHomepageLink()));
		assertTrue(productPage.isInitialized());

		int[] sizes = productPage.getProductSizes();
		for(int size: sizes) {
			productPage.addProductToCart(size);
		}
	}
}
