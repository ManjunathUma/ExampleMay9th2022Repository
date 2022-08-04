package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		framesHandlingDemo();
	}
	
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
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void framesHandlingDemo()
    {
	    try
	    {
	    	oBrowser.switchTo().frame("packageListFrame");
	    	oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
	    	oBrowser.switchTo().defaultContent();
	    	Thread.sleep(2000);
	    	oBrowser.switchTo().frame("packageFrame");
	    	oBrowser.findElement(By.linkText("WebDriver")).click();
	    	oBrowser.switchTo().defaultContent();
	    	Thread.sleep(2000);
	    	oBrowser.switchTo().frame("classFrame");
	    	String content=oBrowser.findElement(By.xpath("//div[@class='block')")).getText();
	    	System.out.println(content);
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}
