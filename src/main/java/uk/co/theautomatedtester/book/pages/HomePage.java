package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import static org.junit.Assert.assertTrue;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;

public class HomePage {

	public void atPage() {
		assertTrue(WebDriverRunner.url().equals("http://book.theautomatedtester.co.uk/"));
	}

	public void open() {
		Selenide.open("/");
	}

	public ChapterOnePage clickOnChapterOneLink() {
		$(byXpath("//a[contains(text(),'Chapter1')]")).click();
		return new ChapterOnePage();
	}

}
