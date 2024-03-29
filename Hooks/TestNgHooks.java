package hooks;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.RdExcelData;
import wrappers.BaseDriver;

public class TestNgHooks extends BaseDriver{
	
	@BeforeSuite
	public void init() {
		//Start Reporting
	}
	
	@BeforeTest
	public void setUpTests() {
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
	}

	@BeforeMethod
	public void invoke() {
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	
	@AfterMethod
	public void close() {
		closeActiveBrowser();
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	
	@AfterTest
	public void completeTest() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		//publish report
	}
	
	@DataProvider(name = "ReadExcelData")
	public Object [][] collectData() {
		try {
			return RdExcelData.readExcelData("Create Lead");
		} catch (InvalidFormatException e) {
			System.err.println("The excel is in invalid format. Looks corrupted");
		} catch (IOException e) {
			System.err.println("The file does not exist");
		}
		return null;
	}
}
