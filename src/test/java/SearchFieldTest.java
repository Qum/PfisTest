import org.junit.Assert;
import org.junit.Test;


public class SearchFieldTest extends BaseTest {

	private static final String SEARCHITEM = "Band Poly-Raphia";
	@Test
	public void SearchTest(){
		mainPage.search(SEARCHITEM);

		Assert.assertEquals(SEARCHITEM, searchPage.getSeaarchResult());
	}
}
