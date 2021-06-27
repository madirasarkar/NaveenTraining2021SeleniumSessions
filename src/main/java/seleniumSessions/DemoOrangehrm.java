package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoOrangehrm {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By firstName = By.id("Form_submitForm_FirstName");
		By lastName = By.id("Form_submitForm_LastName");
		By emailId = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By companyName = By.id("Form_submitForm_CompanyName");
		By phoneNumber = By.id("Form_submitForm_Contact");
		//By dummyDataCheck = By.id("Form_submitForm_SetDummyData");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Lionel");
		eleUtil.doSendKeys(lastName, "Richie");
		eleUtil.doSendKeys(emailId, "hello@gmail.com");
		eleUtil.doSendKeys(jobTitle, "Singer");
		eleUtil.doSendKeys(companyName, "SoftRock");
		eleUtil.doSendKeys(phoneNumber, "1234567890");
		// eleUtil.doClick(dummyDataCheck);
	}

}
