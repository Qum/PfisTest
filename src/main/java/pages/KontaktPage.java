package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class KontaktPage extends BasePage {

	@FindBy(xpath = "//div/p/strong[contains(text(),'Hotline')]/a")
	private WebElement pfoneNumber;

	public KontaktPage(WebDriver driver){
		super(driver);
	}

	public String getContactPhone(){
		return pfoneNumber.getText();
	}
}
