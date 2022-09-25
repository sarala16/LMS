package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.AscendDescendOrder;
import pageObjects.DeleteProgram;
import pageObjects.LoginPage;
import pageObjects.PaginatorPage;
import pageObjects.ProgramPage;
import pageObjects.SearchProgramPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public ProgramPage pp;
	public SearchProgramPage sp;
	public DeleteProgram dp;
	public PaginatorPage pap;
	public AscendDescendOrder ado;

}

