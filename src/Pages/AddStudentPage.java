package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.AddStudent;
import UtilityFiles.Driver;

public class AddStudentPage {

	AddStudent astd = PageFactory.initElements(Driver.driver, AddStudent.class);
	
	public void click_firstname()
	{
		astd.get_firstname();
	}
	
    public void click_lasstname()
    {
		astd.get_lasstname();
	}
    
    public void click_Email()
    {
		astd.get_email();
	}
    
    public void click_Username()
    {
		astd.get_username();
	}
	
    public void click_password()
    {
		astd.get_password();
	}
	
    public void click_AdministrativeAccess()
    {
		astd.get_AdminCheckbox().click();
	}
	
    public void click_SaveStudent()
    {
		astd.get_saveButton().click();
	}
	public void getfirstname(){
		
		
		
		
		
	}
}
