package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//nav[@id= 'top-menu-nav']//a[text()= 'Get in Touch' ]")
	WebElement GetIntouch;
	
	@FindBy(xpath = ".//div[@class = 'et_pb_blurb_container']//a [text() = 'Careers']")
	WebElement Careers;
	
	@FindBy(xpath = ".//div [@class = 'cky-notice-btn-wrapper']//button [@class = 'cky-btn cky-btn-accept']")
	WebElement Cookies;
	
	@FindBy(xpath =".//div [@class = 'et_pb_text_inner'] // h4")
	WebElement OurTeamText;
	
	@FindBy(xpath = ".//div[@class = 'et_pb_blurb_container']//a [text() = 'South Africa']")
	WebElement SouthAfrica;
	
	@FindBy(xpath = "//div [ @class = 'et_pb_row et_pb_row_1']// div [@class = 'et_pb_text_inner']//ul/li[1]")
	WebElement FirstJob;
	
	@FindBy(xpath = "//div [@class = 'et_pb_text_inner'] //h3 [text() = 'Apply Now']")
	WebElement ApplyNow;
	
	@FindBy(name = "firstname")
	WebElement Firstname;
	
	@FindBy(name = "lastname")
	WebElement Lastname;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name = "phone")
	WebElement Phone;
	
	@FindBy(name = "message")
	WebElement Message;
	
	@FindBy(xpath = "//input [@type = 'submit']")
	WebElement SubmitBtn;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickGetIntouch () {
		this.GetIntouch.click();
	}
	
	public void clickCookies () {
		this.Cookies.click();
	}
	
	public void clickCareers () {
		this.Careers.click();
	}
	
	public WebElement getOurTeamText() {
		return this.OurTeamText;
	}
	public void clickSouthAfrica () {
		this.SouthAfrica.click();
	}
	
	public WebElement  getFirstJob () {
		return this.FirstJob;
	}
	
	public void clickFirstJob () {
		this.FirstJob.click();
	}
	
	public WebElement getApplyNow () {
		return this.ApplyNow;
	}
	
	public void enterFirstname (String Firstname) {
		this.Firstname.sendKeys(Firstname);
	}
	
	public void enterLastname (String Lastname) {
		this.Lastname.sendKeys(Lastname);
	}

	public void enterEmail (String Email) {
		this.Email.sendKeys(Email);
	}

	public void enterPhone (String Phone) {
		this.Phone.sendKeys(Phone);	
	}

	public void enterMessage (String Message) {
		this.Message.sendKeys(Message);
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click();
	}

}
