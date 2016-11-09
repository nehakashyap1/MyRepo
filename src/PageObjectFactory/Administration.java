package PageObjectFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Administration {
	
	
	@FindBy (xpath="//div//a/button[@value='Add Student']")
	
	private WebElement AddStudent;
	
	public WebElement get_AddStudent(){
		
		return  AddStudent;
	}
	
   @FindBy (xpath="//div//a/button[@id='archived']")
	
	private WebElement ShowArhived;
	
	public WebElement get_ShowArhived(){
		
		return  ShowArhived;
	}
	
   @FindBy (xpath="//*[@id='content']/div/div/div/div[2]/div[5]/a[1]")
	
	private WebElement Download;
	
	public WebElement get_Download(){
		
		return  Download;
	}
	
   @FindBy (xpath="//div/a[@href='InstructorAdminPanel']")
	
	private WebElement AddStudent_BackToPanel;
	
	public WebElement get_AddStudent_BackToPanel(){
		
		return  AddStudent_BackToPanel;
	}
 @FindBy (xpath="//button[@onclick='App.sendemail()']")
		
	private WebElement Email ;
		
	public WebElement get_Email() {
			
	return Email ;
			
		}	
 @FindBy (xpath=".//*[@id='archive']")
			
	private WebElement Archive ;
			
	public WebElement get_Archive() {
				
	return Archive ;
				
			}			
			
 @FindBy (xpath="//i[@class='fa fa-archive hint tooltipstered']")
		
		private List<WebElement> Archive_label ;
				
		public List<WebElement> get_ArchiveLabels() {
					
		return Archive_label ;
					
				}		                              
	
 @FindBy (xpath="//select[@name='managed_group']")
		
		private WebElement GroupDropdown ;
				
		public WebElement get_GroupDropdown() {
					
		return GroupDropdown ;
					
				}	
		
		
 @FindBy (xpath="//option[text()='Performance Tracker (Group A)']")
		
		private WebElement GroupA ;
				
		public WebElement get_GroupA() {
					
		return GroupA ;	
		
		}
		
 @FindBy (xpath="//option[text()='Performance Tracker (Group B)']")
			
			private WebElement GroupB ;
					
			public WebElement get_GroupB() {
						
			return GroupB ;	
			
			}		
 @FindBy (xpath="//option[text()='Performance Tracker (Group C)']")
				
				private WebElement GroupC ;
						
				public WebElement get_GroupC() {
							
				return GroupC ;	
				
				}		
				
				
	@FindBy (xpath="//button[@id='subgroup']")
					
					private WebElement Subgroup ;
							
					public WebElement get_SubgrpBtn() {
								
					return Subgroup ;	
					
					}									
					
	@FindBy (id="subgroupField")
					
					private WebElement Subrouptextbox ;
							
					public WebElement get_Subrouptextbox() {
								
					return Subrouptextbox ;	
					
					}		
					
					
					
   @FindBy (xpath="//button[@onclick='App.createSubgroup()']")
					
					private WebElement SaveChanges ;
							
					public WebElement get_SaveChangesBtn() {
								
					return SaveChanges ;	
					
					}					
					
							
}









