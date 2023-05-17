package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisterNewUser {
	
public WebDriver driver;
	
	private By myAccount = By.xpath("//span[text()='My Account']");
	//private By login = By.xpath("//a[text()='Login']");
	private By register = By.xpath("//a[text()='Register']");
	private By firstName = By.xpath("//input[@id='input-firstname']");
	private By lastName = By.xpath("//input[@id='input-lastname']");
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By checkBox = By.xpath("//div//input[@type='checkbox']");
	private By continueBt = By.xpath("//button[@type='submit']");
	
	
	public RegisterNewUser(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement myAccount() {
		return driver.findElement(myAccount);
		
	}
	
	public WebElement register() {
		return driver.findElement(register);
		
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
		
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
		
	}
	
	public WebElement email() {
		return driver.findElement(email);
		
	}
	
	public WebElement password() {
		return driver.findElement(password);
		
	}
	
	public WebElement checkBox() {
		return driver.findElement(checkBox);
		
	}
	
	public WebElement continueBt() {
		return driver.findElement(continueBt);
		
	}


}
