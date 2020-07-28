package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import com.AglArena.origin;

public class ReadExcelFile extends origin {
	
	HSSFWorkbook wb;
	HSSFSheet mysheet;
	@Test
	public void readExcel() throws InterruptedException{
		try{
		String path= "D:/Selenium/VehicleDetails.xls";
		File myfile= new File(path);
		System.out.println("my file is " +myfile);
		FileInputStream myinputfile= new FileInputStream(myfile);
		wb= new HSSFWorkbook(myinputfile);
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		mysheet= wb.getSheetAt(0);
		System.out.println("My sheet is =" +mysheet);
		int rowCount = mysheet.getLastRowNum();
		System.out.println("rowcount is " +rowCount);
		
		//Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row rowa = mysheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < rowa.getLastCellNum(); j++) {

	         
	        	  driver.get(rowa.getCell(j).getStringCellValue());
	        	  Thread.sleep(2000);
	        
	        	  
	        
	     
	    } 
		
	}
}
}


