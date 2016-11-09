package Testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFactory.Login;
import Pages.Runreportspage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class RunReportTest {
	
	
	Login lgn;
	
	loginpage lgnpge;
	
	Runreportspage run;
	Webdrivercommonlib wlib;
	homepage homepge;
	
	@BeforeClass
	public void configure(){
		
		run = PageFactory.initElements(Driver.driver, Runreportspage.class);
		homepge = new homepage();
		 
		 lgnpge = new loginpage();
		 
		 wlib = new Webdrivercommonlib();
	}
	@Test(priority=1)
	public void NavigateTo_RunReportsPage(){
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		homepge.navigateTOhome();
		wlib.waitForPageToLoad();
        homepge.OpenRunReports();
		
		wlib.waitForPageToLoad();
		
		String report = wlib.verifyTitle();
		 
		String Expected = "Reports - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,report);
		
		System.out.println("RunReport  page opened successfuly");
		
		
	}
	  @Test(priority=2)
       public void RunReports_OpenPerformanceGroupA(){
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
	    wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
        homepge.OpenRunReports();
		
		wlib.waitForPageToLoad();
		
		run.ClickPerformanceGrp_A();
		wlib.waitForPageToLoad();
		
		String sel=Driver.driver.findElement(By.xpath("//li[@class='filterSelected active']/a")).getText();
		String expected="Performance Tracker (Group A)";
		Assert.assertEquals("Group A not selected",expected,sel);
		System.out.println("RunReport  page for PerformanceGroupA opened successfuly");
		
		
	}
	  @Test(priority=3)
      public void RunReports_OpenPerformanceGroupB(){
		
		
		wlib.waitForPageToLoad();
		
		run.ClickPerformanceGrp_B();
		wlib.waitForPageToLoad();
		
		String sel=Driver.driver.findElement(By.xpath("//li[@class='filterSelected active']/a")).getText();
		String expected="Performance Tracker (Group B)";
		Assert.assertEquals("Group B not selected",expected,sel);
		System.out.println("RunReport  page for PerformanceGroupB opened successfuly");
		
		
	}
	  @Test(priority=4)
      public void RunReports_OpenPerformanceGroupC(){
		
		
		wlib.waitForPageToLoad();
		
		run.ClickPerformanceGrp_C();
		wlib.waitForPageToLoad();
		
		String sel=Driver.driver.findElement(By.xpath("//li[@class='filterSelected active']/a")).getText();
		String expected="Performance Tracker (Group C)";
		Assert.assertEquals("Group C not selected",expected,sel);
		System.out.println("RunReport  page for PerformanceGroupC opened successfuly");
		
		
	}
	  @Test(priority=5)
	public void ValidationMessage_for_NOstudentselected() throws InterruptedException{
		
		
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
	    wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
        homepge.OpenRunReports();
		
		wlib.waitForPageToLoad();
		
		run.Click_GenerateReport_Button();
		Thread.sleep(2000);
		String msg=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		String expected="Please select at least one student.";
		
		Assert.assertEquals("No validation message or message is changed",expected, msg);
		System.out.println("validation message is displayed for no student selection");
		Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
		
	}
	  @Test(priority=5)
		public void ValidationMessage_for_NOModules_selected() throws InterruptedException
	  {
			
	        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
		    wlib.waitForPageToLoad();
			
			homepge.navigateTOhome();
			
	        homepge.OpenRunReports();
			
			wlib.waitForPageToLoad();
			WebElement ele=Driver.driver.findElement(By.xpath("//ul[@id='studentFilter']/li[1]/input"));
            JavascriptExecutor exe=(JavascriptExecutor)Driver.driver;
            exe.executeScript("arguments[0].click();", ele);
			run.Click_GenerateReport_Button();
			Thread.sleep(2000);
			String msg=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
			String expected="Please select at least one module.";
			
			Assert.assertEquals("No validation message or message is changed",expected, msg);
			System.out.println("validation message is displayed for no modules selection");
			Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
			
			
		}
	  
	/*  @Test(priority=5)
		public void Download_DetailReport_PDFFormat(){
	  {
			
	        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
		    wlib.waitForPageToLoad();
			
			homepge.navigateTOhome();
			wlib.waitForPageToLoad();
	        homepge.OpenRunReports();
			
			wlib.waitForPageToLoad();
			
			
			
			run.ClickRportTypeDropdown();
			
			run.SelectDetailReportFromDropdown();
			
			run.ClickFormatTypeDropdown();
			
			run.SelectPDFFromDropdown();
			
			
				
	  }*/
	  @AfterClass
		public void teardown(){
		  
		  
            wlib.DeleteCookies();
            wlib.Quit_Browser();
		  
			
			System.out.println("-----------------------------------------------");
			
		}
	  
	  
	  
	
	

}
