package Testcases;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFactory.Login;
import PageObjectFactory.Radial;
import Pages.RadialViewpage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class Modulespage_RadialView {
	
	Login log;
	loginpage lgnpge;
	homepage hmpge;
	
	Radial rdl;
	
	Webdrivercommonlib wlib;
	
	RadialViewpage rdlpge;
	
	@BeforeClass
	public void configure(){
		
		log = new Login();
		lgnpge = new loginpage();
		hmpge = new homepage();
		
		Radial rdl = PageFactory.initElements(Driver.driver, Radial.class);
		
		rdlpge = new RadialViewpage();
		wlib = new Webdrivercommonlib();
		
		System.out.println("Test cases execution on Modules page from radial view ");
		System.out.println("--------------------------------------");
		
	}
	
	 @Test(priority=1)
	    public void Open_Modulespage_RadialView()
	    {
         lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenRadialView();
			
			wlib.waitForPageToLoad();
	    	wlib.waitForPageToLoad();
	    	rdlpge.openfilteroptions();
	    	rdlpge.Selectstudents();
	    	rdlpge.Click_StudentFilter_UnselectAllBtn();
	    	rdlpge.Click_studentname();
	    	rdlpge.Selectmodules();
	    	rdlpge.Click_ModulesFilter_UnselectAllBtn();
	    	rdlpge.Click_Modulename();
	    	rdlpge.Click_ModulesApplyBtn();
	    	String expected="Overview - SonoSim® Performance Tracker";
	    	String actual=wlib.verifyTitle();
	    	Assert.assertEquals(actual,expected);
	    }
	
	 @Test(priority=2)
		public void Check_validationmessage_unselectall(){
			
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
			    
			    Assert.assertEquals(Expected,message);
			    
			    System.out.println("Validation message displayed for empty data");
			    
		}
		 
	 @Test (priority=3)
	    public void check_selectAllbtn(){
	    		
	    	
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
	 
	       @Test(priority=5)
	  	    public void Open_TableView_FromModulespage(){
	       	
	    		wlib.waitForPageToLoad();
		    	wlib.waitForPageToLoad();
		    	rdlpge.openfilteroptions();
		    	rdlpge.Selectstudents();
		    	rdlpge.Click_StudentFilter_UnselectAllBtn();
		    	rdlpge.Click_studentname();
		    	rdlpge.Selectmodules();
		    	rdlpge.Click_ModulesFilter_UnselectAllBtn();
		    	rdlpge.Click_Modulename();
		    	rdlpge.Click_ModulesApplyBtn();
	    				
	   		wlib.waitForPageToLoad();
	    				
	       	rdlpge.Click_TableView_Link();
	    		    	 
	       	String test=wlib.verifyTitle();
	       	
	       	System.out.println(test);
	    		    	
	    		    	
	     	System.out.println("--------------------------------------");
	    		    	
	    		    }
	       
	       @Test(priority=4)
	  	    public void Open_Modulespage_ForSelectedStudent(){
	       	
	    		wlib.waitForPageToLoad();
		    	wlib.waitForPageToLoad();
		    	rdlpge.openfilteroptions();
		    	rdlpge.Selectstudents();
		    	rdlpge.Click_StudentFilter_UnselectAllBtn();
		    	//String selected=Driver.driver.findElement(By.xpath("//div/ul/li/input[@id='196870']")).getText();
		    	rdlpge.Click_studentname();
		    	rdlpge.Selectmodules();
		    	rdlpge.Click_ModulesFilter_UnselectAllBtn();
		    	rdlpge.Click_Modulename();
		    	rdlpge.Click_ModulesApplyBtn();
	    				
	   		wlib.waitForPageToLoad();
	       	
	        String displayed=Driver.driver.findElement(By.xpath("//h3")).getText();
	        
	      //  Assert.assertEquals("Not able to display selected student on modules page",selected,displayed);
	    		    	
	    		System.out.println(displayed); 
	    		
	     	System.out.println("--------------------------------------");
	    		    	
	    		    }
  
	    }



