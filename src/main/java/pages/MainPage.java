package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

	@FindBy(xpath = "//span[text()='Lampen']")
	private WebElement lampenBtn;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okCookiesBtn;

	@FindBy(xpath ="//div/ul/li/a[text()='Kontakt']")
	private WebElement kontaktsBtn;


	@FindBy(xpath ="//input[@type='search' and @name='searchTerm']")
	private WebElement searchField;

	public MainPage(final WebDriver driver) {
		super(driver);
	}

	public MainPage clickLampenBtn(){
		lampenBtn.click();
		return this;
	}
	public MainPage clickOkCookiesBtn(){
		waitElement(okCookiesBtn).click();
		return this;
	}

	public void clickKontaktsBtn(){
		action.moveToElement(kontaktsBtn).click().perform();
	}

	public void search(String kays){
		searchField.sendKeys(kays);
		searchField.submit();
	}

}
