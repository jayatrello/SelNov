package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class Mergeleadpage extends myLeadspage {
	public Mergeleadpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//img[@alt='Lookup'])[1]") WebElement elefromicon;
	@FindBy(xpath="(//img[@alt='Lookup'])[2]")WebElement eletoicon;
	@FindBy(xpath ="//a[text()='Merge']") WebElement elemergebutton;
	@FindBy(linkText ="Find Leads") WebElement elefindlead;

	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")WebElement elecreateclick;
	
	
	@And ("click from icon")
	public findleadwindowpage clickficon() {
		clickWithNoSnap(elefromicon);
		switchToWindow(1);
		return new findleadwindowpage() ;
	}

 
	@And ("click to icon")
	public  findleadwindowpage clicktoicon()
	{
		clickWithNoSnap(eletoicon);
		switchToWindow(1);
		return new findleadwindowpage() ;
	}
 
	/*@And ("click alert")
	public Alertpage acceptalert()
	{
		acceptAlert();
		return new Alertpage();
	}*/
	
	
	 
	@And ("click mergebutton")
public Alertpage clickmergebutton()
{
	click(elemergebutton);
	return new Alertpage();
}
	
	@And ("click find lead")
	
public findleadpage clickfindlead()
{
	click(elefindlead);
	return new findleadpage();
}	
	

	
	
			
		
	
	

}
