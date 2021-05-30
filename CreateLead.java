package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class CreateLead extends TestNgHooks{

	public CreateLead typeCompanyName(String CompanyName) {
		type(locateElement("id", "createLeadForm_companyName"), CompanyName);
		return this;
	}
	
	public CreateLead typeFirstName(String firstName) {
		type(locateElement("id", "createLeadForm_firstName"),firstName);
		return this;
	}
	public CreateLead typeLastName(String lastName) {
		type(locateElement("id", "createLeadForm_lastName"),lastName);
		return this;
	}
	
	public ViewLead clickCreateLeadButton() {
		click(locateElement("class", "smallSubmit"));
		return new ViewLead();
	}
	
}
