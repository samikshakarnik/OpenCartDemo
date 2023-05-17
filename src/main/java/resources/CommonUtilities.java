package resources;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities extends BaseClass {

	public static WebDriver driver;

	
	public static void actionClass(WebDriver driver, WebElement meanubar) {

		Actions action = new Actions(driver);
		action.moveToElement(meanubar).build().perform();

	}

	public static void waitt(WebDriver driver, WebElement waitElement, int timeOutSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(waitElement));
		waitElement.click();
	}

	public static void assertion(String act, String expt, String message) {
		
		SoftAssert softassert = new SoftAssert();
		String actual = act;
		//String expected = expt;
		softassert.assertEquals(actual, expt, message);
		softassert.assertAll();
	
	}
	
	public static void scrollByElement(WebDriver driver, WebElement Element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	
	}

	public static void takeSS(WebDriver driver, String destination) throws Exception {
	TakesScreenshot ss = ((TakesScreenshot)driver);
	File srcfile = ss.getScreenshotAs(OutputType.FILE);
	File desfile = new File(destination);
	FileUtils.copyFile(srcfile, desfile);
	
	}

}
