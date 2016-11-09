package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getbrowser {
	
	public static WebDriver driver=null;
	public static void getbrowser(String browsename){
		   
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
	     
			
		}

}
