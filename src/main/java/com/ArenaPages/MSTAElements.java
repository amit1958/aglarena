package com.ArenaPages;

import java.awt.AWTException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.Asserts;
import com.AglArena.origin;

public class MSTAElements extends origin{
	
	public void MSTAElementsTest() throws InterruptedException, AWTException{
		//Apply Now Button
		String title= driver.getTitle();
		//driver.findElement(By.xpath("//span[@class='icon-floating-menu']")).click();
		/*WebElement cookiediv= driver.findElement(By.xpath("//*[@id='closeCookieConsent']/span"));
		if(cookiediv.isDisplayed()){
			System.out.println("Element found");
			cookiediv.click();
		}else {
			System.out.println("Element not found");
		}*/
		
		try {
			driver.findElement(By.xpath("//*[@id='closeCookieConsent']/span")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=====Print the logs " +e);
		}
		
		System.out.println("========Page Title is =======" +title);
		myWait = new WebDriverWait(driver, 5);
		myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='item slick-slide slick-current slick-active']//button[@class='apply-now-model apply-now'][contains(text(),'Apply Now')]")))).click();
		
		//Form Open
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='name']")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='middleName']")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='lastName']")).sendKeys("Test");
		//4th may 2001 date select
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='date']")).click();
		driver.findElement(By.xpath("//th[contains(text(),'May 2019')]")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch'][contains(text(),'2019')]")).click();
		driver.findElement(By.xpath("//th[contains(text(),'2010-2019')]")).click();
		driver.findElement(By.xpath("//span[@class='decade'][contains(text(),2000)]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2001')]")).click();
		driver.findElement(By.xpath("//span[@class='month focused'][contains(text(), May)]")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']//tr[1]//td[1]")).click();
		//hiding the date picker
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='district']")).click();
//		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='date']")).click();
//		driver.findElement(By.xpath("//td[@class='day'][contains(text(),'7')]")).click();
		//state select
		try {
			/*Actions mouse= new Actions(driver);
			mouse.moveToElement(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='state']"))).click();
			mouse.moveToElement(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='state']//option[@value='AN']"))).click();*/
			Select state= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='state']")));
			state.selectByValue("AN");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=====Print the logs " +e);
		}
		//select city
		//Thread.sleep(5000);
		try {
			/*WebElement city= driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='city']"));
			WebDriverWait waitforcity= new WebDriverWait(driver, 5);
			waitforcity.until(ExpectedConditions.elementToBeSelected(city));
			Actions mouse= new Actions(driver);
			mouse.moveToElement(city).click();
			mouse.moveToElement(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='city']//option[@value='PU']"))).click();*/
			Select city= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='city']")));
			city.selectByVisibleText("DIGLIPUR");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=====Print the logs " +e);
		}
		//Select District
		try {
			driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='district']")).sendKeys("New Delhi");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=====Print the logs " +e);
		}
		
		//Email
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='email']")).sendKeys("test@mailinator.com");
		//Address
		driver.findElement(By.xpath(" //div[@class='modal-body']//input[@id='address']")).sendKeys("Gurgaon 2342/2");
		//select course
		Select course= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='course']")));
		course.selectByValue("ABR-Auto Body Repair/Auto Body Paint");
		//phone number
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='phone']")).sendKeys("9811854502");
		driver.findElement(By.xpath("//div[@class='modal-body']//a[@id='lnkOTP']")).click();
		Thread.sleep(5000);
		
		JFrame path=  new JFrame();
		String otp= JOptionPane.showInputDialog(path,"Enter OTP");
		System.out.println("otp is "  +otp);
		Thread.sleep(5000);
		/*myWait = new WebDriverWait(driver, 5);
		myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='otp']"))));*/
		//otp txt box
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='otp']")).sendKeys(otp);
		//Checkbox select
		Thread.sleep(2000);
		
		/*Actions checkbox= new Actions(driver);
		checkbox.moveToElement(driver.findElement(By.xpath("//input[@id='FormChkBoxMSTA']"))).build().perform();
		checkbox.click();*/
		WebElement checkboxa= driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[13]/input[1]"));
		checkboxa.click();
		

		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[14]/input[1]")).click();
		Thread.sleep(6000);
		Asserts.MSTAAssert();
		
            
	
        }
	}

