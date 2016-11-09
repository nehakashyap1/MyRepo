package Testcases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import PageObjectFactory.Login;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class LoginTest {

	
	Login lgn;
	loginpage lgnpge;
	
	Webdrivercommonlib wlib;
	
	//String browse="Chrome";
	//Login lgn = PageFactory.initElements(Driver.getbrowser(browse), Login.class);
	
	@BeforeClass
	public  void configure(){
	 
	lgnpge = new loginpage();
	lgn = PageFactory.initElements(Driver.driver, Login.class);
	wlib = new Webdrivercommonlib();
	
	System.out.println("Test cases execution on Login page ");
	System.out.println("--------------------------------------");
	}
	
	@BeforeMethod
	public void startlogin(){
		
		System.out.println("Login to Sonosim");
			
	}
	@Test(priority = 1)
	public void ValidLoginToSonosm() throws InterruptedException{
		
		
		
	    lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		Thread.sleep(3000);
	    wlib.waitForPageToLoad();
	    wlib.getScreensht(Driver.driver, "logins");
		String actual = wlib.verifyTitle();
		
		//System.out.println(actual);
		
		String Expected= "Group View - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected, actual);
		
		System.out.println("Log in successful");
		wlib.getScreensht(Driver.driver, "logins");
		
		
	}
	
	
		@Test(priority=2)
	public void InvalidloginToSonosim() throws IOException, InterruptedException{
		
		lgnpge.LoginToSonosim("test", "test", constant.url);
		wlib.waitForPageToLoad();
		wlib.waitForPageToLoad();
		
        
		String Actul =wlib.verifyTitle();
		String Expected = "Login - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,Actul);
		
			System.out.println("Validation message is displayed for invalid login ");
			
			System.out.println("--------------------------------------");
		
		Thread.sleep(3000);
		wlib.getScreensht(Driver.driver,"loginfail");
		
		}
       
        
        
        
	}
	
	
	 /* @AfterMethod
		public void LogoutSonosim()
		{
			
		lgnpge.ClickuserDropdwn();	
		
		lgnpge.logoutSonosim();
		wlib.waitForPageToLoad();
		
		String ttl = wlib.verifyTitle();
		System.out.println(ttl);
		
		String etl = "Login - SonoSim® Performance Tracker";
		
		AssertJUnit.assertEquals(etl,ttl);
		wlib.waitForPageToLoad();
		
		wlib.getScreensht(Driver.driver);
	
		}*/
	
	
	
	

