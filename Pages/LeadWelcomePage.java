package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;


public class LeadWelcomePage extends TestNgHooks {

	public LeadWelcomePage verifyMessage() {
		verifyPartialText(locateElement("tag", "h2"),"Welcome");
		return this;
	}
	public LeadLoginPage logout() {
		click(locateElement("class", "decorativeSubmit"));
		return new LeadLoginPage();
	}
	
	public MyHomePage clickCrmsfa() {
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}
}
