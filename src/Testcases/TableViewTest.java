package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import PageObjectFactory.Home;
import PageObjectFactory.Login;
import PageObjectFactory.Radial;
import PageObjectFactory.Table;
import Pages.RadialViewpage;
import Pages.TableViewpage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class TableViewTest {
	
	
	Login log;
	loginpage lgnpge;
	homepage hmpge;
	
	Radial rdl;
	Home hm=PageFactory.initElements(Driver.driver, Home.class);
	Webdrivercommonlib wlib;
	TableViewpage tblpge;
	RadialViewpage rdlpge;
	
	
	@BeforeClass
	public void configure(){
		
		log = new Login();
		lgnpge = new loginpage();
		hmpge = new homepage();
		
		Radial rdl = PageFactory.initElements(Driver.driver, Radial.class);
		Table tble = PageFactory.initElements(Driver.driver, Table.class);
		
		rdlpge = new RadialViewpage();
		wlib = new Webdrivercommonlib();
	    
		System.out.println("Test cases execution on TableView page ");
		System.out.println("--------------------------------------");
		
	}
	
	@Test(priority=1)
	public void OpenTableView_for_PerformtGroup_A_Student(){
		
	
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		WebElement ele = hm.NavigateHome();//Driver.driver.findElement(By.xpath("//span/a[@href='/SonosimPortal/classes']"));
		JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenTableView();
		
		wlib.waitForPageToLoad();
		
		rdlpge.openfilteroptions();
		
		wlib.waitForPageToLoad();
		
		rdlpge.Selectgroup();
		
		rdlpge.Click_Filter_PerformGroup_A();
		wlib.waitForPageToLoad();
		String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(grpname);
		
        String Expected = "Performance Tracker (Group A)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Table view for Performance Group A ");
		
		
	}
	
	@Test(priority=2)
	public void OpenTableView_for_PerformtGroup_B_Student() throws InterruptedException{
	
      lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		WebElement ele = hm.NavigateHome();//Driver.driver.findElement(By.xpath("//span/a[@href='/SonosimPortal/classes']"));
		JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenTableView();
		
		wlib.waitForPageToLoad();
		rdlpge.openfilteroptions();
		
        rdlpge.Selectgroup();
        WebElement ele1 =Driver.driver.findElement(By.xpath("//div/ul[@id='groupFilter']/li[2]/a"));
        
        JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele1);
        
		wlib.waitForPageToLoad();
        String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(grpname);
		
		String Expected = "Performance Tracker (Group B)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Table view for Performance Group B");
		
	}
	
	@Test(priority=3)
	public void OpenTableView_for_PerformtGroup_C_Student() throws InterruptedException{
	
	  
	    
	     lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			WebElement ele = hm.NavigateHome();//Driver.driver.findElement(By.xpath("//span/a[@href='/SonosimPortal/classes']"));
			JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
			exe.executeScript("arguments[0].click();", ele);
			
			wlib.waitForPageToLoad();
			
			hmpge.OpenTableView();
			
			wlib.waitForPageToLoad();
		
		rdlpge.openfilteroptions();
		
        rdlpge.Selectgroup();
		
        WebElement ele1 =Driver.driver.findElement(By.xpath("//div/ul[@id='groupFilter']/li[3]/a"));
        
        JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele1);
		wlib.waitForPageToLoad();
        String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
        wlib.waitForPageToLoad(); 
        
		System.out.println(grpname);
		
        String Expected = "Performance Tracker (Group C)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Table view for Performance Group C ");
		
	
	}
	
	@Test(priority=4)
	public void Check_validationmessage_unselectall(){
	
	     lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			WebElement ele = hm.NavigateHome();//Driver.driver.findElement(By.xpath("//span/a[@href='/SonosimPortal/classes']"));
			JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
			exe.executeScript("arguments[0].click();", ele);
			
			wlib.waitForPageToLoad();
			
			hmpge.OpenTableView();
			
			wlib.waitForPageToLoad();
		
		    rdlpge.openfilteroptions();
			
			rdlpge.Selectsubgroup();
			
			rdlpge.Click_SubgroupFilter_UnselectAllBtn();
			
			rdlpge.Selectstudents();
			
			rdlpge.Click_StudentFilter_UnselectAllBtn();
			
			rdlpge.Selectmodules();
			
			rdlpge.Click_ModulesFilter_UnselectAllBtn();
		
		    rdlpge.Click_ModulesApplyBtn();
		                                                         
		    wlib.waitForPageToLoad();
		    
		    String message = Driver.driver.findElement(By.xpath(".//*[@id='displayMessage']/table/tbody/tr/th/h2")).getText();
		    
		   // System.out.println(message);
		    
		    String Expected = "No data to display.";
		    
		    AssertJUnit.assertEquals(Expected,message);
		    
		    System.out.println("Validation message displayed for empty data");
		 
	}
	    @Test (priority=5)
	    public void check_selectAllbtn(){
	        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			WebElement ele = hm.NavigateHome();//Driver.driver.findElement(By.xpath("//span/a[@href='/SonosimPortal/classes']"));
			JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
			exe.executeScript("arguments[0].click();", ele);
			
			wlib.waitForPageToLoad();
			
			hmpge.OpenTableView();
			
			wlib.waitForPageToLoad();
	    		
	    		    rdlpge.openfilteroptions();
	    			
	    			rdlpge.Selectsubgroup();
	    			
	    			rdlpge.Click_SubgroupFilter_selectAllBtn();
	    			
	    			rdlpge.Selectstudents();
	    			
	    			rdlpge.Click_StudentFilter_selectAllBtn();
	    			
	    			rdlpge.Selectmodules();
	    			
	    			rdlpge.Click_ModulesFilter_selectAllBtn();
	    		
	    		    rdlpge.Click_ModulesApplyBtn();
	    		    
	    		    wlib.waitForPageToLoad();
	    		    
	    		  boolean msg =  Driver.driver.findElement(By.xpath(".//*[@id='displayMessage']/table/tbody/tr/th/h2")).isDisplayed();
	    		  
	    		  if(msg==true){
	    			  System.out.println("Select all button is not working");
	    		  }
	    		  else
	    		  {
	    			  System.out.println("Select All button is working");
	    		  }
	    		
	    		  
	    }
	
	    @Test(priority=6)
	    public void Open_RadialView_FromTablepage()
	    {
	    	lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenRadialView();
			
			wlib.waitForPageToLoad();
			
	    	rdlpge.Click_RadialView_Link();
	    	 
	    	String test=wlib.verifyTitle();
	    	System.out.println(test);
	    	
	    	
	    	System.out.println("--------------------------------------");
	    	
	    }
	    
	    @Test(priority=7)
	    public void Open_Module_Table()
	    {
	      
	    
            lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenTableView();
			
			wlib.waitForPageToLoad();
	    	wlib.waitForPageToLoad();
	    	rdlpge.openfilteroptions();
	    	rdlpge.Selectstudents();
	    	rdlpge.Click_StudentFilter_UnselectAllBtn();
	    	rdlpge.Click_studentname();
	    	rdlpge.Selectmodules();
	    	rdlpge.Click_ModulesFilter_UnselectAllBtn();
	    	rdlpge.Click_Modulename();
	    	
	    }
	   
	    @Test(enabled=false)
	    public void TotalModulesCount()
	    {
	    	
            lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenTableView();
			
			wlib.waitForPageToLoad();
	    	wlib.waitForPageToLoad();
	    	rdlpge.openfilteroptions();
	    	rdlpge.Selectstudents();
	    	rdlpge.Click_StudentFilter_selectAllBtn();
	    	rdlpge.Selectmodules();
	    	rdlpge.Click_ModulesFilter_selectAllBtn();
	    	List<WebElement> ele1 = Driver.driver.findElements(By.xpath("//table[@id='classTable']/thead/tr/th"));
	    	rdlpge.Click_ModulesApplyBtn();
	    	wlib.waitForPageToLoad();
	    	
	    	List<WebElement> ele2 = Driver.driver.findElements(By.xpath("//table[@id='classTable']/thead/tr/th"));
	    	
	    	if(ele1.size()==ele2.size()){
	    		
	    		System.out.println("All the selected modules are displayed on the table view page ");
	    		System.out.println("Total modules =" + ele1.size());
	    		System.out.println("Total modules displayed =" + ele2.size());
	    	}
	    	else{
	    		System.out.println("Not able to display all selected modules on the table view page");
	    	}
	    
	    	
	    }
	    @Test(enabled=false)
	    public void Totalstudentcount()
	    {
	    	
	        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);	
			wlib.waitForPageToLoad();	
			hmpge.navigateTOhome();	
			hmpge.OpenTableView();		
			wlib.waitForPageToLoad();
		   	wlib.waitForPageToLoad();
		   	rdlpge.openfilteroptions();
		   	rdlpge.Selectstudents();
		   	rdlpge.Click_StudentFilter_UnselectAllBtn();
		   	rdlpge.Click_StudentFilter_selectAllBtn();
	    	
		   	List<WebElement> ele1= Driver.driver.findElements(By.xpath("//div//ul[@id='studentFilter']/li[@class='filterSelected']"));	 
		    int count=ele1.size();
		   // System.out.println("Total no. of students "+count);
		    
		    rdlpge.Click_studentsApplyBtn();   	
	        wlib.waitForPageToLoad();
		    List<WebElement> ele2= Driver.driver.findElements(By.xpath("//table[@id='classTable']/tbody/tr"));
		    	 
		    int countrpage=ele2.size();
		   // System.out.println("Total no. of students on radial view page "+countrpage);
		    
		    
		    AssertJUnit.assertEquals("Not able to displayed all selected students on radial view page",count,countrpage);
		    
		    System.out.println(" all selected students are displayed on radial view page");
		    
		    wlib.waitForPageToLoad();
		    
		    String test1=  wlib.getScreensht(Driver.driver,"tableviewstudents");
           
		    }
		    
	   @AfterClass
	public void Close_Test(){
		
		   System.out.println("--------------------------------------");
		
		
	}
	
	
}

