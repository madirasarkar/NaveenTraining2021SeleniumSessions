package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopHandle {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		String userName = "admin";
		String password = "admin";

		driver.get("https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
