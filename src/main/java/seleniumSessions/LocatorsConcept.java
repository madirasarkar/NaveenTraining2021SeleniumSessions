package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// 1.By ID:
		// driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Testing");
		// driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Selenium");

		// 2nd
		// WebElement firstName =
		// driver.findElement(By.id("Form_submitForm_FirstName"));
		// WebElement lastName = driver.findElement(By.id("Form_submitForm_LastName"));

		// firstName.sendKeys("testing");
		// lastName.sendKeys("Selenium");

		// 3rd
		// By Locators
//		By firstName = By.id("Form_submitForm_FirstName");
//		By lastName = By.id("Form_submitForm_LastName");
//
//		driver.findElement(firstName).sendKeys("Testing");
//		driver.findElement(lastName).sendKeys("Selenium");

		// 4th
		By firstName = By.id("Form_submitForm_FirstName");
		By lastName = By.id("Form_submitForm_LastName");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By emailId = By.id("Form_submitForm_Email");
//
//		getElement(firstName).sendKeys("Testing");
//		getElement(lastName).sendKeys("Selenium");

		// 5th

		doSendKeys(firstName, "Testing");
		doSendKeys(lastName, "Selenium");
		doSendKeys(jobTitle, "QA");
		doSendKeys(emailId, "testing@gmail.com");

		// 6th
		// ElementUtil Lib

		// 2. linktext: only for links
		// 3. tagname
	}

//generic utility
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

//generic utility
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

}
