package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class MyHomePage extends TestNgHooks{

		public LeadsMain clickLeadsTab() {
			click(locateElement("link", "Leads"));
			return new LeadsMain();
	}
}
