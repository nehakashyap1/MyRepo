package PageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RunReports {

	
	
  @FindBy (xpath="//a[@title='Performance Tracker (Group A)']")
	
	WebElement PerformanceGroupA;
	
	public WebElement getPerGrpA(){
		return PerformanceGroupA;
		
	}
	
  @FindBy (xpath="//a[@title='Performance Tracker (Group B)']")
		
		WebElement PerformanceGroupB;
		
		public WebElement getPerGrpB(){
			return PerformanceGroupB;
		}
		
  @FindBy (xpath="//a[@title='Performance Tracker (Group C)']")
		
		WebElement PerformanceGroupC;
		
		public WebElement getPerGrpC(){
			return PerformanceGroupC;
		}	
	
  @FindBy (xpath="//select[@id='report_dropdown']")
			
			WebElement ReportDropdown;
			
			public WebElement getRepDrpDwn(){
				return ReportDropdown;
			}
	
  
 @FindBy (xpath="//select[@id='report_dropdown']/option[@value='detail']")
			
	    	WebElement DetailReport;
				
			public WebElement getDetailReportOption()
			{
					return DetailReport;
					
					
				}	
@FindBy (xpath="//select[@id='report_dropdown']/option[@value='summary']")
			
	    	WebElement summaryReport;
				
			public WebElement getsummaryReportOption()
			{
					return summaryReport;
					
					
				}				
 	@FindBy (xpath="//select[@id='format_dropdown']")
			
	    	WebElement FileFormatDrp;
				
			public WebElement getFileDrpdwn()
			{
					return FileFormatDrp;
					
					
				}
			
   
    @FindBy (xpath="//select[@id='format_dropdown']/option[@value='pdf']")
			
	    	WebElement PDF;
				
			public WebElement getPDFoption()
			{
					return PDF;
					
					
				}		
    @FindBy (xpath="//select[@id='format_dropdown']/option[@value='CSV']")
				
		    	WebElement CSV;
					
				public WebElement getCSVOption()
				{
						return CSV;
						
						
					}			
		
     @FindBy (id="generatepdf")
				
		WebElement GenerateReportButton;
					
	public WebElement getGenReportBtn()
				{
						return GenerateReportButton;
						
						
					}
	 @FindBy (xpath="//input[@id='allsubgroups'and @value='Select All']")
		
		WebElement Subgroup_SelectAll_Btn;
					
	public WebElement getSubgroup_SelectAll_Btn()
				{
						return Subgroup_SelectAll_Btn;
						
						
					}
	
	 @FindBy (xpath="//input[@id='allsubgroups'and @value='Unselect All']")
		
		WebElement Subgroup_UnSelectAll_Btn;
					
	public WebElement getSubgroup_UnSelectAll_Btn()
				{
						return Subgroup_UnSelectAll_Btn;
						
						
					}
	
	
	
	
	 @FindBy (xpath="//input[@id='allStudents'and @value='Select All']")
		
		WebElement Students_SelectAll_Btn;
					
	public WebElement getStudents_SelectAll_Btn()
				{
						return Students_SelectAll_Btn;
						
						
					}
	
	 @FindBy (xpath="//input[@id='allStudents'and @value='Unselect All']")
		
		WebElement Students_UnSelectAll_Btn;
					
	public WebElement getStudents_UnSelectAll_Btn()
				{
						return Subgroup_UnSelectAll_Btn;
						
						
					}
	
	 @FindBy (xpath="//input[@id='modulesSelectButton'and @value='Select All']")
		
		WebElement modulesSelectButton;
					
	public WebElement get_modules_SelectAllButton()
				{
						return modulesSelectButton;
						
						
					}
	
	 @FindBy (xpath="//input[@id='modulesSelectButton'and @value='Unselect All']")
		
		WebElement Modules_UnSelectAll_Btn;
					
	public WebElement getModules_UnSelectAll_Btn()
				{
						return Modules_UnSelectAll_Btn;
						
						
					}
	
	
	
}
