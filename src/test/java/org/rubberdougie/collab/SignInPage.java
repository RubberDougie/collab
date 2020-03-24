package org.rubberdougie.collab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends PageObject {

	public SignInPage(WebDriver driver){
		super(driver);
	}
 
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li[1]/div/a[1]")
	private WebElement signIn;
 
	@FindBy(xpath = "//*[@id=\"modal-txt-signin-email\"]")
	private WebElement email;
  
	@FindBy(xpath = "//*[@id=\"modal-txt-signin-password\"]")
	private WebElement passWord;
 
	@FindBy(xpath = "//*[@id=\"modal-theLoginForm\"]/button")
	private WebElement signInButton;
 
	@FindBy(id = "modal-txt-signin-password-unknown-error-type-error")
	private WebElement receipt;

	
	public void enterSignIn(String email, String passWord){
		signIn.click();
		this.email.sendKeys(email);
		this.passWord.sendKeys(passWord);
		signInButton.click();
	}
	public String getConfirmationHeader(){
		return receipt.getText();
	}
}