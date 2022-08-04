import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_LogOut {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		naviagte();
		login();
		logout();
		//closeApplication();

	}
    private static void LaunchBrowser()
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
    private static void naviagte()
    {
    	try
    	{
    		oBrowser.get("http://localhost/login.do");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
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
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		oBrowser.findElement(By.linkText("Login")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}   
