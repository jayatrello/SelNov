package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class myHomepage extends ProjectMethods {
	public myHomepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Leads")
	WebElement myhp;
	
	@And(" click leads")
	public myLeadspage clickLead() {		
		click(myhp);
		return new myLeadspage();
		

	/*public LoginPage clickLogout() {		
		click(eleLogout);
		return new LoginPage();
	}
*/
	}
	
		
}
