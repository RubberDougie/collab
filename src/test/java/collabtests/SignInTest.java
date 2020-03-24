package collabtests;

import org.junit.Test;
import org.rubberdougie.collab.GlobalPageMethods;
import org.rubberdougie.collab.SignInPage;

import static org.junit.Assert.assertEquals;
public class SignInTest extends GlobalPageMethods{
	@Test
 	public void user_opens_signup_page(){
		driver.get("https://www2.hm.com/en_us/index.html");
		SignInPage signIn = new SignInPage(driver);
		signIn.enterSignIn("a@gmail.com", "pass");
		assertEquals("Wrong email or password, please try again.", signIn.getConfirmationHeader());
  }l
}