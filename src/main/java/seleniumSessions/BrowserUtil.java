package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	/**
	 * This browser will initialize the driver on the basis of givern browser name
	 */
	public WebDriver driver;

	public WebDriver initDriver(String browserName) {

		System.out.println("Browser name is: " + browserName);
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edgee":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Browser not found..please pass the correct browser");
			break;
		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url == null)
			return;
		if (url.isEmpty())
			return;
		driver.get(url);

	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
