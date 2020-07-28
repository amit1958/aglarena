package Utility;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.AglArena.origin;

public class ReadExcelFilePOI_PRs extends origin {
	
	HSSFWorkbook wb;
	HSSFSheet mysheet;
	
@Test
	public void readExcel() throws InterruptedException{
		try{
		//String path= "D:/Selenium/PRResponsive.xls";
		String path= "D:/Selenium/PRResponsive 2018-2019.xls";
		//String stagingPath= "D:/Selenium/PRResponsiveStaging.xls";
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

	            //Print Excel data in console

	            //System.out.print(rowa.getCell(j).getStringCellValue()+"\n ");
	        	//Take the Complete page screen shot.
	        	  driver.get(rowa.getCell(j).getStringCellValue());
	        	  Thread.sleep(2000);
	        	  String title= driver.getTitle();
	        	  
	        	/* try {
	        		 WebElement nonresponive=driver.findElement(By.xpath("//div/section/table"));
	     			Assert.assertEquals(nonresponive, nonresponive);
	     		} catch (Exception e) {
	     			System.out.println("PR is not Responsive");
	     		}*/
	        	  
	        	  try {
	        		  Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		        	  ImageIO.write(screenshot.getImage(), "jpg", new File("D:/Selenium/Screenshots/" + title + "_stg" + ".png"));
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	 
	        	//  Take Screen shot on Current Screen
	        	/*  try {
	        		  String location= "D:\\Selenium\\Screenshots\\";
	      	        File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      	        FileUtils.copyFile(screenshots, new File(location  + title + "_" + System.currentTimeMillis() + ".png"));
	      	    } catch (Exception e) {
	      	          e.printStackTrace();
	      	    } 
	        }*/
	     
	    } 
		
		
		
//		DataFormatter format= new DataFormatter();
//		String data=format.formatCellValue(mysheet.getRow(row).getCell(cell));
//		System.out.println("Data is " +data);
		//return data;
	}

	/*public String getData(){
		mysheet= wb.getSheetAt(0);
		System.out.println("My sheet is =" +mysheet);
		DataFormatter format= new DataFormatter();
		String data=format.formatCellValue(mysheet.getRow(0).getCell(0));
		return data;
	}*/
/*	public static void main(String[] args){
		ReadExcelFilePOI excel= new ReadExcelFilePOI();
		excel.readExcel();
	}*/
	}
}


