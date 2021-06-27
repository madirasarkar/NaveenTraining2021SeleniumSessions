package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionListHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(4000);
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			System.out.println(e.getText());
			if (e.getText().equals("T-shirts > Faded Short Sleeve T-shirts")) {
				e.click();
				break;
			}

		}
		if (driver.getTitle().contains("Faded Short Sleeve T-shirts")) {
			System.out.println("Correct result page");
		} else {
			System.out.println("Incorrect result page");
		}
		// System.out.println(driver.getTitle());
	}
}
