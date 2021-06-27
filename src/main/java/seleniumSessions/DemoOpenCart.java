package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoOpenCart {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By eMail = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		By privacyPolicy = By.name("agree");

		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(firstName, "Tom");
		ele.doSendKeys(lastName, "Hanks");
		ele.doSendKeys(eMail, "ton@hotmail.com");
		ele.doSendKeys(telephone, "0987654321");
		ele.doSendKeys(password, "123");
		ele.doSendKeys(confirmPwd, "123");
		ele.doClick(privacyPolicy);
	}

}
