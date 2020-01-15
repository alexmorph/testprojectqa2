package uk.co.theautomatedtester.book.test;

import org.testng.annotations.Test;
import uk.co.theautomatedtester.book.pages.ChapterOnePage;
import uk.co.theautomatedtester.book.pages.HomePage;
import uk.co.theautomatedtester.book.test.config.TestConfig;

public class AutoTest extends TestConfig {

	@Test
	public void CheckThatTextIsDisplayedOnChapterOnePage() {

		HomePage homePage = new HomePage();
		
		homePage.open();
		homePage.atPage();
		ChapterOnePage chapterOnePage = homePage.clickOnChapterOneLink();

		chapterOnePage.atPage();
		chapterOnePage.checkThatTextIsDisplayed("Assert that this text is on the page");

		homePage = chapterOnePage.clickOnTheHomePageLink();
		homePage.atPage();

	}

}
