package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rsvac\\OneDrive\\Desktop\\SeleniumFeb2022\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.techfios.com/billing/?ng=admin/");
		return driver;

	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
