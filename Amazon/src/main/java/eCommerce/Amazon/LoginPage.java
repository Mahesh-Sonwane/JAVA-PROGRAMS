package eCommerce.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
          WebDriver driver;
	
	// step 1
	@FindBy(id= "ap_email_login")
	WebElement emailId;
	
	@FindBy(id = "continue")
	WebElement continueLogin;
	
	@FindBy(id= "ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
    WebElement signInButton;
	
	@FindBy(id = "nav-global-location-slot")
	public WebElement AmazonLogo;
	
	@FindBy(xpath = "//h4[contains(text(),\"There was a problem\")]")
   public WebElement InvalidPwddd;	
	


	//step 2
	public void SignIn(String emailidd, String passwordd)
	{
		emailId.sendKeys(emailidd);
		continueLogin.click();
		password.sendKeys(passwordd);
		signInButton.click();
	}
	
	//step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
