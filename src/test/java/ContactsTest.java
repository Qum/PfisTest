import org.junit.Assert;
import org.junit.Test;


public class ContactsTest extends BaseTest {
	private final String CONTACTPAGETITLE = "Pfister - Kontaktcenter";
	private final String CONTACTPHONE = "+41 62 855 33 33";

	@Test
	public void ContactNumberExistTest()  {
		mainPage.clickOkCookiesBtn()
				.clickKontaktsBtn();

		Assert.assertEquals(CONTACTPAGETITLE, kontaktPage.getPageTitle());

		Assert.assertEquals(CONTACTPHONE, kontaktPage.getContactPhone());
	}
}
