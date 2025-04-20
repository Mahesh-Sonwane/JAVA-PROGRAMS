package eCommerce.Amazon;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {
	
WebDriver driver;
	
	//step 1
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id= "nav-search-submit-button")
	WebElement searchButton;
	
	@FindBy(xpath = "//span[@class=\"a-button-inner\"]/button")
	public List<WebElement> ValidSearch;
	
	@FindBy(xpath = "//span[text()='No results for ']")
	public WebElement InvalidSearch;
	
	//step2 - creating method and calling abstract methods using webElement created
	public void searchProduct(String productName)
	{
		searchbox.clear();
		searchbox.sendKeys(productName);
		searchButton.click();
	}
	
	
	//step3
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
