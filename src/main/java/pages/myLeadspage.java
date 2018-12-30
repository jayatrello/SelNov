package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class myLeadspage extends ProjectMethods {
	public myLeadspage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using = "Create Lead") WebElement elecl;
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads") WebElement elemerge;

	
	@And ("click createlead")
	public createLeadPage clickcreatelead() {		
		click( elecl);
		return new createLeadPage();
	}
	
	public Mergeleadpage clickmergeLead() {		
		click(elemerge);
		return new Mergeleadpage();
}
	
	
	
	
	
	
	
	
}
