package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class findleadwindowpage extends myLeadspage {
	public findleadwindowpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name= "id") WebElement elefromid;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleflbutton;	
	@FindBy(name= "id") WebElement eletoid;
	@FindBy(xpath="//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a") WebElement elefresult;
	

		@And ("click fresult")
		public  Mergeleadpage clickfresult()
		{
			clickWithNoSnap(elefresult);
			switchToWindow(0);
			return new  Mergeleadpage();
		}

		
		
		@And ("click  fbutton")
		public findleadwindowpage clickfleadbutton()
		{
			click(eleflbutton);
			return this;
		}
		
		
		
		
		@And(" enter flead id as (.*)")
		public  findleadwindowpage enterleadid(String data)
		{
			
			type(elefromid,data);
			return this;
		}
		
		
		@And(" click  fbutton")
		public findleadwindowpage clicktleadbutton()
		{
			click(eleflbutton);
			return this;
		}
		
		@And ("click fresult")
		public  Mergeleadpage clickftresult()
		{
			clickWithNoSnap(elefresult);
			switchToWindow(0);
			return new  Mergeleadpage();
		}
		public  findleadwindowpage enterfleadid(String data)
		{
			//type(elefromid,"123445");
			type(elefromid,data);
			return this;
		}
		public  findleadwindowpage entertleadid(String data)
		{
			//type(elefromid,"123445");
			type(eletoid,data);
			return this;
		}
		
		/*public findleadwindowpage clickfleadbutton()
		{
			click(eleflbutton);
			return this;
		}*/
		
		@And ("enter tlead id as (.*)")
		public  findleadwindowpage entertoleadid(String data)
		{
			//type(elefromid,"123445");
			type(eletoid,data);
			return this;
		}
		
		
		
		
	
	

}
