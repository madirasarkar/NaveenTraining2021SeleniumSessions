package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverBasics {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\sarka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sarka\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		// WebDriver driver = new ChromeDriver();// 1.Launch the browser
		WebDriver driver = new FirefoxDriver();
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
