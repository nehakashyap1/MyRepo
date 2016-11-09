package Pages;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DownloadExcel_Administration {

	
	
	
	   public File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
	   
	   private int getrownumfromExcelfile(String filepath){
		   
		   
		   return 0;
		   
	   }
}

