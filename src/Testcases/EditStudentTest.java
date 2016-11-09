package Testcases;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFactory.AddStudent;
import PageObjectFactory.EditStudent;
import PageObjectFactory.Login;
import Pages.AddStudentPage;
import Pages.AdministrationPage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class EditStudentTest {
	
	homepage homepge;
	loginpage lgnpge;
	AddStudentPage addst;
	Webdrivercommonlib wlib;
	AdministrationPage adminpge;
	Login lgn;
	EditStudent estd = PageFactory.initElements(Driver.driver, EditStudent.class);
	AddStudent astd = PageFactory.initElements(Driver.driver, AddStudent.class);
	
	 WebElement e1=estd.get_firstname();
	 WebElement e2=estd.get_lasstname();
	 WebElement e3=astd.get_email();
	 WebElement e4=astd.get_username();
	 WebElement e5=astd.get_password();
	 WebElement e6=astd.get_saveButton();
	 
	
	@BeforeClass
	public void Configure(){
		
		
		
		 homepge = new homepage();
		 lgn=new Login();
		 lgnpge = new loginpage();
		 adminpge=new AdministrationPage();
		 
		 wlib = new Webdrivercommonlib();
		 
		System.out.println("Test cases execution on Edit Student page ");
		System.out.println("--------------------------------------");
		
		
	}
	@Test(priority=1)
	public void NavigateToEditStudent(){
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
        wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
		wlib.waitForPageToLoad();
        homepge.OpenManageStudents();
		wlib.waitForPageToLoad();
		//input[@id='195217']
		adminpge.Click_GroupDropdown();
		adminpge.Click_GroupB();
		wlib.waitForPageToLoad();
		WebElement ele1=Driver.driver.findElement(By.xpath("//a[@href='EditStudent?studentId=195217']"));
		ele1.click();
		wlib.waitForPageToLoad();
		String page = wlib.verifyTitle();
		//System.out.println(page);
		String Expected="Edit Student - SonoSim® Performance Tracker";
		Assert.assertEquals("Not able to open edit student page",Expected,page);
		System.out.println("Edit student page opened successfully");
		
	
	}
	
	@Test(priority=2)
	public void CheckValidationsForEmptyFields(){
		//EMpty firstname
		
		 wlib.waitForPageToLoad();
		 String firstname = e1.getAttribute("value");
		
		 e1.clear();
		
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		
		 String msg=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected="First Name cannot be blank.";
		 Assert.assertEquals("not able to display validation message for empty first name field",expected, msg);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
	     System.out.println("validation message is displyed for empty firstname fields");
		 e1.sendKeys(firstname);
		 
		 //Empty last name
		                                                          
		 String lastname = e2.getAttribute("value");
			                                                     
		 e2.clear();
		                                                           
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		                                                     
		 String msg1=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected1="Last Name cannot be blank.";
		 Assert.assertEquals("not able to display validation message for empty last name field",expected1, msg1);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty last name field");
		 e2.sendKeys(lastname);
		                                                        
		                                                                          
		 //Empty Email 
		                                                                     
		 String email = e3.getAttribute("value");
			
		 e3.clear();
		                                                         
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		                                                          
		 String msg2=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected2="Email cannot be blank.";
		 Assert.assertEquals("not able to display validation message for empty email field",expected2, msg2);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty email field");
		 e3.sendKeys(email);
		 
		 //Empty password This user has been successfully updated.
		                                                     
		 
		 String password = e5.getAttribute("value");
			
		 e5.clear();
		
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		
		 String msg3=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected3="Password cannot be blank.";
		 Assert.assertEquals("not able to display validation message for empty password field",expected3, msg3);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty password field");
		 e5.sendKeys(password);
		 adminpge.Click_BackToPanelOn_AddStudents();
	} 
		 
		 @Test(priority=3)
		 public void UpdateSelectedUser(){
		  
	     WebElement ele1=Driver.driver.findElement(By.xpath("//a[@href='EditStudent?studentId=195217']"));
		 ele1.click();
		 wlib.waitForPageToLoad();	 
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 
		 String msg=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected="This user has been successfully updated.";
		
		 Assert.assertEquals("not able to update selected studentrecord",expected, msg);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("Selected user has been successfully updated.");
		 	 
		 wlib.waitForPageToLoad();
		 adminpge.Click_BackToPanelOn_AddStudents();
	}
	  
		 @Test(priority=4)
		 public void CheckAdministrationCheckbox() throws Throwable{
			 
	     WebElement ele1=Driver.driver.findElement(By.xpath("//a[@href='EditStudent?studentId=195217']"));
		 ele1.click();
		 wlib.waitForPageToLoad();	 
		WebElement Admincheckbox= Driver.driver.findElement(By.xpath("//input[@id='is_admin']"));
		boolean bln=Admincheckbox.isSelected();
		if(bln==true){
			System.out.println("Selected user have administration access");
		}
		else{
			
		 Admincheckbox.click();
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 wlib.waitForPageToLoad();	
		 WebElement ele=Driver.driver.findElement(By.xpath("//button[@class='confirm']"));
		 Thread.sleep(3000); 
		 ele.click();
		 
		 wlib.waitForPageToLoad();	
		  
		 System.out.println("Selected user has been successfully updated.");
		/*boolean bln = Driver.driver.findElement(By.xpath("//tr[@data-username='test11']/td[3]/i")).isEnabled();*/
		
		Assert.assertTrue("Selected student not have administration access",isElementPresent(By.xpath("//tr[@data-username='test11']/td[3]/i")));
		System.out.println("Selected student updated to Administration access");
		}
		 }

		 public boolean isElementPresent(By by){
			    try {
			        Driver.driver.findElement(by);
			        return true;
			    }
			    catch (org.openqa.selenium.NoSuchElementException e){
			        return false;
			    }
			} 		 
		
		 @AfterClass
			public void teardown(){
				
				System.out.println("-----------------------------------------------");
				
			}
 
		 
		 
		 
}
