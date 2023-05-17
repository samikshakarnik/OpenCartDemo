package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	public WebDriver driver;
	
	//Header data
	private By currency = By.xpath("//span[normalize-space()='Currency']");
	private By euroCurrency = By.xpath("(//ul[@class='dropdown-menu show']//li//a)[1]");
	private By currencytext = By.xpath("//div[@class='dropdown']//a//strong");
	private By poundCurrency = By.xpath("(//ul[@class='dropdown-menu show']//li//a)[2]");
	//private By dollarCurrency = By.xpath("(//ul[@class='dropdown-menu show']//li//a)[3]");
	//private By headerList = By.xpath("(//ul[@class='list-inline'])[2]//li//a");
	private By contactPg = By.xpath("//i[@class='fas fa-phone']");
	private By accountPg = By.xpath("//span[normalize-space()='My Account']");
	private By accountpgDd = By.xpath("(//li[@class='list-inline-item'])[4]//li//a");
	private By wishList = By.xpath("//span[normalize-space()='Wish List (0)']");
	private By cart = By.xpath("//span[normalize-space()='Shopping Cart']");
	private By checkOut = By.xpath("//span[normalize-space()='Checkout']");
	
	
	
	public HomePage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement currency() {
		return driver.findElement(currency);
	}
	
	public WebElement euroCurrency() {
		return driver.findElement(euroCurrency);
	}
	
	public WebElement poundCurrency() {
		return driver.findElement(poundCurrency);
	}
	
	public WebElement currencytext() {
		return driver.findElement(currencytext);
	}
	
//	public List<WebElement> headerList() {
//		return driver.findElements(headerList);
//	}
	
	public WebElement contactPg() {
		return driver.findElement(contactPg);
	}
	
	public WebElement accountPg() {
		return driver.findElement(accountPg);
	}
	
	public List<WebElement> accountpgDd() {
		return driver.findElements(accountpgDd);
	}
	
	public WebElement wishList() {
		return driver.findElement(wishList);
	}
	
	public WebElement cart() {
		return driver.findElement(cart);
	}
	
	public WebElement checkOut() {
		return driver.findElement(checkOut);
	}
	
	
	//MenuBar 
	private By desktops = By.xpath("(//a[text()='Desktops'])[1]");
	private By desktopsSub = By.xpath("//ul[@class='nav navbar-nav']//li[1]//ul//li");
	private By laptops = By.xpath("//a[text()='Laptops & Notebooks']");
	private By laptopsSub = By.xpath("//ul[@class='nav navbar-nav']//li[2]//ul//li");
	private By components = By.xpath("//a[text()='Components']");
	private By componentsSub = By.xpath("//ul[@class='nav navbar-nav']//li[3]//ul//li");
	private By tablets = By.xpath("//a[text()='Tablets']");
	private By software = By.xpath("//a[text()='Software']");
	private By phones = By.xpath("//a[text()='Phones & PDAs']");
	private By cameras = By.xpath("//a[text()='Cameras']");
	private By players = By.xpath("//a[text()='MP3 Players']");
	private By playersSub = By.xpath("//ul[@class='nav navbar-nav']//li[8]//ul//li");
	
	
	public WebElement desktops() {
		return driver.findElement(desktops);
	}
	
	public List<WebElement> desktopsSub(){
		return driver.findElements(desktopsSub);
	}
	
	public WebElement laptops() {
		return driver.findElement(laptops);
	}
	
	public List<WebElement> laptopsSub(){
		return driver.findElements(laptopsSub);
	}
	
	public WebElement components() {
		return driver.findElement(components);
	}
	
	public List<WebElement> componentsSub(){
		return driver.findElements(componentsSub);
	}
	
	public WebElement tablets() {
		return driver.findElement(tablets);
	}
	
	public WebElement software() {
		return driver.findElement(software);
	}
	
	public WebElement phones() {
		return driver.findElement(phones);
	}
	
	public WebElement cameras() {
		return driver.findElement(cameras);
	}
	
	public WebElement players() {
		return driver.findElement(players);
	}
	
	public List<WebElement> playersSub(){
		return driver.findElements(playersSub);
	}
	
	//carousel
	private By carousel = By.xpath("//div[@id='carousel-banner-0']");
	private By carouselNext = By.xpath("//button[@class='carousel-control-next']");
	private By carouselPrev = By.xpath("//button[@class='carousel-control-prev']");
	
	
	public WebElement carousel() {
		return driver.findElement(carousel);
	}
	
	public WebElement carouselNext() {
		return driver.findElement(carouselNext);
	}
	
	public WebElement carouselPrev() {
		return driver.findElement(carouselPrev);
	}
	
	
	//Features
	private By featuredItems = By.xpath("(//div[@class='row'])[3]");
	private By item1 = By.xpath("//a[text()='MacBook']");
	private By item2 = By.xpath("//a[text()='iPhone']");
	private By item3 = By.xpath("//a[text()='Apple Cinema 30\"']");
	private By item4 = By.xpath("//a[text()='Canon EOS 5D']");
	
	public WebElement featuredItems() {
		return driver.findElement(featuredItems);
	}
	
	public WebElement item1() {
		return driver.findElement(item1);
	}
	
	public WebElement item2() {
		return driver.findElement(item2);
	}
	
	public WebElement item3() {
		return driver.findElement(item3);
	}
	
	public WebElement item4() {
		return driver.findElement(item4);
	}
	
	
	//Footer
	private By footer = By.xpath("(//footer//div[@class='row']//div//ul//li)//a");
	private By scrolltoFooter = By.xpath("//footer//div[@class='container']");
	
	
	public List<WebElement> footer() {
		return driver.findElements(footer);
	}
	
	public WebElement scrolltoFooter() {
		return driver.findElement(scrolltoFooter);
	}
	

}
