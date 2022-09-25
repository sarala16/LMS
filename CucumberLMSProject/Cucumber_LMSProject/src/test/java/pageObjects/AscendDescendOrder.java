package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AscendDescendOrder {

	

	public WebDriver ldriver;
	
	public AscendDescendOrder(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//th[@psortablecolumn='ProgramName']")
	WebElement Programascend;

   @FindBy(xpath="//th[@psortablecolumn='programDescription']")
    WebElement ProgramDescriptionAscend;
   
   @FindBy(xpath="//th[@psortablecolumn='programStatus']")
	WebElement ProgramStatusAcend;
   
   public void Programascend() {
	   Programascend.click();
   }
   
   public void ProgramDescriptionAscend() {
	   ProgramDescriptionAscend.click();
   }
   
   public void ProgramStatusAcend() {
	   ProgramStatusAcend.click();
   }
}
