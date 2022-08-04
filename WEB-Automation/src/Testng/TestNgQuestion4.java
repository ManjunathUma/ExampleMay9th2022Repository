package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//4.LaunchBrowser--navigate--login---createcustomer---modifyCustomer Name---deleteCustomer---logout---close application.
public class TestNgQuestion4 {
		public static WebDriver oBrowser=null;
	
		@Test(priority=1)
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
				oBrowser=new ChromeDriver();
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
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
		
		@Test(priority=3)
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.id("loginButton")).click();
				
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
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=5)
		private static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Manjunath");
				oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Name: Manjunath, Phno. 9686070929, Chikkabanavara");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=6)
		private static void modifyCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Lakshmi Enterprizses, Bangalore");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=7)
		private static void deleteName()
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=8)
		private static void logOut()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
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
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
