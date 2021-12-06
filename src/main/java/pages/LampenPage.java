package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LampenPage extends BasePage {

	public LampenPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath = "//li/a[text()='Kinderzimmeraccessoires']")
	@FindBy(xpath = "//ul[starts-with(@class,'style__SidebarMenu')]/li[7]")
	private WebElement kinderzimmeraccessoiresBtn;


	public void clickKinderzimmeraccessoiresBtn() {
//		Actions act =  new Actions(driver);
//				act.moveToElement(kinderzimmeraccessoiresBtn).perform();
		waitElementVisability(kinderzimmeraccessoiresBtn).click();
//		kinderzimmeraccessoiresBtn.click();
	}
}