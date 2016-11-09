package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.RunReports;
import UtilityFiles.Driver;

public class Runreportspage {
	
	
	
	RunReports rep=PageFactory.initElements(Driver.driver, RunReports.class);
	
	
	public void ClickPerformanceGrp_A()
	{
		
		
		rep.getPerGrpA().click();
	}
	
    public void ClickPerformanceGrp_B()
    {
		
		
		rep.getPerGrpB().click();
	}
    
    public void ClickPerformanceGrp_C()
    {
		
		
		rep.getPerGrpC().click();
		
		
	}
    public void ClickRportTypeDropdown()
    {
		
		
		rep.getRepDrpDwn().click();
		
		
	}
	
    public void SelectDetailReportFromDropdown()
    {
		
		
		rep.getDetailReportOption().click();
		
		
	}
    public void SelectSummaryReportFromDropdown()
    {
		
		
		rep.getsummaryReportOption().click();
		
		
	}
    
    public void ClickFormatTypeDropdown()
    {
		
		
		rep.getFileDrpdwn().click();
		
		
	}
    public void SelectPDFFromDropdown()
    {
		
		
		rep.getPDFoption().click();
		
		
	}
    public void SelectCSVFromDropdown()
    {
		
		
		rep.getCSVOption().click();
		
		
	}
    public void Click_GenerateReport_Button()
    {
		
		
		rep.getGenReportBtn().click();
		
		
	}
    
	

}
