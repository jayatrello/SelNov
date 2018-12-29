package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class createLeadPage extends myLeadspage {
	public createLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "createLeadForm_companyName") WebElement elecn;
	@FindBy(id = "createLeadForm_firstName") WebElement elefn;
	@FindBy(id = "createLeadForm_lastName") WebElement eleln;
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit") WebElement elecreateclick;
	
	@And ("enter cmpname as (.*)")
	public createLeadPage EnterCompanyName(String data) {		
		type(elecn, data);		
		return this;
	}
	@And ("enter firstname as (.*)")
	public createLeadPage EnterFirstName(String data) {		
		type(elefn, data);		
		return this;
	}
	@And ("enter lastname as (.*)")
	public createLeadPage EnterlastName(String data) {		
		type(eleln, data);		
		return this;
	}
			
		
	
	

}
