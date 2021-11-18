package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LampenPage extends BasePage {

	public LampenPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//ul/li/a[text()='Kinderzimmeraccessoires']")
	private WebElement kinderzimmeraccessoiresBtn;

	public void clickKinderzimmeraccessoiresBtn() {
		kinderzimmeraccessoiresBtn.click();
	}
}