package TestCases;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.Constants;

public class ToVerifyHomepage extends BaseClass {

	public static Logger log;

	@Test(priority = -1)
	public void toVerifyHeader() throws Exception {
		
		log = LogManager.getLogger(ToVerifyHomepage.class);
		HomePage homepage = new HomePage(driver);
		System.out.println("Current Currency: " + homepage.currencytext().getText());
		log.info("Current currency is capturing");
		homepage.currency().click();
		homepage.euroCurrency().click();
		System.out.println("Current Currency: " + homepage.currencytext().getText());
		log.info("Currency is capturing after clicking on Euro");
		homepage.currency().click();
		homepage.poundCurrency().click();
		System.out.println("Current Currency: " + homepage.currencytext().getText());
		log.info("Currency is capturing after clicking on Pound");

		homepage.contactPg().click();
		System.out.println("Page Title: " + driver.getTitle());

		homepage.accountPg().click();
		for(int i = 0; i<homepage.accountpgDd().size(); i++) {
			homepage.accountpgDd().get(i).click();
			System.out.println("Page Title: " + driver.getTitle());
			homepage.accountPg().click();
		}

		homepage.wishList().click();
		System.out.println("Page Title: " + driver.getTitle());

		homepage.cart().click();
		System.out.println("Page Title: " + driver.getTitle());

		homepage.checkOut().click();
		System.out.println("Page Title: " + driver.getTitle());

	}

	@Test(priority = 0)
	public void toVerifyMeanubar() throws Exception {
		HomePage homepage = new HomePage(driver);
		CommonUtilities.actionClass(driver, homepage.desktops());
		for (int i = 0; i < homepage.desktopsSub().size(); i++) {
			Thread.sleep(1000);
			homepage.desktopsSub().get(i).click();
			System.out.println(driver.getTitle());
			homepage.desktops().click();
		}
		Thread.sleep(2000);
		CommonUtilities.actionClass(driver, homepage.laptops());
		for (int i = 0; i < homepage.laptopsSub().size(); i++) {
			Thread.sleep(1000);
			homepage.laptopsSub().get(i).click();
			System.out.println(driver.getTitle());
			homepage.laptops().click();
		}
		Thread.sleep(2000);
		CommonUtilities.actionClass(driver, homepage.components());
		for (int i = 0; i < homepage.componentsSub().size(); i++) {
			Thread.sleep(1000);
			homepage.componentsSub().get(i).click();
			System.out.println(driver.getTitle());
			homepage.components().click();
		}

		CommonUtilities.actionClass(driver, homepage.tablets());
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		CommonUtilities.actionClass(driver, homepage.software());
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		CommonUtilities.actionClass(driver, homepage.phones());
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		CommonUtilities.actionClass(driver, homepage.cameras());
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		CommonUtilities.actionClass(driver, homepage.players());
		for (int i = 0; i < homepage.playersSub().size(); i++) {
			Thread.sleep(1000);
			homepage.playersSub().get(i).click();
			System.out.println(driver.getTitle());
			homepage.players().click();
		}
	}

	@Test(priority = 1)
	public void carouselItems() throws Exception {

		HomePage homepage = new HomePage(driver);
		CommonUtilities.actionClass(driver, homepage.carousel());
		for (int i = 0; i <= Constants.carouselNum; i++) {
			Thread.sleep(2000);
			homepage.carouselNext().click();
		}
		
		CommonUtilities.takeSS(driver, Constants.destination);

		CommonUtilities.actionClass(driver, homepage.carousel());
		for (int i = 0; i <= Constants.carouselNum; i++) {
			Thread.sleep(2000);
			homepage.carouselPrev().click();
		}
		
		CommonUtilities.takeSS(driver, Constants.destination);

	}

	@Test(priority = 2)
	public void featuredItems() throws Exception {
		HomePage homepage = new HomePage(driver);
		CommonUtilities.scrollByElement(driver, homepage.featuredItems());

		CommonUtilities.assertion(homepage.item1().getText(), Constants.Item1,
				"The Expected Item1 MacBook was not found");
		System.out.println(homepage.item1().getText());

		CommonUtilities.assertion(homepage.item2().getText(), Constants.Item2,
				"The Expected Item2 iPhone was not found");
		System.out.println(homepage.item2().getText());

		CommonUtilities.assertion(homepage.item3().getText(), Constants.Item3,
				"The Expected Item3 Apple Cinema 30\" was not found");
		System.out.println(homepage.item3().getText());

		CommonUtilities.assertion(homepage.item4().getText(), Constants.Item4,
				"The Expected Item3 Canon EOS 5D was not found");
		System.out.println(homepage.item4().getText());

	}

	@Test(priority = 3)
	public void footer() throws Exception {

		HomePage homepage = new HomePage(driver);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CommonUtilities.scrollByElement(driver, homepage.scrolltoFooter());
		for (int i = 0; i < homepage.footer().size(); i++) {
			System.out.println("Page Title: " + homepage.footer().get(i).getText());
			Thread.sleep(1000);
			homepage.footer().get(i).click();
			CommonUtilities.scrollByElement(driver, homepage.scrolltoFooter());
		}

	}

}
