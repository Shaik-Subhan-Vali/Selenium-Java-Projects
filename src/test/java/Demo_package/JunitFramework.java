package Demo_package;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.*;

public class JunitFramework {

	//Junit is the framework that is used to run our codes. Like testng , junit also has annotations
	//junit donot supports parallel testing while testng supports
	//In testng we can group our testcases unlike junit.
	
	@After
	public void setup() {
		
	}
	
	@org.testng.annotations.Test(priority = 1)
	public void testngtest() {
		
	}
	
	
	@Test
	public void tc1() {
		
	}
	
	@Before
	public void mthd() {
		
	}
	
	@BeforeClass
	public void brfcls() {
		
	}
	
	@AfterClass
	public void aftrcls() {
		
	}
	
}














