package Annotation_order;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeSuite
	public void m1() { Reporter.log("@BeforeSuite",true); }
	@BeforeTest
	public void m2() { Reporter.log("@BeforeTest",true); }
	@BeforeClass
	public void m3() { Reporter.log("@BeforeClass",true); }
	@BeforeMethod
	public void m4() { Reporter.log("@BeforeMethod",true); }
	@AfterSuite
	public void m5() { Reporter.log("@AfterSuite",true); }
	@AfterTest
	public void m6() { Reporter.log("@AfterTest",true); }
	@AfterClass
	public void m7() { Reporter.log("@AfterClass",true); }
	@AfterMethod
	public void m8() { Reporter.log("@AfterMethod",true); }
}
