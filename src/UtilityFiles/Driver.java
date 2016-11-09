package UtilityFiles;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Driver {
	
	
	public static WebDriver driver =new FirefoxDriver();
	
	
	public static WebDriver Chrome(){
		
		System.setProperty("webdriver.chrome.driver","F:\\driver\\chromedriver.exe");
		 
		
		WebDriver driver1=new ChromeDriver();
		 return driver1;
		
	}
	
   public static FirefoxProfile start(){
	
	   FirefoxProfile fprofile = new FirefoxProfile();
	   
	   
	   
	   return fprofile;
	
	   
      }
   
   public static WebDriver getbrowser(String browsename){
	   WebDriver  driver=null;
	  
	   if(browsename.equalsIgnoreCase("firefox")){
		   
		   driver = new FirefoxDriver();
		   	   
	   }
	
	   else if(browsename.equalsIgnoreCase("Chrome")){
		   
    	   System.setProperty("webdriver.chrome.driver"," F:\\driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   	   
	   }
       
	   else if(browsename.equalsIgnoreCase("Chrome")){
		   
	   	   System.setProperty("webdriver.ie.driver"," F:\\SeleniumGridV2.0\\AllDrivers\\IEDriverServer_64bit_OS.exe");
			   driver = new ChromeDriver();
			   	   
		   
	   }
      
      return driver;
		
	}
   
   }
   
   

   
   
   
   
   

