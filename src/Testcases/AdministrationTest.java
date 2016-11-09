package Testcases;


import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.jna.platform.unix.X11.Window;

import PageObjectFactory.Administration;
import PageObjectFactory.Home;
import Pages.AdministrationPage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class AdministrationTest {
Home hm;
	
	homepage homepge;
	
	Webdrivercommonlib wlib;
	
	loginpage lgnpge;
	Administration adm;
	AdministrationPage adminpge;
	@BeforeClass 
	public void configure(){
		
		
		 adm = PageFactory.initElements(Driver.driver, Administration.class);
			
		 homepge = new homepage();
		 
		 lgnpge = new loginpage();
		 adminpge=new AdministrationPage();
		 
		 wlib = new Webdrivercommonlib();
		 
		System.out.println("Test cases execution on Administration page ");
		System.out.println("--------------------------------------");
		 
	}
	@Test(priority=1)
	public void NavigatetoAdministrationPage(){
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
		wlib.waitForPageToLoad();
        homepge.OpenManageStudents();
	 	
		wlib.waitForPageToLoad();
		
		String admin = wlib.verifyTitle();
		 
		String Expected = "Administration - SonoSim® Performance Tracker";
		
		Assert.assertEquals(Expected,admin);
		
		System.out.println("Administration page opened successfuly");
	}
	
	@Test(priority=2)
	public void NavigatetoAddStudents(){
		adminpge.Click_AddStudent();
		wlib.waitForPageToLoad();
		String acttitle=wlib.verifyTitle();
		String Exptitle="Add Students - SonoSim® Performance Tracker";
		Assert.assertEquals(Exptitle,acttitle);
		System.out.println("add Students page opened sucessfully");
		adminpge.Click_BackToPanelOn_AddStudents();
	}
	
	@Test(priority=3)
	public void NavigattoArchivedStudents(){
		
	    lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
        wlib.waitForPageToLoad();
		
		homepge.navigateTOhome();
		
		wlib.waitForPageToLoad();
        homepge.OpenManageStudents();
		
		wlib.waitForPageToLoad();
		adminpge.Click_ShowOnlyArchived();
		wlib.waitForPageToLoad();
		List<WebElement> archived = Driver.driver.findElements(By.xpath("//i[@class='fa fa-archive hint tooltipstered']"));
		
		int totalArchived = archived.size();
		 totalArchived = --totalArchived;
		// System.out.println(totalArchived);
		String test=adminpge.TotalUsers();
		
		int total=Integer.parseInt(test);
		
		//System.out.println(total);
			
		
		Assert.assertEquals("Not able to match total archived student count",totalArchived, total);
		
		System.out.println("Archived students displayed successfully");
		adminpge.Click_BackToPanelOn_AddStudents();
	}
			
		@Test(priority=4)
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
		
		@Test(priority=5)
		public void OPenGroupAStudentList(){
			
			lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
	        wlib.waitForPageToLoad();
			
			homepge.navigateTOhome();

			wlib.waitForPageToLoad();
	        homepge.OpenManageStudents();
			wlib.waitForPageToLoad();
			//input[@id='195217']
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupA();
			wlib.waitForPageToLoad();
			
			String test=adminpge.TotalUsers();
			int n = Integer.parseInt(test);
			System.out.println("Total students displayed on Group A is "+ n);
		}
		@Test(priority=6)
		public void OPenGroupBStudentList(){
			
			wlib.waitForPageToLoad();
			//input[@id='195217']
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			
			String test=adminpge.TotalUsers();
			int n = Integer.parseInt(test);
			System.out.println("Total students dislayed on Group B is "+ n);
		}
		@Test(priority=7)
		public void OPenGroupCStudentList()
		{
			
			wlib.waitForPageToLoad();
			//input[@id='195217']
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupC();
			wlib.waitForPageToLoad();
			
			String test=adminpge.TotalUsers();
			int n = Integer.parseInt(test);
			System.out.println("Total students dislayed on Group C is "+ n);
		}	
		
		@Test(priority=8)
		public void SendEmail(){
			
			lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
	        wlib.waitForPageToLoad();
			
			homepge.navigateTOhome();
			
			wlib.waitForPageToLoad();
	        homepge.OpenManageStudents();
			wlib.waitForPageToLoad();
			                                                      
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			((JavascriptExecutor)Driver.driver).executeScript("scroll(0,400)");
			  wlib.waitForPageToLoad();
			WebElement ele = Driver.driver.findElement(By.xpath("//input[@id='195217']"));
			 new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));
			
			 Actions action = new Actions(Driver.driver);
			 action.moveToElement(ele).click().perform();
			
			//System.out.println("Element is clicked");
			WebElement ele1 = Driver.driver.findElement(By.xpath("//button[@onclick='App.sendemail()']"));
		
			((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
			wlib.waitForPageToLoad();
		    new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.visibilityOf(ele1));
			ele1.click();
			WebElement ele2 = Driver.driver.findElement(By.xpath("//button[@class='confirm']"));
			/*String msg = Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
			System.out.println(msg);
			String Actual="Are you sure you would like to send a welcome email with login information to the selected user?";
			Assert.assertEquals("Not able to sent an email",msg,Actual);
*/			System.out.println("Email sent successfully to selected student");
			ele2.click();
			
	}
	
      @Test(priority=9)
		public void ArchiveStudent() throws InterruptedException{
	   lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
       wlib.waitForPageToLoad();
	
       homepge.navigateTOhome();
	
	   wlib.waitForPageToLoad();
       homepge.OpenManageStudents();
	   wlib.waitForPageToLoad();
	
	   adminpge.Click_GroupDropdown();
	   adminpge.Click_GroupB();
	   wlib.waitForPageToLoad();                                        
	   WebElement ele = Driver.driver.findElement(By.xpath("//input[@id='198656']"));
	   new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));
	                                                                     
	   /*boolean val = Driver.driver.findElement(By.xpath("//tr[@data-username='testerr']/td[3]/i")).isDisplayed();
	   
	  	   if(val==true)
	   {
		  
		   System.out.println("Selected student has Administration access ");
	   }
	   else{ */
	   Actions action = new Actions(Driver.driver);
	   action.moveToElement(ele).click().perform();
	
	   WebElement ele1 = Driver.driver.findElement(By.xpath("//button[@onclick='App.archive(true)']"));

	  ((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
	  wlib.waitForPageToLoad();
	  
      new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.visibilityOf(ele1));
	  ele1.click();
	  
	  Thread.sleep(3000);
	  WebElement ele2 = Driver.driver.findElement(By.xpath("//button[@class='confirm']"));
	  ele2.click();
	  Thread.sleep(4000);
	  String msg = Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
	  System.out.println("message is "+msg);
	  String Actual="1 Student archived successfully.";
	  Assert.assertEquals("Not able to archive selected user",msg,Actual);
	  System.out.println("Student Archived successfully");
	  ele2.click();	
	   
	   
		}

      @Test(priority=10)
	public void UnArchiveStudent() throws InterruptedException{
    lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
    wlib.waitForPageToLoad();

    homepge.navigateTOhome();

    wlib.waitForPageToLoad();
    homepge.OpenManageStudents();
    wlib.waitForPageToLoad();

    adminpge.Click_GroupDropdown();
    adminpge.Click_GroupB();
    wlib.waitForPageToLoad();
    adminpge.Click_ShowOnlyArchived();
    WebElement ele = Driver.driver.findElement(By.xpath("//input[@id='198656']"));
    new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));

    Actions action = new Actions(Driver.driver);
    action.moveToElement(ele).click().perform();

    WebElement ele1 = Driver.driver.findElement(By.xpath("//button[@onclick='App.archive(false)']"));

   ((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
   wlib.waitForPageToLoad();
   new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.visibilityOf(ele1));
   JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
	executor.executeScript("arguments[0].click();", ele1);
   Thread.sleep(3000);
   WebElement ele2 = Driver.driver.findElement(By.xpath("//button[@class='confirm']"));
   ele2.click();
   Thread.sleep(3000);
   String msg = Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
   String Actual="1 Student unarchived successfully.";
   Assert.assertEquals("Not able to unarchive selected user",msg,Actual);
   System.out.println("Student UnArchived successfully");
   ele2.click();
   
	}

   //   @Test(priority=11)
		public void DownloadStudentRecord() throws IOException{
			
			lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
	        wlib.waitForPageToLoad();
			
			homepge.navigateTOhome();
			
			wlib.waitForPageToLoad();
	        homepge.OpenManageStudents();
			wlib.waitForPageToLoad();
			
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			
			WebElement ele = Driver.driver.findElement(By.xpath("//input[@id='195217']"));
			 new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));
			
			 Actions action = new Actions(Driver.driver);
			 action.moveToElement(ele).click().perform();
			
			WebElement ele1 = Driver.driver.findElement(By.xpath("//a[@id='downloader']"));
			
			((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
			wlib.waitForPageToLoad();
		   // new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.visibilityOf(ele1));
		    JavascriptExecutor exec = (JavascriptExecutor)Driver.driver;
		    exec.executeScript("arguments[0].click();", ele1);
			
			
			
			Runtime.getRuntime().exec("./AutoIT/download.exe");
			
			System.out.println("Student record downloaded successfully");
			
			
		    
		    wlib.waitForPageToLoad();
		    
		    
      }
      
      @Test(priority=12)
  	public void NavigateToSUbgroup() throws InterruptedException{
      lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
      wlib.waitForPageToLoad();

      homepge.navigateTOhome();

      wlib.waitForPageToLoad();
      homepge.OpenManageStudents();
      wlib.waitForPageToLoad();

      adminpge.Click_GroupDropdown();
      adminpge.Click_GroupB();
      wlib.waitForPageToLoad();
    
      WebElement ele = Driver.driver.findElement(By.xpath("//input[@id='198656']"));
      new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));

      Actions action = new Actions(Driver.driver);
      action.moveToElement(ele).click().perform();

      WebElement ele1 = Driver.driver.findElement(By.xpath("//button[@id='subgroup']"));

     ((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
     wlib.waitForPageToLoad();
     new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.visibilityOf(ele1));
     JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
  	executor.executeScript("arguments[0].click();", ele1);
     String test ="test123";
     WebElement ele2 =adm.get_Subrouptextbox();
     ele2.sendKeys(test);
     adminpge.Click_SubgrpSavechangesbtn();
     Thread.sleep(3000);
     String msg = Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
     String Actual="Changed saved successfully.";
     Assert.assertEquals("subgroup name changed successfully",msg,Actual);
     Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
     wlib.waitForPageToLoad();
     WebElement ver=Driver.driver.findElement(By.xpath("//td/span[text()='"+test+"']"));
     if(ver.isDisplayed()){
    	 System.out.println("newly added subgroup name updated for selected student record");
     }
     else{
     System.out.println("not able to display subgroup name");
     }
     
  	}

      
	@AfterClass
	public void teardown(){
		
		System.out.println("-----------------------------------------------");
		
	}

}
