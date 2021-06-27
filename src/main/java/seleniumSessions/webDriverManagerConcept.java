package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerConcept {

	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();// 1.Launch the browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");// 2.launch URL
		String title = driver.getTitle();// 3.get the title of the page
		System.out.println(title);

		driver.quit();

	}

}
