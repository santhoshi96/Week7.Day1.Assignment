package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hooks.TestNgHooks;

public class LeadLoginPage extends TestNgHooks {

	public LeadLoginPage typeUserName(String userdata ) {
		type(locateElement("id", "username"), userdata);
		return this;
	}
	
	public LeadLoginPage typePassword(String passdata ) {
		type(locateElement("id", "password"), passdata);
		return this;
	}
	public LeadLoginPage typePasswordAndEnter(String passdata) {
		typeAndEnter(locateElement("id", "password"),passdata);
		return this;
	}
	public LeadWelcomePage clickLoginButton() {
        click(locateElement("class", "decorativeSubmit"));
		return new LeadWelcomePage();
	}
	
	public LeadLoginPage ClickLoginForFailure() {
		click(locateElement("class", "decorativeSubmit"));
		return this;
	}
	
}


