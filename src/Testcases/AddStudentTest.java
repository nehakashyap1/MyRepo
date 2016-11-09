package Testcases;

import org.junit.Assert;
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

import PageObjectFactory.AddStudent;
import PageObjectFactory.Home;
import PageObjectFactory.Login;
import Pages.AddStudentPage;
import Pages.AdministrationPage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

/*public class AddStudentTest {
	homepage homepge;
	loginpage lgnpge;
	AddStudentPage addst;
	Webdrivercommonlib wlib;
	AdministrationPage adminpge;
	Login lgn;
	AddStudent astd = PageFactory.initElements(Driver.driver, AddStudent.class);
	
	 WebElement e1=astd.get_firstname();
	 WebElement e2=astd.get_lasstname();
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
		 
		System.out.println("Test cases execution on AddStudent page ");
		System.out.println("--------------------------------------");
		
		
	}
	
      @Test(priority=1)
	public void NavigatetoAddStudents(){
		
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
	    wlib.waitForPageToLoad();
			
		homepge.navigateTOhome();
			
		wlib.waitForPageToLoad();
	    homepge.OpenManageStudents();
		adminpge.Click_AddStudent();
		wlib.waitForPageToLoad();
		String acttitle=wlib.verifyTitle();
		String Exptitle="Add Students - SonoSim® Performance Tracker";
		Assert.assertEquals(Exptitle,acttitle);
		System.out.println("add Students page opened sucessfully");
		adminpge.Click_BackToPanelOn_AddStudents();
	}
	
	@Test(priority=2)
	public void CheckValidationsEmptyFields() throws InterruptedException{
		
		wlib.waitForPageToLoad();
		adminpge.Click_GroupDropdown();
		adminpge.Click_GroupB();
		wlib.waitForPageToLoad();
		adminpge.Click_AddStudent();
		wlib.waitForPageToLoad();
		
	   //All Empty field
		
		 WebElement ele = Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i"));
		 new WebDriverWait(Driver.driver, 30).until(ExpectedConditions.elementToBeClickable(ele));
		
		 Actions action = new Actions(Driver.driver);
		 action.moveToElement(ele).click().perform();
		 Thread.sleep(3000);
		 String msg=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected="Fields cannot be blank";
		 System.out.println(msg);
		 Assert.assertEquals("not able to display validation message for empty fields",expected, msg);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for all empty fields");
		 
		//Empty password field
		 adminpge.Click_BackToPanelOn_AddStudents();
		 adminpge.Click_AddStudent();
		 wlib.waitForPageToLoad();
		 e1=astd.get_firstname();
		 e2=astd.get_lasstname();
		 e3=astd.get_email();
		 e4=astd.get_username();
		 e5=astd.get_password();
		 e6=astd.get_saveButton();
		 
		 e1.sendKeys("test");
		 e2.sendKeys("test1");
		 e3.sendKeys("test@test123.com");
		 e4.sendKeys("Tester");
		
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 wlib.waitForPageToLoad();
		 Thread.sleep(3000);
		 String msg1=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected1="Fields cannot be blank";
		 System.out.println("message is"+msg1);
		 Assert.assertEquals("not able to display validation message for empty password field",expected1, msg1);
		 System.out.println("validation message is displyed for empty password fields");
		 
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
		 
		//Empty userame field
		 
		 adminpge.Click_BackToPanelOn_AddStudents();
		 adminpge.Click_AddStudent();
		 wlib.waitForPageToLoad();
		 e1.sendKeys("test");
		 e2.sendKeys("test1");
		 e3.sendKeys("test@test123.com");
		 e5.sendKeys("Tester");
		 
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 wlib.waitForPageToLoad();
		 Thread.sleep(3000);
		 String msg2=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected2="Fields cannot be blank";
		
		 Assert.assertEquals("not able to display validation message for empty username field",expected2, msg2);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty username field");
		 
		// Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		 
		//Empty Email field
		  
		 adminpge.Click_BackToPanelOn_AddStudents();
		 adminpge.Click_AddStudent();
		 wlib.waitForPageToLoad(); 
		 
		 e1.sendKeys("test");
		 e2.sendKeys("test1");
		 e4.sendKeys("testerr");
		 e5.sendKeys("Tester");
		 
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 wlib.waitForPageToLoad();
		 Thread.sleep(3000);
		
		 String msg3=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected3="Fields cannot be blank";
		
		 Assert.assertEquals("not able to display validation message for empty Email ID field",expected3, msg3);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty Email field");
		// Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		 
		 //Empty first name
		  
		 adminpge.Click_BackToPanelOn_AddStudents();
		 adminpge.Click_AddStudent();
		 wlib.waitForPageToLoad();
		 
		
		 e2.sendKeys("test1");
		 e3.sendKeys("test@test123.com");
		 e4.sendKeys("testerr");
		 e5.sendKeys("Tester");
		
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 Thread.sleep(3000);
		 String msg4=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected4="Fields cannot be blank";
		
		 Assert.assertEquals("not able to display validation message for empty First name field",expected4, msg4);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty first name field");
		
		 //Empty last name
		 adminpge.Click_BackToPanelOn_AddStudents();
		 adminpge.Click_AddStudent();
		 wlib.waitForPageToLoad();
			
		 e1.sendKeys("test1");
		 e3.sendKeys("test@test123.com");
		 e4.sendKeys("testerr");
		 e5.sendKeys("Tester");
		 Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
		 Thread.sleep(3000);
		 String msg5=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
		 String expected5="Fields cannot be blank";
		
		 Assert.assertEquals("not able to display validation message for empty last name field",expected5, msg5);
		 Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 System.out.println("validation message is displyed for empty last name field");
		 adminpge.Click_BackToPanelOn_AddStudents();
		 wlib.waitForPageToLoad();
		 
	}
	
	@Test(priority=3)
	    public void CheckValidationDuplicateStudentName() throws InterruptedException{
			
			wlib.waitForPageToLoad();
		
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
			adminpge.Click_AddStudent();
			wlib.waitForPageToLoad();
			
			e1.sendKeys("tester1");
			e2.sendKeys("tester");
			e3.sendKeys("test@test123.com");
			e4.sendKeys("test");
			e5.sendKeys("test");
			
			Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
			Thread.sleep(3000);
			String msg5=Driver.driver.findElement(By.xpath("//p[@style='display: block;']")).getText();
			String expected5="Username already in use.";
			System.out.println(msg5);
			Assert.assertEquals("not able to display validation message for duplicate student name field",expected5, msg5);
			Driver.driver.findElement(By.xpath("//button[@class='confirm']")).click();
			System.out.println("validation message is displyed for duplicate student name field");	
		    
	}


	     @Test(priority=4)
	     public void AddNewStudentRecord(){
	     
	    	 System.out.println("testing");
	       /* wlib.waitForPageToLoad();
		
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			((JavascriptExecutor)Driver.driver).executeScript("scroll(0,-400)");
			adminpge.Click_AddStudent();
			wlib.waitForPageToLoad();
			
			wlib.waitForPageToLoad();
			adminpge.Click_GroupDropdown();
			adminpge.Click_GroupB();
			wlib.waitForPageToLoad();
			adminpge.Click_AddStudent();
			wlib.waitForPageToLoad();
			
			e1.sendKeys("tester11");
			e2.sendKeys("tester14");
			e3.sendKeys("testanar105@gmail.com");
			e4.sendKeys("test");
			e5.sendKeys("test");
			
			Driver.driver.findElement(By.xpath("//button[@id='saveButton']/i")).click();
			
			String msg5=Driver.driver.findElement(By.xpath("")).getText();
			//String expected5="";
			System.out.println(msg5);
			//Assert.assertEquals("not able to display validation message for duplicate student name field",expected5, msg5);
			
			System.out.println("validation message is displyed for duplicate student name field");	
			
*/			
//	}/*
	     
	/*     @AfterClass
	 	public void teardown(){
	 		
	 		System.out.println("-----------------------------------------------");
	 		
	 	}

}*/
