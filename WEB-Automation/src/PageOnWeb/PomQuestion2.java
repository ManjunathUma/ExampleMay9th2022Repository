package PageOnWeb;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//2.launchBrowser--navigate--login--createUser--modifyUser--deleteUser--logout--closeApplication
public class PomQuestion2 {
    public static WebDriver oBrowser=null;
    public static AllOneLocator oPage=null;

	
    @Test(priority=1)
    private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new AllOneLocator(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    @Test(priority=2)
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    @Test(priority=3)
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(4000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=5)
	private static void createUser()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getclickAddUser().click();
			Thread.sleep(2000);
			oPage.getuserDataLightBox_firstNameField().sendKeys("demo");
			oPage.getlastName().sendKeys("User1");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("demoUser1");
			oPage.getpassword().sendKeys("Welcome123");
			oPage.getpasswordCopy().sendKeys("Welcome123");
			Thread.sleep(4000);
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=6)
	private static void ModifyUser()
	{
		try
		{
			oPage.getuserNameSelect().click();
			oPage.getlastName().sendKeys("User2");;
		    oPage.getuserDataLightBox_commitBtn().click();
		    Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=7)
    private static void deleteUser()
	{
		try
		{
			oPage.getuserNameSelect().click();
			Thread.sleep(2000);
			oPage.getDeleteUserName().click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=8)
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=9)
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
