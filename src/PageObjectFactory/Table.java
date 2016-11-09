package PageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityFiles.Driver;





public class Table {
	

@FindBy (xpath="//div[@class='pt-filter-toggle']/i")
	
	WebElement filter;
	
	public WebElement getFilter(){
		return filter;
		
	}
	
	 @FindBy (xpath="//*[@id='filterForm']/div[1]/ul/li[1]")
		
		WebElement group;
		
		public WebElement getgroup(){
			return group;
		}
		
    @FindBy (xpath="//*[@id='filterForm']/div[1]/ul/li[2]")
	
	WebElement subgroup;
	
	public WebElement getsubgroup(){
		return subgroup;
		
	}
	
    @FindBy (xpath="//*[@id='filterForm']/div[1]/ul/li[3]")
	
	WebElement students;
	
	public WebElement getstudent(){
		return students;
		
	}
	
	 @FindBy (xpath="//*[@id='filterForm']/div[1]/ul/li[4]")
		
	WebElement modules;
		
	public WebElement getmodules(){
			return modules;
			
		}
	
	 @FindBy (xpath="//div/input[@id='modulesButton']")
		
	WebElement ModuleApply;
		
		public WebElement getModuleApply(){
			return ModuleApply;
			
		}
	
     @FindBy (xpath="//div/ul[@id='groupFilter']/li[1]")
     
     private WebElement PerformGrpA_Filter;
     
     public WebElement get_PerformGrpA_Filter(){
    	 
    	 return PerformGrpA_Filter;
     }
     
    @FindBy (xpath="//div/ul[@id='groupFilter']/li[2]")
     
     private WebElement PerformGrpB_Filter;
     
     public WebElement get_PerformGrpB_Filter(){
    	 
    	 return PerformGrpB_Filter;
     }
     
    @FindBy (xpath="//div/ul[@id='groupFilter']/li[3]")
     
     private WebElement PerformGrpC_Filter;
     
     public WebElement get_PerformGrpC_Filter(){
    	 
    	 return PerformGrpC_Filter;
     }
     
    @FindBy (xpath="//div/input[@id='modulesButton' and @value='Apply']") 
     
     private WebElement ModulesApplyBtn;
     
     public WebElement Get_ModulesApplyBtn(){
    	 
    	 return ModulesApplyBtn;
     }
     
   @FindBy (xpath="//div/input[@id='studentsButton' and @value='Apply']") 
     
     private WebElement studentsApplyBtn;
     
     public WebElement Get_studentsApplyBtn(){
    	 
    	 return studentsApplyBtn;
     }
     
    @FindBy (xpath="//div/input[@value='Select All']")
     
     private WebElement filter_SelectAllBtn;
     
     public WebElement Get_SelectAllBtn(){
    	                                                           
    	 return filter_SelectAllBtn;
     }
     
    @FindBy (xpath="//div/input[@id='allsubgroups' and @value='Select All']")
     
     private WebElement filterSubgroup_selectAllBtn;
     
     public WebElement GetSubgroup_selectAllBtn(){
    	 
    	 return filterSubgroup_selectAllBtn;
     }
     
                                                                 
     @FindBy (xpath="//div/input[@id='allStudents' and @value='Select All']")
     
     private WebElement filterStudent_selectAllBtn;
     
     public WebElement GetStudent_selectAllBtn(){
    	 
    	 return filterStudent_selectAllBtn;
     }
     
     @FindBy (xpath="//div/input[@id='modulesSelectButton' and @value='Select All']")
     
     private WebElement filterModules_selectAllBtn;
     
     public WebElement GetModules_selectAllBtn(){
    	 
    	 return filterModules_selectAllBtn;
     }

     
     @FindBy (xpath="//div/input[@id='allsubgroups' and @value='Unselect All']")
     
     private WebElement filterSubgroup_UnselectAllBtn;
     
     public WebElement GetSubgroup_UnselectAllBtn(){
    	 
    	 return filterSubgroup_UnselectAllBtn;
     }
     

     @FindBy (xpath="//div/input[@id='allStudents' and @value='Unselect All']")
     
     private WebElement filterStudent_UnselectAllBtn;
     
     public WebElement GetStudent_UnselectAllBtn(){
    	 
    	 return filterStudent_UnselectAllBtn;
     }
     
     @FindBy (xpath="//div/input[@id='modulesUnSelectButton' and @value='Unselect All']")
     
     private WebElement filterModules_UnselectAllBtn;
     
     public WebElement GetModules_UnselectAllBtn(){
    	 
    	 return filterModules_UnselectAllBtn;
     }
     
     @FindBy (xpath="//div[@id='content']//a[@href='group?view=grid&classId=7696']")
     
     private WebElement TableView_lnk;
     
     public WebElement GetTableView_lnk(){
    	 
    	 return TableView_lnk;
     }
     
    @FindBy (xpath="//div/ul/li/input[@id='196870']")
     
     private WebElement Studentname;
     
     public WebElement GetStudentname(){
    	 
    	 return Studentname;
     }
    
    @FindBy (xpath="//div/ul/li/input[@id='fd9af065-f73b-4413-842d-38e5990796e6']") 
     
     private WebElement MOduletname;
     
     public WebElement GetMOduletname(){
    	 
    	 return MOduletname;
     }
     
    @FindBy (xpath="//div//ul[@id='studentFilter']/li[@class='filterSelected']") 
     public By Studentcount;
     
     public By Get_Studentcount(){
    	 
    	 return Studentcount;
     }
     
     @FindBy (xpath="//div//ul[@id='studentFilter']/li[@class='filterSelected']") 
     public static By modulescount;
     
     public static By Get_modulescount(){
    	 
    	 return modulescount;
     }


}
