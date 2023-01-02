package PageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.addCustomerPage;
import Pages.dashBoardPage;
import Util.BrowserFactory;

/**
 * @author rsvac
 *
 */
public class LoginPageTest {
	
	WebDriver driver;
	@Test
	public void ValidUserShouldBeableToLogin() throws InterruptedException {
		driver =BrowserFactory.init();
	//LoginPage loginpage= 	new LoginPage();
		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
	loginpage.insertUsername("demo@techfios.com");
	Thread.sleep(2000);
	loginpage.insertPassword("abc123");
	Thread.sleep(2000);
	loginpage.elickSininButton();
	
		
	dashBoardPage dpage = PageFactory.initElements(driver, dashBoardPage.class);
	dpage.validateDashBoard("Dashboard");
	Thread.sleep(2000);
	
	addCustomerPage addCus = PageFactory.initElements(driver, addCustomerPage.class);
	addCus.clickaddCustomer();
	Thread.sleep(2000);
	addCus.add1();
	Thread.sleep(2000);
	addCus.enterFirstName("Aaaaaa");
	Thread.sleep(2000);
	
	BrowserFactory.tearDown();

}
	private void DisplaydashBoard() {
		// TODO Auto-generated method stub
		
	}
}
