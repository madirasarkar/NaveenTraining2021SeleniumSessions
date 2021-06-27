package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class quitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sarka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// 1.Launch the browser

		driver.get("http://google.com");// 2.launch URL
		String title = driver.getTitle();// 3.get the title of the page
		System.out.println(title);

		driver.quit();
		// driver.close();
		driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
