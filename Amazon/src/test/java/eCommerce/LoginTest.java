package eCommerce;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilityPkg.ExcelUtil;
import eCommerce.Amazon.BaseClass;
import eCommerce.Amazon.HomePage;
import eCommerce.Amazon.LoginPage;

public class LoginTest extends BaseClass {

	@DataProvider(name = "VLogin")
	public Object[][] validtest() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Login");
	}

	@DataProvider(name = "InvLogin")
	public Object[][] Invalidtest() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Invalid_login");
	}

	@Test(dataProvider = "VLogin", priority = 1)
	public static void validLoginTest(String email, String pw) throws InvalidFormatException, IOException 
	{
		HomePage hp = new HomePage(driver);
		hp.accountListing(driver);
		hp.SigninClick();
		
		LoginPage lo = new LoginPage(driver);
		
		lo.SignIn(email, pw);
		AssertJUnit.assertTrue(lo.AmazonLogo.isDisplayed()); 

	}

	@Test(dataProvider = "InvLogin", priority = 2)
	public void InvalidLoginTest(String email, String pw) throws InvalidFormatException, IOException {
		HomePage hp = new HomePage(driver);
		hp.accountListing(driver);
		hp.SigninClick();
		LoginPage lo1 = new LoginPage(driver);

		lo1.SignIn(email, pw);

		String invalidPwText = lo1.InvalidPwddd.getText();

		AssertJUnit.assertEquals(invalidPwText, "There was a problem");

	}
}
