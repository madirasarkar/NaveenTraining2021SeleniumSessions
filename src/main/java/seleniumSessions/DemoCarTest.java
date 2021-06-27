package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCarTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		By emailId = By.id("input-email");
		By passWord = By.id("input-password");
		By registerLink = By.linkText("Register");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "mady@gmail.com");
		eleUtil.doSendKeys(passWord, "test@123");
		eleUtil.doClick(registerLink);

		// br.closeBrowser();

	}

}
