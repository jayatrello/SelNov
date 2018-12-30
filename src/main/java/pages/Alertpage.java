package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class Alertpage extends myLeadspage {
	public Alertpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	



@And ("click alert")

public   Mergeleadpage clickalert()
{
	acceptAlert();
	return new   Mergeleadpage();
}

}