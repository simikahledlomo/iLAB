package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sharedServices.PublicFunction;
import sharedServices.PublicFunctions;

public class FirstAvailablePost {
	WebDriver driver;
	PublicFunctions  pf = new PublicFunctions();
	

	@FindBy(xpath = "//h3[contains(text(),'Apply Now')]")
	WebElement applicationForm;
	
	@FindBy(xpath = "//iframe[@id='hs-form-iframe-0']")
	WebElement iFrame;
	
	@FindBy(xpath ="//div[@class='input']//input[@id='firstname-91269253-d0ea-4409-a821-873cda679554']")
	WebElement firstName;
	
	@FindBy(name ="lastname")
	WebElement lastname;
	
	@FindBy(name ="email")
	WebElement email;
	
	@FindBy(name ="phone")
	WebElement phone;
	
	@FindBy(name ="message")
	WebElement message;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement btnsubmit;
	
	public FirstAvailablePost(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getApplicationForm() {
		return this.applicationForm;
	}
	
	public WebElement getiFrame() {
		return this.iFrame;
	}
	
	public void enterFirstName(String firstname) {
		this.firstName.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	
	public void enteremail(String email) {
		this.email.sendKeys(email);
	}
	
	public void enterphone() {
		this.phone.sendKeys(PublicFunctions.getCellNumber());
	}
	
	public void entermessage(String message) {
		this.message.sendKeys(message);
	}
	
	public WebElement getBtnSubmit() {
		return this.btnsubmit;
	}
	public void clickbtnsubmit() {
		this.btnsubmit.click();
	}
}
