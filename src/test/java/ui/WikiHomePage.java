package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://en.wiktionary.org/")
public class WikiHomePage extends PageObject{
	
	public WebDriver driver;
	
	@FindBy(name="search")
    private WebElement searchTerms;

    @FindBy(name="go")
    private WebElement lookupButton;
    

    public void searchFor(String keyword) {
    	
    	searchTerms.sendKeys(keyword);         
    	lookupButton.click(); 
		
	}
    
        
        
        
    
      
    
    
    
    
}
