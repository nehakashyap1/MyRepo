package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(xpath="//input[@id='username']")
	
	private WebElement usernametxt;
	
	
	public WebElement getusername(){
		
		return usernametxt;
	}
	
    @FindBy(xpath="//input[@id='password']")
	
	private WebElement password;
	
	
	public WebElement getpassword(){
		
		return password;
	}
	
   @FindBy(xpath="//div/button[@type='submit']/i")
	
	private WebElement loginbtn;
	
	
	public WebElement getlogin(){
		
		return loginbtn;
	}
	
	
    @FindBy(xpath="//div/ul[3]/li/a")
	
	private WebElement userdrpdown;
	
	
	public WebElement userdrpdown(){
		
		return userdrpdown;
	}
	
    @FindBy(xpath="//div/ul[3]/li/ul/li[6]")
	
	private WebElement logoutbtn;
	
	
	public WebElement getlogout(){
		
		return logoutbtn;
	}


	
	
	
	
	
	
	
	
	

}
