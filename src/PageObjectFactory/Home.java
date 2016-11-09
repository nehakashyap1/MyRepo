package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	
	@FindBy (xpath="//div/a[@href='group?view=circle&classId=7696']")
	
	private WebElement Radial;
	
	public WebElement getradialView(){
		
		return Radial;
	}
	
    @FindBy (xpath="//div[@alt='Table View']")
	
	private WebElement Tabuler;
	
	public WebElement gettableView(){
		
		return Tabuler;
	}
	
   @FindBy (xpath="//div/a[@href='download']")
	
	private WebElement Reports;
	
	public WebElement getReportView(){
		
		return Reports;
	}
   @FindBy (xpath="//div/a[@href='InstructorAdminPanel']") //div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/InstructorAdminPanel']
	
	private WebElement Admin;
	
	public WebElement getAdminView(){
		
		return Admin;
	}
	
	@FindBy (xpath="//span/a[@href='/SonoSim-Performance-Tracker/classes']")
	
	public WebElement commonlink;
	
	public WebElement NavigateHome(){
		
		return commonlink;
	}
	
	
	@FindBy (xpath="//div/a[@href='groupselect']")
	
	private WebElement groupsel;
	
	public WebElement returngroupsel(){
		
		return groupsel;
	}
	
	@FindBy (xpath="//div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/classes']")
	                                                           
	private WebElement drpdwnHome;
	
	public WebElement getdrpdwnhome(){
		
		return drpdwnHome;
	}
    @FindBy (xpath="//div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/InstructorAdminPanel']")
	
	private WebElement drpdwnAdmin;
	
	public WebElement getdrpdwnadmin(){
		
		return drpdwnAdmin;
	}
    @FindBy (xpath="//div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/download']")
	
	private WebElement drpdwnreports;
	
	public WebElement getdrpdwnreports(){
		
		return drpdwnreports;
	}
    @FindBy (xpath="//div/ul/li/ul/li/a[@href='/resources/docs/PT_userguide_v21508_080816.pdf']']")
	
	private WebElement drpdwnUserGuide;
	
	public WebElement getdrpdwnUserGuide(){
		
		return drpdwnUserGuide;
	}
	
    @FindBy (xpath="//div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/tour']")
	
	private WebElement ProductTour ;
	
	public WebElement getdrpdwnProductTour(){
		
		return ProductTour;
	}
    @FindBy (xpath="//div/ul/li/ul/li/a[@href='/SonoSim-Performance-Tracker/logout']")
	
	private WebElement drpdwnLogout;
	
	public WebElement getdrpdwnLogout(){
		
		return drpdwnLogout;
	}
	
	
	
	
}
