package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerOpportunities {
	WebDriver driver;

	@FindBy(xpath = "//h4[@class='et_pb_module_header']//a[contains(@href,'/south-africa/')]")
	WebElement locationLink;

	public CareerOpportunities(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return this.locationLink;
	}
	public void clickLocationLink() {
		locationLink.click();
	}
}
