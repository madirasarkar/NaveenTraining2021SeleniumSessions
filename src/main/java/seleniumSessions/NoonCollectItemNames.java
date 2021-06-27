package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoonCollectItemNames {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		List<String> itemsList = new ArrayList<String>();
		List<WebElement> items = driver
				.findElements(By.xpath(("(//div[@class='swiper-wrapper'])[2]//div[@data-qa='product-name']")));

		// for (int i = 0; i < items.size() - 1; i++) {
		// String itemInfo = items.get(i).getText();
		// itemsList.add(itemInfo);

		// }
		// System.out.print(itemsList.toString() + " ");
		int j = 0;
		while (true) {

			try {
				for (int i = 0; i < items.size(); i++) {
					String itemInfo = items.get(i).getText();
					itemsList.add(itemInfo);

				}
				System.out.println(itemsList.toString() + " ");

				driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next')])[2]")).click();

			} catch (Exception e) {
				System.out.println("pagination is over.....and dint find any contact");
				break;
			}

			items = driver
					.findElements(By.xpath(("(//div[@class='swiper-wrapper'])[2]//div[@data-qa='product-name']")));

		}
		j++;

	}

}
