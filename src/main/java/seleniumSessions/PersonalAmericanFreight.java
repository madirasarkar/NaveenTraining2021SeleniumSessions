package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PersonalAmericanFreight {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.americanfreight.com/");
		driver.findElement(By.id("search")).sendKeys("washer");
		Thread.sleep(2000);
		driver.switchTo().frame(4).close();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@id='closeIconContainer']")).click();
	}

}
