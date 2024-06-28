package Demo_package;

import org.testng.annotations.Test;

public class Groups {
	
	//we only having groups in testng
	//Testng Groups -> Allows you to perform grouping of different test mtds
	
	@Test(priority =1,groups = {"smoketest"} )   
	public void tc1()
	{
		System.out.println("this is my 1st smoke test");
		
	}
	@Test(priority =2, groups = {"smoketest"})
	public void tc2()
	{
		System.out.println("this is my 2nd smoke test");
	}
	@Test(priority =1,groups = {"functional"})
	public void tc3()
	{
		System.out.println("this is my 1st func test");
	}
	@Test(priority =2,groups = {"functional"})
	public void tc4()
	{
		System.out.println("this is my 2nd func test");
	}

}
