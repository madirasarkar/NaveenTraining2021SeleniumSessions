package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);

		// Xpath Axes:
		// child to parent: backward traversing in xpath
		// input[@id='username']/../../../../../../../../../..
		// input[@id='username']/..
		// input[@id='username']/parent::div

		// parent to child:
		// div[@class='private-form__input-wrapper']/input
		// div[@class='private-form__input-wrapper']/child::input[@id='username']

		// parent to ancestor:
		// input[@id='username']/ancestor::div
		// select checkbox for the common names:
		// (//a[text()='Contact User 1 New1'])/parent::td//preceding-sibling::td/input

		// className : form-control private-form__control login-email
//		By.className("form-control private-form__control login-email");//not valid
//		By.className("login-email");//valid
//		//xpath
//		By.xpath("//input[@class='form-control private-form__control login-email']");
//		//cssSelector
//		By.cssSelector("input.form-control.private-form__control.login-email");

		// a[text()='Apple
		// Malvia']/parent::td/preceding-sibling::td/child::input[@type='checkbox' and
		// @name='contact_id']
		// a[text()='Bogus
		// Otani']/parent::td/preceding-sibling::td/child::input[@type='checkbox' and
		// @name='contact_id']
		// selectContact("Apple Malvia");
		// selectContact("Bogus Otani");

		// getContactNumbers("Apple Malvia");

		// System.out.println(getContactNumbers("Apple Malvia"));

		getContactNumbers("Apple Malvia").stream().forEach(e -> System.out.println(e + " "));

	}

	public static void selectContact(String name) {
		String checkBoxXpath = "//a[text()='" + name
				+ "']/parent::td/preceding-sibling::td/child::input[@type='checkbox' and @name='contact_id']";
		driver.findElement(By.xpath(checkBoxXpath)).click();
	}

	public static String getContactCompName(String name) {
		String compXpath = "//a[text()='" + name + "']/parent::td/following-sibling::td/a[@context='company']";
		return driver.findElement(By.xpath(compXpath)).getText();
	}

	public static List<String> getContactNumbers(String name) {
		/*
		 * String contactNumbers = "//a[contains(text(),'" + name +
		 * "')]/parent::td/following-sibling::td/following-sibling::td/span[@context='phone']";
		 * return driver.findElements(By.xpath(contactNumbers));
		 */
		List<String> contactInfoList = new ArrayList<String>();
		List<WebElement> contactList = driver
				.findElements(By.xpath("//a[contains(text(),'" + name + "')]/parent::td/following-sibling::td"));
		for (int i = 1; i < contactList.size() - 1; i++) {
			String contactInfo = contactList.get(i).getText();
			contactInfoList.add(contactInfo);
		}
		return contactInfoList;

	}

}