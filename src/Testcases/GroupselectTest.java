package Testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFactory.Groupview;
import PageObjectFactory.Home;
import PageObjectFactory.Login;
import Pages.GroupselectPage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class GroupselectTest {
	
    Login logn;
	loginpage lognpge;
	homepage hompge;
	Home hm= PageFactory.initElements(Driver.driver, Home.class);
	GroupselectPage grpsel;
	Webdrivercommonlib wlib;
	Groupview grp;
	@BeforeClass
	public void configure(){
		
		logn = new Login();
		lognpge = new loginpage();
		hompge = new homepage();
		 grpsel = new GroupselectPage();
		Groupview grp = PageFactory.initElements(Driver.driver, Groupview.class);
        
		wlib = new Webdrivercommonlib();
		
		System.out.println("Test cases execution on GroupView page ");
		System.out.println("--------------------------------------");
		
	}
     
	@Test(priority=1)
	public void Open_PerformanceGroup_A()
	{
		
		lognpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		wlib.waitForPageToLoad();
		grpsel.Click_PerformGroupA();
		String grpname = Driver.driver.findElement(By.xpath("//div/small")).getText();
		
		System.out.println(grpname);
		
		String Expected = "Performance Tracker (Group A)";
		
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Performance Group A Opened successfully");
		
			
	}
	
	@Test(priority=2)
    public void Open_PerformanceGroup_B()
	{
		
		
		wlib.waitForPageToLoad();
		grpsel.Click_PerformGroupB();
		
        String grpname = Driver.driver.findElement(By.xpath("//div/small")).getText();
        
        System.out.println(grpname);
		
		String Expected = "Performance Tracker (Group B)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Performance Group B Opened successfully");
			
	}
	
	@Test(priority=3)
    public void Open_PerformanceGroup_C()
	{
		
		
		wlib.waitForPageToLoad();
		grpsel.Click_PerformGroupC();
		
        String grpname = Driver.driver.findElement(By.xpath("//div/small")).getText();
        
        System.out.println(grpname);
		
		String Expected = "Performance Tracker (Group C)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Performance Group C Opened successfully");
		
		System.out.println("--------------------------------------");
		
		
	}
	
	@AfterMethod
	public void start()
	{
		wlib.waitForPageToLoad();
		WebElement ele=hm.returngroupsel();
		
		JavascriptExecutor exe = (JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
		//hompge.navigateTogrpselect();
	}
	
}
