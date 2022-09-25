package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginatorPage {

	
public WebDriver ldriver;
	
	public PaginatorPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}



 @FindBy(how = How.XPATH, using="(//button[contains(@class,'p-paginator-page p-paginator-element')])[1]") 
  WebElement  firstEntrieButton;
 
 @FindBy(how = How.XPATH, using="(//button[contains(@class,'p-paginator-page p-paginator-element')])[2]") 
  WebElement secondEntrieButton ;
 
 @FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-left']")
 WebElement leftNavigationArrow ;
 
 
 
 @FindBy(xpath="//span[@class=' p-paginator-icon pi pi-angle-right']")
 WebElement rightNavigationArrow ;





public void FirstEnterieButton() {
	firstEntrieButton.click();
}

public void SecondtEnterieButton() {
	secondEntrieButton.click();
}

public void leftNavigationArrow() {
	leftNavigationArrow.click();
}

public void rightNavigationArrow() {
	rightNavigationArrow.click();
}


}