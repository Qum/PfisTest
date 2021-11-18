package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class KinderzPage extends BasePage {

	public KinderzPage(WebDriver driver) {
		super(driver);
	}

	//div[@data-testid='full-quicklayer']/following-sibling::div/
	@FindBy(xpath = "//span[contains(text(),'Korb STORAGE')]/parent::a")
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
		Actions action = new Actions(driver);
		action.moveToElement(lampaKotBlock).perform();
		return this;
	}

	public int getCartitemsCount(){
		return Integer.parseInt(cartIcon.getText());
	}

}
