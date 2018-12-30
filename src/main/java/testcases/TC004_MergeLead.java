package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.createLeadPage;
import pages.myLeadspage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC004_MergeLeads";
		testDescription = "Feeding Data";
		authors = "Kalai";
		category = "smoke";
		dataSheetName = "mergeleadtc";
		testNodes = "mergeLeads";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void login(String userName,String password,String fromid,String toid,String lid) 	
	
	{
		new LoginPage()
	
	.enterUserName(userName)
	.enterPassword(password)
	.clickLogin()
	.clickcrmsfa()
	.clickLead()
	
	.clickmergeLead().clickficon()
	.enterfleadid(fromid).clickfleadbutton().clickfresult().clicktoicon()
	.enterfleadid(toid).clickfleadbutton().clickfresult().clickmergebutton().clickalert().clickfindlead().enterlleadid(lid)
	.clickflbutton();
	}
}