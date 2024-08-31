package sharedServices;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PublicFunction {
	WebDriver driver;
	
	public  PublicFunction(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectByVisibleText(String text, WebElement element) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
	}
	
	public void jsClick(WebElement element, JavascriptExecutor js) throws InterruptedException {
		js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
	}
	
	public void scrollElementIntoView(WebElement element, JavascriptExecutor js) throws InterruptedException {
		js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-190);");
	}
	
	public void scrollDown(JavascriptExecutor js) throws InterruptedException {
		//Scroll down
		js = (JavascriptExecutor) this.driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
	}
}
