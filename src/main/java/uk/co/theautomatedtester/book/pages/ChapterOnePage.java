package uk.co.theautomatedtester.book.pages;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Condition.*;

public class ChapterOnePage {

	public void atPage() {
		assertTrue(WebDriverRunner.url().equals(Configuration.baseUrl + "/chapter1"));
	}

	public void checkThatTextIsDisplayed(String textToCheck) {
		$("#divontheleft").shouldHave(text(textToCheck));
	}

	public HomePage clickOnTheHomePageLink() {
		$(byXpath("//a[contains(text(),'Home Page')]")).click();
		return new HomePage();
	}

}
