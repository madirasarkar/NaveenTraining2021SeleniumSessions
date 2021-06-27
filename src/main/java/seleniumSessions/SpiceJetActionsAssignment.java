package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetActionsAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement user = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		WebElement SpiceClubMembers = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));

		Actions act = new Actions(driver);

		act.moveToElement(user).perform();
		Thread.sleep(2000);
		act.moveToElement(SpiceClubMembers).perform();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//li[@class='hide-mobile']//a[text()='Member
		// Login']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		// System.out.println(driver.getCurrentUrl());
		/*********** Validation ********************/
		// 1. Log In Page
		// if
		// (driver.getCurrentUrl().equalsIgnoreCase("https://book.spicejet.com/Login.aspx"))
		// {

		// System.out.println("Landed on Member Log In Page");
		// } else {
		// System.out.println("Incorrect page");
		// }
		// 2. Registration Page
		if (driver.getCurrentUrl().equalsIgnoreCase("https://book.spicejet.com/Register.aspx")) {
			System.out.println("Landed on User Registration Page");
		} else {
			System.out.println("Incorrect page");
		}
	}
}
