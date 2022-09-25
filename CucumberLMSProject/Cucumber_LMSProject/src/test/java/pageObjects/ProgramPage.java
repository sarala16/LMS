package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage {

	public WebDriver ldriver;
	
	public ProgramPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="new")
	WebElement AnewProgram;
	@FindBy(id="programName")
	WebElement ProgramName;
	@FindBy(id="programDescription")
	WebElement programDescrip;
	@FindBy(linkText="Active")
	WebElement Active;
	
	@FindBy(linkText=" Inactive ")
	WebElement  Inactive ;
	
	@FindBy(xpath="//button[@label='Save']")
	WebElement  SaveButton ;
	
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement  Cancel ;
	

@FindBy(xpath="//span[@class='p-button-icon pi pi-pencil']") 
 WebElement EditButton;

	public void ClickOnNewProgram() {
		AnewProgram.click();
	}
	
	public void EnternewProgram(String newpro) {
		ProgramName.sendKeys(newpro);
	}
	public void ClearProgram() {
		ProgramName.clear();
	}

	public void enterProdescription(String desc) {
		programDescrip.sendKeys(desc);
	}
	public void ClickActiveStatus() {
		Active.click();
	}
	public void ClickinActiveStatus() {
		Inactive.click();
	}
	
	public void ClickonSaveButton() {
		SaveButton.click();
	}
	public void ClickonCancelButton() {
		Cancel.click();
	}
	public void EditButton() {
		EditButton.click();
	}
	
	
	
}