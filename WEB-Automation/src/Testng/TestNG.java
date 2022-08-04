package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestNG {

	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login cerdiential...");
		//Assert.fail("FAiling this testcase");
	}
	@Test(priority=2)
	public void Register()
	{
		System.out.println("Register name...");
	}
	@Test(priority=3,dependsOnMethods="login",alwaysRun=true)
	public void validate()
	{
		System.out.println("Validate user...");
	}
	@Test(priority=4,dependsOnMethods={"validate","Register"})
	public void Transfer()
	{
		System.out.println("Tranaction...");
	}
	@Test(priority=5)
	public void logout()
	{
		System.out.println("Logout cerdiential...");
	}
}
