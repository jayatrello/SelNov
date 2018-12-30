package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class findleadpage extends myLeadspage {
	public findleadpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(name= "id") WebElement elefindid;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleflbutton;
	
	
	@And(" enter lleadid as (.*)")
	public  findleadpage enterlleadid(String data)
	{
		//type(elefromid,"123445");
		type(elefindid,data);
		return this;
	}
	
	@Then(" click flbutton")
	public  findleadpage clickflbutton()
	{
		click(eleflbutton);
		return new findleadpage();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
