package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	
	@FindBy(xpath = ".//nav[@id= 'top-menu-nav']//a[text()= 'Get in Touch' ]")
	WebElement GetIntouch;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickGetInTouchLink() {
		this.GetIntouch.click();
	}
}