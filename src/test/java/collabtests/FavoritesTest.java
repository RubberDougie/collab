package collabtests;

//

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rubberdougie.collab.Cardigans;
import org.rubberdougie.collab.Favourites;
import org.rubberdougie.collab.GlobalPageMethods;

public class FavoritesTest extends GlobalPageMethods {

	private WebDriverWait wait;
	private Cardigans cardigans;

	@Before
	public void beforeFunction() {
		driver.manage().window().setSize(new Dimension(900, 900));
		driver.navigate().to("https://www2.hm.com/en_us/women/products/cardigans-sweaters.html");

		cardigans = new Cardigans(driver);

		assertTrue(cardigans.isInitialized());
	}

	@Test
	public void testAddingToFavourites() {

		/*
		 * Given handled by @Before and @BeforeClass hooks
		 */

		/*
		 * When
		 */

		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(cardigans.getFirstItemFavourite()));
		assertTrue(cardigans.isInitialized());

		cardigans.clickFirstItemFavourite();
		Favourites favourites = cardigans.navigateToFavourites();

		/*
		 * Then
		 */

		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(favourites.getFirstItemFavouriteDelete()));
		assertTrue(favourites.isInitialized());

		// you got to this, so yay passed
		int passed = 1;

		assertEquals(1, passed);
	}
}
