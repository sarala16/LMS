package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProgram {

	
	public WebDriver ldriver;
	
	public DeleteProgram(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")
	 WebElement DeleteProgram;
	
	@FindBy(xpath="//button[@class='ng-tns-c133-4 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']")
	WebElement YesButton;

	@FindBy(xpath="//button[@class='ng-tns-c133-4 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']")
	WebElement NoButton;
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement Checkbox;
	
	
	public void DeleteselectedProgram() {
		DeleteProgram.click();
	}
	public void ClickYesButton() {
		YesButton.click();
	}
	
	public void ClickNoButton() {
		NoButton.click();
	}
	public void ClickCheckbox() {
		Checkbox.click();
	}
}
