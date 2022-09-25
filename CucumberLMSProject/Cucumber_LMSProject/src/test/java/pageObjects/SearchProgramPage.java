package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProgramPage {
	public WebDriver ldriver;
	
	public SearchProgramPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	   @FindBy(xpath="//input[@type='text']")
	  WebElement searchbox;
		
	   public void searchButton() {
			searchbox.click();
		}
	   public void ClearProgram() {
		   searchbox.clear();
		}


}
