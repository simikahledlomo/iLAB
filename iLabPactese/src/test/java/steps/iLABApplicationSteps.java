package steps;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareerOpportunities;
import pages.FirstAvailablePost;
import pages.GetInTouchPage;
import pages.LandingPage;
import pages.LocationPage;
import pages.homePage;
import sharedServices.PublicFunction;
import sharedServices.PublicFunctions;

public class iLABApplicationSteps {
	 WebDriver driver;
	 JavascriptExecutor js;
	 LandingPage lp;
	 GetInTouchPage gtp;
	 CareerOpportunities co;
	 LocationPage lop;
	 FirstAvailablePost fap;
	 PublicFunction pf;
	 PublicFunctions nn;
	
	@Given("IMS baseURL {string} browser {string}")
	public void ims_base_url_browser(String baseURL, String browser) {
		
	    if(browser.equalsIgnoreCase("chrome")) {
	    	driver = new ChromeDriver();
	    }else if(browser.equalsIgnoreCase("firefox")) {
	    	driver = new FirefoxDriver();
	    } else {
	    	driver.close();
	    }
	    
	    driver.get(baseURL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("The user clicks get in touch link")
	public void the_user_clicks_get_in_touch_link() throws InterruptedException {
	    lp = new LandingPage(driver);
	    lp.clickGetInTouchLink();
	}

	@Then("The user clicks careere link")
	public void the_user_clicks_careere_link() throws Exception {
		gtp = new GetInTouchPage(driver);
		gtp.clickCookies();
		gtp.clickCareers();
	    Thread.sleep(5000);
	}

	@Then("The user clicks their location as South Africa")
	public void the_user_clicks_their_location_as_south_africa() throws InterruptedException {
		co = new CareerOpportunities(driver);
		WebElement ele = co.getLocation();
		
		pf = new PublicFunction(driver);
		
		js = (JavascriptExecutor) driver;
		pf.scrollElementIntoView(ele, js);
		
		Thread.sleep(5000);
		
		co.clickLocationLink();
	    Thread.sleep(5000);
	}

	@Then("The user will select the first available job")
	public void the_user_will_select_the_first_available_job() throws InterruptedException {
		lop = new LocationPage(driver);
		
		WebElement element = lop.getCurrentOpeningList();
		WebElement liList = lop.getTheUl();
		
		pf.scrollElementIntoView(element, js);
		
		Thread.sleep(2000);
		List<WebElement> lis = liList.findElements(By.tagName("a"));
		js.executeScript("arguments[0].click();", lis.get(0));
	    Thread.sleep(5000);
	}
	
	@Then("The user will location the application form")
	public void the_user_will_location_the_application_form() throws InterruptedException {
		fap = new FirstAvailablePost(driver);
		
		WebElement ApplyNow = fap.getApplicationForm();
	    pf.scrollElementIntoView(ApplyNow, js);
	    Thread.sleep(5000);
	}

	@Then("The user will enter first name as {string}")
	public void the_user_will_enter_first_name_as(String string) {
		driver.switchTo().frame(fap.getiFrame());
	    fap.enterFirstName(string);
	}

	@Then("The user will enter last name as {string}")
	public void the_user_will_enter_last_name_as(String string) {
		fap.enterlastname(string);
	}

	@Then("The user will enter email as {string}")
	public void the_user_will_enter_email_as(String string) {
	    fap.enteremail(string);
	}

	@Then("The user will enter phone number generated")
	public void the_user_will_enter_phone_number_generated() {
	    fap.enterphone();
	}

	@Then("The user will enter massage as {string}")
	public void the_user_will_enter_massage_as(String string) throws InterruptedException {
	    fap.entermessage(string);
	}

	@Then("The user will click button submit")
	public void the_user_will_click_button_submit() throws InterruptedException, IOException {
	    fap.clickbtnsubmit();
	    nn = new PublicFunctions();
	    String fileName = PublicFunctions.getRandomString(10);
	    PublicFunctions.takeScreenshot(driver, fileName);
	    Thread.sleep(5000);
	    driver.close();
	}
}
