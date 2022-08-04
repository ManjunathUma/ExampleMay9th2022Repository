package ActiTimeIndividualPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Login and Logout
	//WebElement for login Page UserName Text field
	private WebElement username;
	public WebElement getUsername() 
	{
		return username;
	}
	//Password field
	private WebElement pwd;
	public WebElement getPwd() 
	{
		return pwd;
	}
	
	//Login Button field
	@FindBy(xpath="//div[normalize-space()='Login']")
	private WebElement oLogin;
	public WebElement getoLogin()
	{
		return oLogin;
	}
}
