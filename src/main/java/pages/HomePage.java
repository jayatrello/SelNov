package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")WebElement eleLogout;
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA") WebElement elecr;
	
	/*	public LoginPage clickLogout() {		
		click(eleLogout);
		return new LoginPage();
	}*/
	@And ("click crmsfa") 
	public myHomepage clickcrmsfa() {
		click(elecr);
		return new myHomepage();
	}


}
