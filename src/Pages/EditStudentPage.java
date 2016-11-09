package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.AddStudent;
import PageObjectFactory.EditStudent;
import UtilityFiles.Driver;

public class EditStudentPage {
	
	
   EditStudent estd = PageFactory.initElements(Driver.driver, EditStudent.class);
	
	public void click_firstname()
	{
		estd.get_firstname();
	}
	
    public void click_lasstname()
    {
		estd.get_lasstname();
	}
	
	
	

}
