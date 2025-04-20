package eCommerce.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	// Use of @FindBy to create WebElement
	// Create a method and call Selenium Functions 
	// Create a cPageFactry class and call initElements methods
	
	//step 1
	@FindBy(id = "nav-link-accountList")  //nav-link-accountList
	WebElement accountList;
	
	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signIn;
	
	//step 2
	public void accountListing(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(accountList).perform();
	}
	
	public void SigninClick()
	{
		signIn.click();
	}
	
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}


//ChromeDriver driver=new ChromeDriver();
//driver.get("https://www.airindia.com/");
//driver.manage().window().maximize();
//Thread.sleep(2000);
//WebElement e1=	driver.findElement(By.id("onetrust-accept-btn-handler"));
//e1.click();