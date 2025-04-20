package eCommerce;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import eCommerce.Amazon.BaseClass;
import eCommerce.Amazon.HomePage;

public class HomePageTest extends BaseClass  

{
	@Test 
	public void testHomePage()
	{
		HomePage hp1 = new HomePage(driver);
		hp1.accountListing(driver);
		hp1.SigninClick();
	}
}