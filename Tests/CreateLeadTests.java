package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LeadLoginPage;

public class CreateLeadTests extends TestNgHooks{

	@Test (dataProvider = "ReadExcelData")
	public void LeadLogin(String CompanyName,String firstName,String lastName) {
		new LeadLoginPage()
		.typeUserName("DemoSalesManager")
	    .typePassword("crmsfa")
	    .clickLoginButton()
	    .verifyMessage()
	    .clickCrmsfa()
	    .clickLeadsTab()
	    .clickcreateLeatetab()
	    .typeCompanyName(CompanyName)
	    .typeFirstName(firstName)
	    .typeLastName(lastName)
	    .clickCreateLeadButton()
	    .verifyViewLead();
	}
	
}
