import org.junit.Assert;
import org.junit.Test;


public class PickToyToCartTest extends BaseTest {


	@Test
	public void naviTest() {

		mainPage.clickOkCookiesBtn()
				.clickLampenBtn();

		lampenPage.clickKinderzimmeraccessoiresBtn();

		kinderzPage.moveToLampaKotBlock()
				.clickLampaKotBtn()
				.clickAddToCartBtn();

		Assert.assertEquals(2, kinderzPage.getCartitemsCount());
	}
}
