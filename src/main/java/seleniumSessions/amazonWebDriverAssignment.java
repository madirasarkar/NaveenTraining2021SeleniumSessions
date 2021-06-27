package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonWebDriverAssignment {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\sarka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		 //System.setProperty("webdriver.gecko.driver",
		 //"C:\\Users\\sarka\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		 System.setProperty("webdriver.edge.driver",
		 "C:\\Users\\sarka\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		//WebDriver driver = new ChromeDriver();// 1. launch browser
		// WebDriver driver = new FirefoxDriver();
		 WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");// 2.launch URL
		String title = driver.getTitle();// 3.get the title of the page
		System.out.println(title);

		// verification point/check point/ actual vs expected result

		if (title.startsWith("Amazon.com: Online Shopping for Electronics, Apparel, Computers")) {
			System.out.println("The tittle is correct");
		} else {
			System.out.println("The title is not correct");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.amazon.com/")) {
			System.out.println("The url is correct");
		} else {
			System.out.println("The url is not correct");
		}
		// System.out.println(driver.getPageSource());
		// driver.close();
		driver.quit();

	}

}
