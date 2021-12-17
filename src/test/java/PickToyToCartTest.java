import org.junit.Assert;
import org.junit.Test;


public class PickToyToCartTest extends BaseTest {

	@Test
	public void naviTest() {
		mainPage
				.clickOkCookiesBtn()
				.clickClosePopUpBtn()
//				.clickCloseBonusUpBtn()
				.clickLampenBtn();
//				.moveAndClickOnItemBlock()
//				.clickIncreaseСounterItemsBtn()
//				.clickAddToCartBtn();

		lampenPage.clickKinderzimmeraccessoiresBtn();

		kinderzPage.moveToLampaKotBlock()
				.clickLampaKotBtn()
				.clickAddToCartBtn();
		Assert.assertEquals(2, mainPage.getCartitemsCount());
	}
}
