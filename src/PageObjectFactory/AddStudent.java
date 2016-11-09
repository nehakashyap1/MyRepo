package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityFiles.Driver;

public class AddStudent {
	
	
	
	
	
	@FindBy (id="firstname")
	
	private WebElement firstname;

	public WebElement get_firstname()
	{
		
		return firstname;
	}
	
	
    @FindBy (id="lastname")
	
	private WebElement lastname;

	public WebElement get_lasstname()
	{
		
		return lastname;
	}
	
	
	@FindBy (id="email")
		
	private WebElement email;
	 
	public WebElement get_email()
			
	{			
		return email;
		
	}
	
	
	
	@FindBy (id="username")
		
	private WebElement username;

	public WebElement get_username()
	{
			
	return username;
	}
	
	
	@FindBy (id="password")
		
	private WebElement password;

	public WebElement get_password()
		{
				
		return password;
		
		}
	
	
	@FindBy (xpath="//input[@id='is_admin'")
		
	private WebElement AdminCheckbox;

	public WebElement get_AdminCheckbox()
			{
					
			return AdminCheckbox;
			
			}
	
	
	@FindBy (xpath="//button[@id='saveButton']/i")
			
	private WebElement saveButton;

	public WebElement get_saveButton()
	
	{
						
				return saveButton;
				
	}
	
	@FindBy (xpath="//div/a[@href='InstructorAdminPanel']")
	
	private WebElement BackTopanel;

	public WebElement get_BackTopanel()
	
	{
						
				return BackTopanel;
				
	}
	
}
