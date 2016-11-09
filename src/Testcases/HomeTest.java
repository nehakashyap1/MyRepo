package Testcases;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectFactory.Home;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class HomeTest {

	Home hm;
	
	homepage homepge;
	
	Webdrivercommonlib wlib;
	
	loginpage lgnpge;
	
	@BeforeClass
	public void configure(){
		
		
		 hm = PageFactory.initElements(Driver.driver, Home.class);
			
		 homepge = new homepage();
		 
		 lgnpge = new loginpage();
		 
		 wlib = new Webdrivercommonlib();
		 
		System.out.println("Test cases execution on Home page ");
		System.out.println("--------------------------------------");
		 
	}
	
	@Test(priority =1)
	public void OpenRadialView()
	{
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
		wlib.waitForPageToLoad();
		
		//String grpname = Driver.driver.findElement(By.xpath("//div/small")).getText();
		
		//System.out.println(grpname);
		
		
		homepge.OpenRadialView();
		
		wlib.waitForPageToLoad();
		
		String radial = wlib.verifyTitle();
		
		String Expected = "Overview - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,radial);
		
		System.out.println("Radial view page opened successfuly");
		
	}
	
	    @Test(priority =2)
        public void OpenTableView()
	    {
		
		homepge.OpenTableView();
		
		wlib.waitForPageToLoad();
		
		String table = wlib.verifyTitle();
		
		String Expected = "Class - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,table);
		
		System.out.println("Table view page opened successfuly");
		
	    }
	    
	    @Test(priority =3)
        public void OpenReportPage()
	    {
		
		homepge.OpenRunReports();
		
		wlib.waitForPageToLoad();
		
		String report = wlib.verifyTitle();
		 
		String Expected = "Reports - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,report);
		
		System.out.println("Report Download page opened successfuly");
	    
	    }
	    
	    @Test(priority =4)
        public void OpenAdminPage()
	    {
		
		homepge.OpenManageStudents();
		
		wlib.waitForPageToLoad();
		
		String admin = wlib.verifyTitle();
		 
		String Expected = "Administration - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,admin);
		
		System.out.println("Administration page opened successfuly");
	    
	    }
	    
	    @Test(priority=5)
	    public void Opengroupselctpage()
	    {
	    	homepge.navigateTogrpselect();
	    	
	    	wlib.waitForPageToLoad();
	    	
	    	String title = wlib.verifyTitle();
	    	System.out.println(title);
	    	String Expected = "Group View - SonoSim® Performance Tracker";
	    	Assert.assertEquals(Expected,title);
	    	System.out.println("Group select page opened successfuly");
	    }
	    
	    @Test(priority=6)
	    public void open_homepage_fromdropdown()
	    {
	    	
	    	lgnpge.ClickuserDropdwn();
	    	homepge.ClickDrpdwnHome();
	    	wlib.waitForPageToLoad();
	    	String act = wlib.verifyTitle();
	    	String Expected= "Home - SonoSim® Performance Tracker";
			
			Assert.assertEquals(Expected, act);
			
			System.out.println("Home page from dropdown opened successfully");
	    	
	    }
	    
	    @Test(priority=7)
	    public void open_Administrationpage_fromdropdown()
	    {
	    	lgnpge.ClickuserDropdwn();
	    	homepge.ClickDrpdwnAdmin();
	    	wlib.waitForPageToLoad();
	    	String act = wlib.verifyTitle();
	    	String Expected= "Administration - SonoSim® Performance Tracker";
			
			Assert.assertEquals(Expected, act);
			
			System.out.println("Administration page from dropdown opened successfully");
	    }
	    
	    @Test(priority=8)
	    public void open_ReportDownloadpage_fromdropdown()
	    {
	    	lgnpge.ClickuserDropdwn();
	    	homepge.ClickDrpdwnReports();
	    	wlib.waitForPageToLoad();
	    	String act = wlib.verifyTitle();
	    	String Expected= "Reports - SonoSim® Performance Tracker";
			
			Assert.assertEquals(Expected, act);
			
			System.out.println("Reports page from dropdown opened successfully");
	    }
	    
	  //  @Test(priority=9)
	  // public void open_Helppage_fromdropdown(){
	  //  	lgnpge.ClickuserDropdwn();
	  //  	homepge.ClickDrpdwnHelp();
	   // 	wlib.waitForPageToLoad();
	    	/*String act = wlib.verifyTitle();
	    	String Expected= "Home - SonoSim® Performance Tracker";
			
			AssertJUnit.assertEquals(Expected, act);
			
			System.out.println("Home page from dropdown opened successful");*/
	  //  }
	    
	  /*  @Test(priority=10)
	  //  public void contactuspage_fromdropdown(){
	    	lgnpge.ClickuserDropdwn();
	  //  	homepge.ClickDrpdwnContactUs();
	    	wlib.waitForPageToLoad();
	    	String act = wlib.verifyTitle();
	    	String Expected= "Contact Us - SonoSim® Performance Tracker";
			
			Assert.assertEquals(Expected, act);
			
			System.out.println("ContactUs page from dropdown opened successful");
	    }*/
	    @Test(priority=11)
	    public void Logout_link_frmdropdown()
	    {
	    	lgnpge.ClickuserDropdwn();
	    	homepge.ClickDrpdwnLogout();
	    	wlib.waitForPageToLoad();
	    	String act = wlib.verifyTitle();
	    	String Expected= "Login - SonoSim® Performance Tracker";
			
			Assert.assertEquals(Expected, act);
			
			System.out.println("Logout successfully");
			
			lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			System.out.println("--------------------------------------");
			
	    }
	@AfterMethod
	public void Start()
	{
		
		wlib.waitForPageToLoad();
		
		WebElement ele = Driver.driver.findElement(By.xpath("//span/a[@href='/SonoSim-Performance-Tracker/classes']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele);
		
		//homepge.navigateTOhome();
		
	}
	
	@BeforeMethod
	public void waiting(){
		
		wlib.waitForPageToLoad();
		
	}

	
		
	
}
