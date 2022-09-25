package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username")
	WebElement User;
	
	
	@FindBy(id="password")
	WebElement Password;
	
	  @FindBy(id="login")
	    WebElement LoginButton;
	
	
	public void setUserName(String name) {
		User.sendKeys(name);
	}
	public void setPassword(String pwd) {
		Password.sendKeys(pwd);
	}
	
	public void ClickLoginButton() {
		LoginButton.click();
	}
	public String getPageTitle() {
		return ldriver.getTitle();
		
		
	}
	
}
