package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Open The Browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver =new ChromeDriver();
			    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("Max The Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("Set The Timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("Launch The Url")
	public void launchTheUrl() {
		driver.get("http://leaftaps.com/opentaps");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("Enter the UserName as (.*)")
	public void enterTheUserNameAsDemoSalesManager(String data) {
		
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys(data);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("Enter the Password as (.*)")
	public void enterThePasswordAsCrmsfa(String data) {
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(data);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("Click on the loginbutton")
	public void clickOnTheLoginbutton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify login")
	public void verifyLogin() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("success");
	    
	}

	@And("click leads")
	public void clickleads()
	{
		driver.findElementByLinkText("Leads").click();

}
	
	@And("click createlead")
	public void clickcreatelead()
	{
		driver.findElementByLinkText("Create Lead").click();

}
	@Given("enter cmpname as (.*)")
	public void enter_cmpname_as_abc(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	
	/*@And("enter cmpname  as (.*)")
	public void entercmpname(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);

}
	
*/	
	@And("enter firstname as (.*)")
	public void enterfname(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);

}
	@And("enter lastname as (.*)")
	public void enterlname(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);

}

	
	@And("click createleadbutton")
	public void clickcreateleadbutton()
	{
		driver.findElementByName("submitButton").click();

}
@When("click crmsfa")
public void click_crmsfa() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElementByLinkText("CRM/SFA").click();
}
}
