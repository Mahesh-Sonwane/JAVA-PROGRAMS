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
import eCommerce.Amazon.SearchPage;

public class SearchPageTest extends BaseClass 
   {
	
	@DataProvider(name = "VSearch")
	public Object[][] validSearch() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Search");
	}

//	@DataProvider(name = "InSearch")
//	public Object[][] InvalidSearch() throws InvalidFormatException, IOException {
//		return ExcelUtil.getData("Invalid_Search");
//	}
	
	@Test(dataProvider = "VSearch", priority = 1)
		public void verifySearch(String search) throws InvalidFormatException, IOException 
		{
		// LoginTest.validLoginTest(email, pw);
			SearchPage sp = new SearchPage(driver);
			sp.searchProduct(search);
			
			int add_cartCount = sp.ValidSearch.size();
			if(add_cartCount > 0)
			{
				AssertJUnit.assertTrue(true);
			}

		}

//		@Test(dataProvider = "InSearch", priority = 2)
//		public void InvalidSearchTest(String search) throws InvalidFormatException, IOException {
//			// LoginTest.validLoginTest(email, pw);
//				SearchPage sp = new SearchPage(driver);
//				sp.searchProduct(search);
//				
//				String invalid = sp.InvalidSearch.getText();
//				Assert.assertEquals("No results for", invalid);
//		}
		
}
