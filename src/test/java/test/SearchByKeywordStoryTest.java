package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStoryTest {

	@Managed
	public WebDriver browser;

	@Steps
	public EndUserSteps endUser;

	@Test
	public void searching_by_keyword_apple_should_display_the_corresponding_article() {

		// Given
		endUser.isOnTheHomePage();

		// When
		endUser.looksFor("apple");

		// Then
		endUser.shouldSeeDefinition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

	}

	@Test
	public void searching_by_keyword_pear_should_display_the_corresponding_article() {
		// Given
		endUser.isOnTheHomePage();

		// When
		endUser.looksFor("pear");

		// Then
		endUser.shouldSeeDefinition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
	}

}
