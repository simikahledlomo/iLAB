package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='et_pb_row et_pb_row_1']//div[@class='et_pb_text_inner']/ul")
	WebElement currentOpeningList;
	
	@FindBy(xpath = "//h3[contains(text(),'Current Openings')]")
	WebElement currentOpenings;

	public LocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCurrentOpeningList() {
		return this.currentOpenings;
	}
	
	public WebElement getTheUl() {
		return this.currentOpeningList;
	}
	
	public void clickViaPositiob(int indexs) {
		List<WebElement> lis = this.currentOpeningList.findElements(By.tagName("li"));
		
		lis.get(indexs).click();
	}
}
