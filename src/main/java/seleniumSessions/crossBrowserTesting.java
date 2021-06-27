package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowserTesting {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "firefox";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sarka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sarka\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sarka\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Please pass the correct browser");
		}

		driver.get("http://google.com");// 2.launch URL
		String title = driver.getTitle();// 3.get the title of the page
		System.out.println(title);

		// verification point/check point/ actual vs expected result

		if (title.equals("Google")) {
			System.out.println("The tittle is correct");
		} else {
			System.out.println("The title is not correct");
		}
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		// driver.close();
		driver.quit();
	}

}
