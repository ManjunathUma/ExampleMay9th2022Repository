package PageOnWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOneLocator  {

	public AllOneLocator(WebDriver oBrowser)
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
	
	//Flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() 
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	private WebElement logoutLink;
	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}
	//---------------------------------------------------------------------
	//Create user name and modify section
	//create user
	@FindBy(xpath="//div[normalize-space()='USERS']")
	private WebElement createUser;
	public WebElement getcreateUser()
	{
		return createUser;
	}
	//clickAddUser
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement clickAddUser;
	public WebElement getclickAddUser()
	{
		return clickAddUser;
	}
	//firstname
	private WebElement userDataLightBox_firstNameField;
	public WebElement getuserDataLightBox_firstNameField()
	{
		return userDataLightBox_firstNameField;
	}
	//lastName
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//email
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//Username
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserDataLightBox_usernameField()
	{
		return userDataLightBox_usernameField;
	}
	
	//password
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	
	//passowrdcopy
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	
	//Click Create User button
	private WebElement userDataLightBox_commitBtn;
	public WebElement getuserDataLightBox_commitBtn()
	{
		return userDataLightBox_commitBtn;
	}
	
	//-----------------------------------------------------------------------------
	//Modify user name
    //Edit user name
	@FindBy(xpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/span[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	private WebElement userNameSelect;
	public WebElement getuserNameSelect()
	{
		return userNameSelect;
	}
	
	//edit lastname field
	@FindBy(xpath="//input[@id='userDataLightBox_lastNameField']")
	private WebElement UserLastName;
	public WebElement getUserLastName()
	{
		return UserLastName;
	}
	
	//Delete UserName
	@FindBy(id="userDataLightBox_deleteBtn")
    private WebElement DeleteUserName;
	public WebElement getDeleteUserName()
	{
		return DeleteUserName;
		
	}
	
	//====================================================================
	
	//Create customer
	
	//Click on Task
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement TaskButton;
	public WebElement getTaskButton()
	{
		return TaskButton;
	}
	
	//Add New button
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddNew;
	public WebElement getAddNew()
	{
		return AddNew;
	}
	
	//CLick on New Customer
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement NewCustomer;
	public WebElement getNewCustomer()
	{
	    return NewCustomer;
	}
	
	//Enter Customer name
	@FindBy(id="customerLightBox_nameField")
	private WebElement CustomerName;
	public WebElement getCustomerName()
	{
		return CustomerName;
	}
	
	//Click on create customer name button
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement CustomerNameButton;
	public WebElement getCustomerNameButton()
	{
		return CustomerNameButton;
	}
	//=======================================================
	//Delete customer name
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement DeleteCustomerName;
	public WebElement getDeleteCustomerName()
	{
		return DeleteCustomerName;
	}
	
	//Action button
	@FindBy(xpath="(//div[@class='action'][normalize-space()='ACTIONS'])[1]")
	private WebElement customerDeleteActionButton;
	public WebElement getcustomerDeleteActionButton()
	{
		return customerDeleteActionButton;
	}
	
	//Action delete
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='title'][normalize-space()='Delete']")
	private WebElement ActiondeleteCustomer;
	public WebElement getActiondeleteCustomer()
	{
		return ActiondeleteCustomer;
	}
	
	//Conform Delete 
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement conformDeleteCustomerName;
	public WebElement getconformDeleteCustomerName()
	{
		return conformDeleteCustomerName;
	}
	//=============================================================
	//Modify customer
	
	//Modify Text area
	@FindBy(xpath="//textarea[@placeholder='Enter customer description...']")
	private WebElement InputTextField;
	public WebElement getInputTextField()
	{
		return InputTextField;
	}
	
	//Close button
	@FindBy(xpath="//body/div[@id='taskManagementPage']/div[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement closeWindow;
	public WebElement getcloseWindow()
	{
		return closeWindow;
	}
	//===================================================================
	//Create Project
	
	//Create Project click
	@FindBy(xpath="//div[@class=\"item createNewProject ellipsis\"]")
	private WebElement selectNewProject;
	public WebElement getselectNewProject()
	{
		return selectNewProject;
	}
	
	//createProject field
	@FindBy(xpath="//input[@id=\"projectPopup_projectNameField\"]")
	private WebElement enterProjectField;
	public WebElement getenterProjectField()
	{
		return enterProjectField;
	}
	
	//create Project button
	@FindBy(xpath="//div[@id='projectPopup_commitBtn']//div//span")
	private WebElement createProjectButton;
	public WebElement getcreateProjectButton()
	{
		return createProjectButton;
	}
	
	//click on edit project button
	@FindBy(xpath="//div[@class='node projectNode selected']//div[@class='editButton available']")
	private WebElement clickOnProjectTodelete;
	public WebElement getclickOnProjectTodelete()
	{
		return clickOnProjectTodelete;
	}
	
	//action button for project to delete
	@FindBy(xpath="(//div[@class='actionButton'])[3]")
	private WebElement actionToDeleteProject;
	public WebElement getactionToDeleteProject()
	{
		return actionToDeleteProject;
	}
	
	//Delete project
	@FindBy(xpath="(//div[@class='title'][normalize-space()='Delete'])[3]")
	private WebElement DeleteProject;
	public WebElement getDeleteProject()
	{
		return DeleteProject;
	}
	
	//Delete confirm
	@FindBy(xpath="//span[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	private WebElement confirmDeleteProject;
	public WebElement getconfirmDeleteProject()
	{
		return confirmDeleteProject;
	}
	
	//Modify project
	@FindBy(xpath="//textarea[@placeholder=\"Enter project description...\"]")
	private WebElement modifyproject;
	public WebElement getmodifyproject()
	{
		return modifyproject;
	}
	
	//======================================================
	//create Task
	
	//add task
	@FindBy(xpath="//div[contains(text(),\"Add New Task\")]")
	private WebElement addTask;
	public WebElement getaddTask()
	{
		return addTask;
	}
	
	//create Task
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement createTask;
	public WebElement getcreateTask()
	{
		return createTask;
	}
	
	//input task
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement inputTask;
	public WebElement getinputTask()
	{
		return inputTask;
	}
	
	//click create task button
	@FindBy(xpath="(//span[normalize-space()='Create Tasks'])[1]")
	private WebElement clickOnCreateTaskButton;
	public WebElement getclickOnCreateTaskButton()
	{
		return clickOnCreateTaskButton;
	}
	
	//delete task
	@FindBy(xpath="//td[@class=\"names\"]//div[@class=\"taskRowCellWrapper\"]")
	private WebElement selectTaskToDelete;
	public WebElement getselectTaskToDelete()
	{
		return selectTaskToDelete;
	}
	
	//delete task action button
	@FindBy(xpath="//div[@class='header']//div[@class='action'][normalize-space()='ACTIONS']")
	private WebElement deletetaskactionbutton;
	public WebElement getdeletetaskactionbutton()
	{
		return deletetaskactionbutton;
	}
	
	//delete task button
	@FindBy(xpath="//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"title\"][normalize-space()=\"Delete\"]")
	private WebElement deletetaskbutton;
	public WebElement getdeletetaskbutton()
	{
		return deletetaskbutton;
	}
	
	//delete task confirm button
	@FindBy(xpath="//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"title\"][normalize-space()=\"Delete\"]")
	private WebElement deletetaskconfirmbutton;
	public WebElement getdeletetaskconfirmbutton()
	{
		return deletetaskconfirmbutton;
	}	
}
