package AlertsinSelenium;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//import org.testng.annotations.Parameters;

public class Annotations {
//@Beforesuite
	// @Beforeclass
	// @Beforemethod
	// @Beforetest
	// @Test
	// @Aftertest
	// @Aftermethod
	// @Afterclass
	// @Aftersuite
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Before suite Execute");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite Execute");
	}

	@BeforeTest
	public void before_test() {
		System.out.println("Before Test Execute");

	}

	@AfterTest
	public void After_test() {
		System.out.println("After Test Execute");

	}

	@BeforeClass
	public void Before_class() {
		System.out.println("Before class execute");
	}

	@AfterClass
	public void After_class() {
		System.out.println("After class execute");

	}
@Parameters({"A","B"})
	@BeforeMethod
	public void Before_method(String a , String b) {
		System.out.println(a+b);
		System.out.println("Before Method execute");

	}

	@AfterMethod
	public void After_method() {
		System.out.println("After Method execute");

	}
	// Description gives the information about the test case
	// Priority gives which test case should execute first and range Between -n to
	// +n
	// invocationCount This deals about How many times the test case should be
	// executed
	// DependsOn it deals about Ensure that the method depends on each other
	// SuiteName it show the what are the smoke and sanity and regression scenarios
	// mention the which test case comes under which suite
	// AlwaysRun=true it should pass the test case is depend on other methods or it
	// fail ,pass that test case .
	// expeptedException=Excepted.class it deals about the test case should have
	// some error you should be conditionally pass that test case and developer
	// should fox immediately

	@Test(description = "First Test case", priority = 2, suiteName = "regression",dataProvider="Sampledata")
	public void FirstTest1(String a,String b) {
		System.out.println(a+"--------"+b);
		System.out.println("This is first Test case");

	}

	@Test(description = "Second Test case", priority = 1, invocationCount = 3, suiteName = "regression",groups="regression", expectedExceptions = Exception.class)
	public void SecondTest2() throws Exception {
		System.out.println("This is Second Test case");
		throw new Exception();

	}

	@Test(description = "Third Test case", priority = -122,groups="Sanity", dependsOnMethods = "SecondTest2()", suiteName = "smoke", alwaysRun = true)
	public void ThirdTest3() {
		System.out.println("This is Third Test case");
	}

	@Test(description = "Fourth Test case", suiteName = "sanity",groups="retestig")
	public void FourthTest3() {
		System.out.println("This is Fourth Test case");

	}
	//It provides the data in one dimention or two dimention array
	@DataProvider(name="Sampledata") //it provides the data for the test cases
	public Object[][] getData(Method m){
		System.out.println(m.getName());
		Object[][] ob1=new Object[2][2];
		ob1[0][0]="FirstName";
		ob1[0][1]="Last Name";
		ob1[1][0]="Lokesh";
		ob1[1][1]="Varma";
		return ob1;
		
	}

}
