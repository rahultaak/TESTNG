package PKG00;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	//@Test()
	public void tc()
	{
		System.out.println("test case 1");
	}
	@BeforeSuite
	public void tc1()
	{
		System.out.println("before suit");
	}
	@BeforeTest
	public void tc2()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void tc3()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void tc4()
	{
		System.out.println("before method");
	}
	@AfterClass
	public void tc5()
	{
		System.out.println("after class");
	}
	@AfterMethod
	public void tc6()
	{
		System.out.println("after method");
	}
	@AfterSuite
	public void tc7()
	{
		System.out.println("after suit");
	}
	@AfterTest
	public void tc8()
	{
		System.out.println("after test");
		
	}
	//@Test(dependsOnMethods = "tc")
	public void tc9()
	{
		System.out.println("test case2");
	}

}
