package TestCases;

import org.testng.annotations.Test;

import pageObject.RegisterNewUser;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.Constants;

public class ToVerifyRegisterPage extends BaseClass {

	@Test
	public static void registerPage() throws Exception {

		RegisterNewUser registerPg = new RegisterNewUser(driver);
		registerPg.myAccount().click();
		registerPg.register().click();
		System.out.println("Page Title: " + driver.getTitle());
		registerPg.firstName().sendKeys(Constants.firstName); // Special characters are also accepted which it shouldnt
		registerPg.lastName().sendKeys(Constants.lastName); // Special characters are also accepted which it shouldnt
		registerPg.email().sendKeys(Constants.email);
		registerPg.password().sendKeys(Constants.password);// spaces are accepted which it shouldnt
		CommonUtilities.waitt(driver, registerPg.checkBox(), 10);
		registerPg.continueBt().click();
		Thread.sleep(1000);
		CommonUtilities.takeSS(driver, Constants.destination);// registration fail due the wrong style of emailId

	}

}
