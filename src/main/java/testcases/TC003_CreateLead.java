package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.createLeadPage;
import pages.myLeadspage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC003_CreateLeads";
		testDescription = "Feeding Data";
		authors = "Kalai";
		category = "smoke";
		dataSheetName = "createleadtc";
		testNodes = "CreateLeads";
	}
	
	@Test(dataProvider = "fetchData")
	//@Test
	/*public void CreateLeads(String CN,String FN,String LN) {
		new createLeadPage()
		.EnterCompanyName(CN)
		.EnterFirstName(FN)
		.EnterlastName(LN);
		
	}*/
	public void login(String userName,String password,String cmpname,String fname,String lname) {	
	new LoginPage()
	.enterUserName(userName)
	.enterPassword(password)
	.clickLogin()
	.clickcrmsfa()
	.clickLead()
	.clickcreatelead()
	.EnterCompanyName(cmpname)
	.EnterFirstName(fname)
	.EnterlastName(lname)
	.clickcreatelead();
	}
		
		
		
		/*new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin().clickcrmsfa().clickLead().clickcreateLead();
		//.clickLogout();
*/						
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogin();*/
	}
	

