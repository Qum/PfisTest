package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	protected WebDriver driver;
	protected Actions action;
	protected JavascriptExecutor jsExec;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
		jsExec = (JavascriptExecutor)driver;
	}

	public WebElement waitElementVisability(WebElement elem){
		new WebDriverWait(driver, 15)
				.until(ExpectedConditions.visibilityOf(elem));
		return elem;
	}

	public WebElement waitElementClicable(WebElement elem){
		return new WebDriverWait(driver, 15)
				.until(ExpectedConditions.visibilityOf(elem));

	}

	public String getPageTitle(){
		return driver.getTitle();
	}

}
