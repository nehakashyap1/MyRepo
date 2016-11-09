package UtilityFiles;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityFiles.Driver;

public class Webdrivercommonlib {
	
	static int i=0;
	 public  String getScreensht(WebDriver driver,String screnshotname){
		 try{
			 
			 TakesScreenshot scrnshot=(TakesScreenshot)driver;
			 File sourceFile=scrnshot.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(sourceFile,new File(".//Screenshots//Sonosim "+screnshotname+".png"));
		 }
		 catch(Exception e){
			 System.out.println(e.getMessage());
		 }
		 String test = "C://Temp//Sonosim "+i+".png";
		return test;
	 }
	
	
	 public void waitForPageToLoad(){
			Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	    
	    
	    public void waitForElementXpathPresent(String webElementxpath){
	    	WebDriverWait wait = new WebDriverWait(Driver.driver, 40);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webElementxpath)));
			
	    }
	    
	    public void keyBoardConcurrentOperation(String symbol){
		    Actions act = new Actions(Driver.driver);
		    act.sendKeys(Keys.chord(Keys.CONTROL , symbol)).perform();
		    
	    }
	    
	    public String verifyTitle(){
	    	String title=Driver.driver.getTitle();
			return title;
	    }
	    public void DeleteCookies(){
	    	
	    	Driver.driver.manage().deleteAllCookies();
	    	
	    }
	   public void Close_Browser(){
		   
		   Driver.driver.close();
	   }
      public void Quit_Browser(){
		   
		   Driver.driver.quit();
	   }
	

}
