package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class dashBoardPage {

	WebDriver driver;

	public dashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement dashBoard_Element;

	public void validateDashBoard(String validationText) {
		Assert.assertEquals(dashBoard_Element.getText(), validationText, "dash not available");

	}
}
