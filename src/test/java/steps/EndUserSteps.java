package steps;

import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Step;
import ui.SearchResultPage;
import ui.WikiHomePage;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class EndUserSteps {

	WebDriver driver;
	WikiHomePage wikihomePage;
	SearchResultPage searchResultPage;

	@Step
	public void isOnTheHomePage() {

		wikihomePage.open();

	}

	@Step
	public void looksFor(String keyword) {

		wikihomePage.searchFor(keyword);

	}

	@Step
	public void shouldSeeDefinition(String definition) {

		searchResultPage.getDefinitions();
		assertThat(searchResultPage.getDefinitions(), hasItem(containsString(definition)));

	}

}
