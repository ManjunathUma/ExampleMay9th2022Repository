package PageOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//6.launchBrowser----navigate--login----createcustomer---createProject----modifyProject---DeleteProject--
//deleteCustomer---logout---closeApplication
public class PomQuestion6 {
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
	private static void createCustomerName()
	{
		try
		{
			oPage.getTaskButton().click();
			oPage.getAddNew().click();
			oPage.getNewCustomer().click();
			oPage.getCustomerName().sendKeys("Manjunath");
			oPage.getCustomerNameButton().click();
			Thread.sleep(4000);				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=6)
	private static void createProject()
	{
		try
		{
			oPage.getAddNew().click();
			Thread.sleep(2000);
			oPage.getselectNewProject().click();
			Thread.sleep(2000);
			oPage.getenterProjectField().sendKeys("LoginPage");
			Thread.sleep(2000);
			oPage.getcreateProjectButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    @Test(priority=7)
	private static void modifyProject()
	{
		try
		{
			oPage.getclickOnProjectTodelete().click();
			Thread.sleep(2000);
			oPage.getmodifyproject().sendKeys("Hello");
			Thread.sleep(6000);
			oPage.getcreateProjectButton().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	private static void deleteProject()
	{
		try
		{
			oPage.getclickOnProjectTodelete().click();
			Thread.sleep(2000);
			oPage.getactionToDeleteProject().click();
			Thread.sleep(2000);
			oPage.getDeleteProject().click();
			Thread.sleep(2000);
			oPage.getconfirmDeleteProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    @Test(priority=9)
   	private static void deleteName()
   	{
   		try 
   		{
   			oPage.getDeleteCustomerName().click();
   			Thread.sleep(2000);
   			oPage.getcustomerDeleteActionButton().click();
   			Thread.sleep(2000);
   			oPage.getActiondeleteCustomer().click();
   			Thread.sleep(2000);
   			oPage.getconformDeleteCustomerName().click();
   			Thread.sleep(2000);
   			//oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
   			//Thread.sleep(2000);
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   	}
       @Test(priority=10)
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
       @Test(priority=11)
   	private static void closeApplication()
   	{
   		try
   		{
   			oBrowser.quit();
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   	}
       
}


