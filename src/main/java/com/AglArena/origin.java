package com.AglArena;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import sendEmail.SendEmail;


public class origin {
	public static WebDriver driver;
	public static WebDriverWait myWait;
	public static Properties pr = new Properties() ;
	public static Actions myactions;
	public static Action myaction;
	

	
	@BeforeMethod
	public  void startUp() throws IOException{
	
		try{
			File myfile = new File("C:\\Users\\AGL\\AmitSharma\\workspace\\AglArena\\MAS.properties");
			System.out.println("exists:==> "+myfile.exists());
			FileInputStream myInput= new FileInputStream(myfile);
			pr.load(myInput);
			//System.setProperty("webdriver.gecko.driver", pr.getProperty("ffdriverpath"));
			System.setProperty("webdriver.gecko.driver", pr.getProperty("ffdriverpathupdated"));
			System.out.println("before calling the url");
			driver= new FirefoxDriver();
			System.out.println("After calling the ffdriver");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			driver.manage().window().fullscreen();
			driver.get(pr.getProperty("url"));
			//driver.get(pr.getProperty("mstalive"));
			System.out.println("url is " +pr.getProperty("url"));
			Thread.sleep(10000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	@AfterMethod
	public void screenShot(ITestResult result) throws EmailException, IOException{
		String location= "D:\\Selenium\\Screenshots\\";
		String methodname = result.getName();
		System.out.println("===methodname===" +methodname);
//		TakeScreenshot myscreen= new TakeScreenshot();
//		myscreen.takesScreenshot();
	/*	try {
	        File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshots, new File(location  + methodname + "_" + System.currentTimeMillis() + ".png"));
	    } catch (Exception e) {
	          e.printStackTrace();
	    } finally {
	          //driver.quit();
	   } */
		//driver.quit();
//		SendEmail myemail = new SendEmail();
	//	myemail.sendAnEmailwithAttachement("Please find the Attached file", "Testing on hyperlocal");
		
	}
	@AfterSuite
	public void email() throws EmailException{
		try {
			String subject= "Tested on hyperlocal domain-" + " " + pr.getProperty("url");
			SendEmail myemail = new SendEmail();
			myemail.sendAnEmailwithAttachement("Please find the Attached file for the executed testsuite on Live hyperlocal site ", subject );
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("++++++Email Problem++++++++");
			
			}	
	
		}
	}
