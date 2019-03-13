package ui;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject {

	public List<String> getDefinitions() {
		WebElementFacade definitionList = find(By.tagName("ol"));
		List<WebElement> results = definitionList.findElements(By.tagName("li"));
		return convert(results, toStrings());
	}

	private Converter<WebElement, String> toStrings() {
		return new Converter<WebElement, String>() {
			public String convert(WebElement from) {

				System.out.println(from.getText());
				return from.getText();
			}
		};

	}

}
