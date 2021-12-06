package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class KinderzPage extends BasePage {

	public KinderzPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Holzspielzeug FARM')]/parent::a")
	private WebElement lampaKotBlock;

	@FindBy(xpath = "//i[@type='plus']/parent::button")
	private WebElement lampaKotBtn;

	@FindBy(xpath = "//div[@data-testid='full-quicklayer']/following-sibling::div/button")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//a[@title='Meine Merklisten']/../following-sibling::li/a/span")
	private WebElement cartIcon;


	public KinderzPage	clickLampaKotBtn() {
		lampaKotBtn.click();
		return this;
	}

	public KinderzPage	clickAddToCartBtn() {
		addToCartBtn.click();
		return this;
	}

	public KinderzPage moveToLampaKotBlock() {
		jsExec.executeScript("window.scrollBy" + lampaKotBlock.getLocation());
		action.moveToElement(lampaKotBlock).perform();
		return this;
	}

	public int getCartitemsCount(){
		return Integer.parseInt(cartIcon.getText());
	}

}
