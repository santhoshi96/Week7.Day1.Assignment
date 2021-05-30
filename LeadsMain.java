package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class LeadsMain extends TestNgHooks {
      
	public CreateLead clickcreateLeatetab() {
		click(locateElement("link","Create Lead" ));
		return new CreateLead();
	}
}
