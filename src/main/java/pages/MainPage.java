package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

	@FindBy(xpath = "//nav[starts-with(@class,'StyledNav')]/ul/li[4]/a")
	private WebElement lampenBtn;

	@FindBy(xpath = "//div[starts-with(@class,'style__CookieText')]/following-sibling::button")
	private WebElement okCookiesBtn;

	@FindBy(xpath ="//div[starts-with(@class,'AccordionBodyNode')]/ul/li[10]")
	private WebElement kontaktsBtn;

	@FindBy(xpath ="//input[@type='search' and @name='searchTerm']")
	private WebElement searchField;

	@FindBy(xpath = "//i[@data-analytics-event='Click Close NL Pop-Up']")
	private WebElement closePopUpBtn;

	@FindBy(xpath = "//i[@data-analytics-event='Click Close Customer Acquisition Pop-Up']")
	private WebElement closeBonusUpBtn;

//	@FindBy(xpath = "//div[contains(@class,'style__VisibleBlock')][1]")
//	@FindBy(xpath = "//span[contains(text(),'Rassel RATTLE')]/parent::a")
	@FindBy(xpath = "//div[starts-with(@class,'slick-track')]/div/div/div[starts-with(@class,'style__SliderProductWrapper')][1]/div")
	private WebElement itemBlock;

	@FindBy(xpath = "//i[@type='plus']/parent::button")
	private WebElement increaseСounterItemsBtn;

	@FindBy(xpath = "//a[@title='Meine Merklisten']/../following-sibling::li/a/span")
	private WebElement cartIcon;

	@FindBy(xpath = "//div[@data-testid='full-quicklayer']/following-sibling::div/button")
	private WebElement addToCartBtn;


	public MainPage(final WebDriver driver) {
		super(driver);
	}

	public MainPage clickLampenBtn(){
		lampenBtn.click();
		return this;
	}
	public MainPage clickOkCookiesBtn(){
		waitElementVisability(okCookiesBtn).click();
		return this;
	}

	public MainPage clickKontaktsBtn(){
		jsExec.executeScript("window.scrollBy" + kontaktsBtn.getLocation());
//		waitElementClicable(kontaktsBtn).click();
		action.moveToElement(kontaktsBtn).click().perform();
		return this;
	}

	public void search(String kays){
		searchField.sendKeys(kays);
		searchField.submit();
	}

	public MainPage clickClosePopUpBtn() {
		waitElementVisability(closePopUpBtn).click();
		return this;
	}

	public MainPage clickCloseBonusUpBtn() {
		waitElementVisability(closeBonusUpBtn).click();
		return this;
	}

	public MainPage moveAndClickOnItemBlock(){
		jsExec.executeScript("window.scrollBy" + itemBlock.getLocation());
//		jsExec.executeScript("arguments[0].scrollIntoView(true)", itemBlock);
		return this;
	}

	public MainPage clickIncreaseСounterItemsBtn(){
		waitElementVisability(increaseСounterItemsBtn).click();
		return this;
	}

	public MainPage	clickAddToCartBtn() {
		waitElementVisability(addToCartBtn).click();
		return this;
	}

	public int getCartitemsCount(){
		return Integer.parseInt(cartIcon.getText());
	}

}
