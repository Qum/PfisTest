package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage{

	@FindBy(xpath ="//div[@name='PLPContainer']//span[text()='Band Poly-Raphia']")
	private WebElement searchResalts;

	public SearchPage(final WebDriver driver) {
		super(driver);
	}

	public String getSeaarchResult(){
		return searchResalts.getText();
	}

}
