import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.KinderzPage;
import pages.KontaktPage;
import pages.LampenPage;
import pages.MainPage;
import pages.SearchPage;


public class BaseTest {

	protected WebDriver driver;
	protected MainPage mainPage;
	protected LampenPage lampenPage;
	protected KinderzPage kinderzPage;
	protected KontaktPage kontaktPage;
	protected SearchPage searchPage;

	BaseTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dima\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		mainPage = new MainPage(driver);
		lampenPage = new LampenPage(driver);
		kinderzPage = new KinderzPage(driver);
		kontaktPage = new KontaktPage(driver);
		searchPage = new SearchPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.pfister.ch/de");
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
