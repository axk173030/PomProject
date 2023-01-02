package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addCustomerPage {
	WebDriver driver;
	public addCustomerPage(WebDriver driver) {
		this.driver= driver;
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement customer_Element;
@FindBy(how =How.XPATH,using ="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement add1_Element;
@FindBy(how=How.XPATH, using ="//*[@id=\"account\"]") WebElement firstName_Element;	
	
	
	
	public void clickaddCustomer() {
	customer_Element.click();
	
}
	public void add1() {
		 add1_Element.click();
		
	}
	public void enterFirstName(String firstName) {
		firstName_Element.sendKeys(firstName);
		
	}
}
