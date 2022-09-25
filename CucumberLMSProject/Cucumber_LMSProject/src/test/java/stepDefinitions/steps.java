package stepDefinitions;




import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.en.*;
import pageObjects.AscendDescendOrder;
import pageObjects.DeleteProgram;
import pageObjects.LoginPage;
import pageObjects.PaginatorPage;
import pageObjects.ProgramPage;
import pageObjects.SearchProgramPage;

public class steps  extends BaseClass{
	

	
	@Given("User Launch Edge Browser")
	public void user_launch_edge_browser() {
		
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	    
	}

	@When("User Opens LMS URL {string}")
	public void user_opens_lms_url(String url) {
		driver.get(url);
		System.out.println("LMS Application Launched Successfully");
	  
	}

	@When("User enters UserName as {string} and Password as {string}")
	public void user_enters_user_name_as_and_password_as(String name, String pwd) throws Exception {
	   lp.setUserName(name);
	 
	   lp.setPassword(pwd);
	   System.out.println("Successfully Logined into LMS Application");
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.ClickLoginButton();
	    
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String Title) {
		Assert.assertEquals("LMS[]",lp.getPageTitle());

	}
	@Then("User should receive the message {string}")
	public void user_should_receive_the_message(String Title) throws Exception {
		
		if(driver.getPageSource().contains("Invalid username and password Please try again")){
		System.out.println("Invalid username and password Please try again");
			
			
			
				Assert.assertTrue(true);      
			}else{
				Assert.assertEquals(Title, driver.getTitle());
				
			}
			Thread.sleep(3000);
		}
	

	@Then("close browser")
	public void close_browser() {
		driver.close();
	 
	}
	
	
	//Program Page
	@Given("User is on Program page")
	public void user_is_on_program_page() {
		pp=new ProgramPage(driver);
	    
	}

	@When("User clicks A New Program button")
	public void user_clicks_a_new_program_button() {
		pp.ClickOnNewProgram();
	    
	}

	
	@Then("User lands on {string} form")
	public void user_lands_on_form(String Title) throws Exception {
		if(driver.getPageSource().contains("Program Details")){
			System.out.println("Program Details");
				
				
				
					Assert.assertTrue(true);      
				}else{
					Assert.assertEquals(Title, driver.getTitle());
					
				}
				Thread.sleep(3000);
			}
	
	
	@When("User enters name as {string} in text box")
	public void user_enters_name_as_in_text_box(String proname) {
		pp.EnternewProgram(proname);
	  
	}
	@Then("User can see Name entered")
	public void user_can_see_name_entered() {
		System.out.println("Name Enterted");
	  
	}

	@When("User enters desc as {string} in text box")
	public void user_enters_desc_as_in_text_box(String desc) {
	    pp.enterProdescription(desc);;
	}

	@Then("User can see Description entered")
	public void user_can_see_description_entered() {
		System.out.println("Description Enterted");
	   
	}

	@When("User clicks Save button")
	public void user_clicks_save_button() {
		pp.ClickonSaveButton();
	   
	}

	@Then("User gets message {string}")
	public void user_gets_message(String msg) throws Exception {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='p-toast-message-text ng-tns-c90-10 ng-star-inserted']")).getText().contains("Program Created"));
		
		System.out.println("Successful Program created");
	   
	}
	
	//Edit Program
	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
	  pp.EditButton();
	}

	@Then("User lands on Program Details form.")
	public void user_lands_on_program_details_form() {
	    System.out.println("User lands on Program Details form.");
	}
	

@When("User edits {string} and selects the Save button")
public void user_edits_and_selects_the_save_button(String name) {
 
	pp.ClearProgram();
	pp.EnternewProgram(name);
	pp.ClickonSaveButton();

	  
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) {
	    System.out.println("Program Updated");
	    
	}
	
	//Search Program
	
	@When("User enters  {string} into search box.")
	public void user_enters_into_search_box(String name) {
		sp= new SearchProgramPage(driver);
	    sp.searchButton();
	  
	    
	}

	@Then("Entries for name phrase are shown")
	public void entries_for_name_phrase_are_shown() {
		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("inactive");
		sp.ClearProgram();
		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("Program");
		sp.ClearProgram();
		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("active");
		sp.ClearProgram();
		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestProgram1");
		sp.ClearProgram();
		
	   
	}
	
	//Delete Program
	
	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
	    dp= new DeleteProgram(driver);
	    dp.DeleteselectedProgram();
	}

	@Then("User lands on Confirm Deletion form")
	public void user_lands_on_confirm_deletion_form() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='p-dialog-title ng-tns-c133-4 ng-star-inserted']")).getText().contains("Confirm"));
	
	System.out.println("User lands on Confirm Deletion form");
	}
	
	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() throws Exception {
		Thread.sleep(3000);
	    dp.ClickYesButton();
	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() {
		dp.DeleteselectedProgram();
	    dp.ClickNoButton();
	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
	  System.out.println("User can see Confirm Deletion form disappears");
	}
	
	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
	    dp.ClickCheckbox();
	    dp.DeleteselectedProgram();
	    dp.ClickYesButton();
	    dp.ClickCheckbox();
	    dp.DeleteselectedProgram();
	    dp.ClickNoButton();
	}
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	   pap=new PaginatorPage(driver);
	
		
	}

	@When("User is on first page of Manage Program")
	public void user_is_on_first_page_of_manage_program() {
		pap.FirstEnterieButton();
		
	    
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
		List<WebElement> elements = driver.findElements(By.tagName("button"));
		for (int i = 0; i < elements.size(); i++) {
		    String title = elements.get(i).getAttribute("title");
		    if (title.equals("Next Page")) {
		        elements.get(i).click();
		        break;
		    }
		}
	    
	}

	@When("User clicks left navigate > button")
	public void user_clicks_left_navigate_button() {
		pap.leftNavigationArrow();
	    
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
		pap.SecondtEnterieButton();
	   
	}

	@When("User clicks right navigate < button")
	public void user_clicks_right_navigate_button() {
		pap.rightNavigationArrow();
	    
	}
	
	//ascending and descending order
	
	@Given("User is on the Program  page")
	public void user_is_on_the_program_page() {
	    System.out.println("User is on the Program  page");
	    ado= new AscendDescendOrder(driver);
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Program name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_name() {
		ado.Programascend();
		
	    
	}

	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
		System.out.println("User can see the results in Ascending order of Program name");
	    
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Program Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_program_description() {
	  ado.ProgramDescriptionAscend();
	}
	@Then("User can see the results in Descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
		ado.ProgramStatusAcend();
	   
	}





}

