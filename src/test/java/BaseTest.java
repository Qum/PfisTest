import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import config.Prop;
import pages.KinderzPage;
import pages.KontaktPage;
import pages.LampenPage;
import pages.MainPage;
import pages.SearchPage;
import ru.qatools.properties.PropertyLoader;


public class BaseTest {

	protected Prop config;
	protected WebDriver driver;
	protected MainPage mainPage;
	protected LampenPage lampenPage;
	protected KinderzPage kinderzPage;
	protected KontaktPage kontaktPage;
	protected SearchPage searchPage;


	BaseTest() {
		config = PropertyLoader.newInstance()
				.populate(Prop.class);
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();

		mainPage = new MainPage(driver);
		lampenPage = new LampenPage(driver);
		kinderzPage = new KinderzPage(driver);
		kontaktPage = new KontaktPage(driver);
		searchPage = new SearchPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://testpfisterch:Test@pfister.ch@q-ecom.pfister.ch");

		driver.manage().deleteAllCookies();
		driver.get("https://q-ecom.pfister.ch");

	}

	@AfterSuite
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
