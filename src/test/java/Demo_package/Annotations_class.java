package Demo_package;

import org.testng.annotations.Test;

public class Annotations_class {
	
	//@Test(dependsOnMethods = {"method2"})
	
	@Test(alwaysRun = true, dependsOnMethods = {"method2"})
	public void method1() {
		System.out.println("Hello, This is my first test");
	}
	
	@Test(enabled = false)
	public void method2() {
		System.out.println("Hello, This is my second test");
	}	

}
