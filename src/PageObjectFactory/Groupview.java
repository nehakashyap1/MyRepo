package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Groupview {
	
	
    @FindBy (xpath="//div/a[1]")
	
	private WebElement Perform_GrpA;
	
	public WebElement get_performGrpA(){
		
		return Perform_GrpA;
	}
	
    @FindBy (xpath="//div/a[2]")
	
	private WebElement Perform_GrpB;
	
	public WebElement get_performGrpB(){
		
		return Perform_GrpB;
	}
	
    @FindBy (xpath="//div/a[3]")
	
	private WebElement Perform_GrpC;
	
	public WebElement get_performGrpC(){
		
		return Perform_GrpC;
	}
	
    @FindBy (xpath="//div/small")
	
	private WebElement groupname;
	
	public WebElement getGroupname(){
		
		return groupname;
	}
	

}
