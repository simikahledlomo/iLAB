package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetInTouchPage {
	WebDriver driver;

	@FindBy(xpath = ".//div[@class = 'et_pb_blurb_container']//a [text() = 'Careers']")
	WebElement Careers;
	
	@FindBy(xpath = ".//div [@class = 'cky-notice-btn-wrapper']//button [@class = 'cky-btn cky-btn-accept']")
	WebElement Cookies;

	public GetInTouchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLink() {
		return this.Careers;
	}
	
	public void clickCareers() throws Exception {
		this.Careers.click();
	}
	
	public WebElement getCookies() {
		return this.Cookies;
	}
	
	public void clickCookies() throws Exception {
		this.Cookies.click();
	}
}
