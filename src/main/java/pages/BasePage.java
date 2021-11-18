package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	protected WebDriver driver;
	protected Actions action;


	public BasePage(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\Downloads\\chromedriver_win32\\chromedriver.exe");
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}

	public WebElement waitElement(WebElement elem){
		new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOf(elem));
		return elem;
	}

	public String getPageTitle(){
		return driver.getTitle();
	}
}
