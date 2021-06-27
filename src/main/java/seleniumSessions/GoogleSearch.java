package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen AutomationLabs");
		Thread.sleep(2000);
		// ul[@role='listbox']//div[@class='pcTkSc']
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='pcTkSc']"));
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			System.out.println(e.getText());
			if (e.getText().equals("naveen automationlabs youtube")) {
				e.click();
				break;
			}

		}

	}

}
