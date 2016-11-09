package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.EditStudent;
import PageObjectFactory.Table;
import UtilityFiles.Driver;

public class TableViewpage {
	
	
	 Table tble = PageFactory.initElements(Driver.driver, Table.class);
	
	
	public void Click_PerformanceGrpB(){
		
		tble.get_PerformGrpB_Filter().click();
		
		
	}
	
	

}
