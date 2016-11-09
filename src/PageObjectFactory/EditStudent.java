package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditStudent {

	
	

	@FindBy (id="firstName")
	
	private WebElement firstname;

	public WebElement get_firstname()
	{
		
		return firstname;
	}
	
	
    @FindBy (id="lastName")
	
	private WebElement lastname;

	public WebElement get_lasstname()
	{
		
		return lastname;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
