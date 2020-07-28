package com.ArenaPages;

import static org.testng.Assert.assertEquals;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.AglArena.origin;

public class ArenaSanity extends origin {
	/*public static void loginutil() throws InterruptedException{
		WebElement loginicon= driver.findElement(By.xpath("//div[4]/ul/li[4]/a/span"));
		WebDriverWait pagetoload= new WebDriverWait(driver, 20);
		pagetoload.until(ExpectedConditions.elementToBeClickable(loginicon));
			loginicon.click();
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='name']")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='phone']")).sendKeys("9811854502");
		driver.findElement(By.xpath("//div[@class='modal-body']//a[@id='lnkOTP']")).click();
		Thread.sleep(8000);
		JFrame path=  new JFrame();
		String otp= JOptionPane.showInputDialog(path,"Enter OTP");
		System.out.println("otp is "  +otp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='content active']//input[@id='otp']")).sendKeys(otp);
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='overlayContent loginbox']//section[@class='customer-login']//div[@class='content active']//div[@class='customer-login-area']//div[@class='customer-login-form']//div[@class='customer-prof tab-area active']//div[@id='tab-1']//form[@id='new-registration']//div//button[@id='screen1-button']")).click();
		Thread.sleep(15000);
	}*/

	/*
	 
@Test
public void HomePage() throws InterruptedException{
	Thread.sleep(10000);
	WebElement loginicon= driver.findElement(By.xpath("//div[4]/ul/li[4]/a/span"));
	WebDriverWait pagetoload= new WebDriverWait(driver, 20);
	pagetoload.until(ExpectedConditions.visibilityOf(loginicon));
	WebElement bookservicebutton=driver.findElement(By.xpath("//button[@class='button button-red button-180 triggerBookAShowRoomVisitButton']"));
	String actual =bookservicebutton.getText();
	System.out.println("Home page validation text is " +actual);
	String expected= "BOOK A SHOWROOM VISIT";
	assertEquals(actual, expected);
	
}
	
@Test
	public static void LoginLoyaltyFrom() throws InterruptedException{
	Thread.sleep(9000);
		//Go to the Login Window and Do login.
	WebElement loginicon= driver.findElement(By.xpath("//div[4]/ul/li[4]/a/span"));
	WebDriverWait pagetoload= new WebDriverWait(driver, 20);
	pagetoload.until(ExpectedConditions.elementToBeClickable(loginicon));
		loginicon.click();
		
	 
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='name']")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='phone']")).sendKeys("9811854502");
		driver.findElement(By.xpath("//div[@class='modal-body']//a[@id='lnkOTP']")).click();
		JFrame path=  new JFrame();
		String otp= JOptionPane.showInputDialog(path,"Enter OTP");
		System.out.println("otp is "  +otp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='content active']//input[@id='otp']")).sendKeys(otp);
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='overlayContent loginbox']//section[@class='customer-login']//div[@class='content active']//div[@class='customer-login-area']//div[@class='customer-login-form']//div[@class='customer-prof tab-area active']//div[@id='tab-1']//form[@id='new-registration']//div//button[@id='screen1-button']")).click();
		
	String actualURL =	driver.getCurrentUrl();
	System.out.println("URL is " +actualURL);
	//String expectedURL="https://www.marutisuzuki.com/owners/customer-profile";
	WebElement verifylogin=driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Loyalty')]"));
	WebDriverWait waitforloyalty= new WebDriverWait(driver, 45);
	waitforloyalty.until(ExpectedConditions.elementToBeClickable(verifylogin));
	String verifyitem= verifylogin.getText();
	System.out.println("Text is" +verifyitem);
	//assertEquals(actualURL, expectedURL);
	assertEquals(verifyitem, "LOYALTY");
	System.out.println("TestCase is pass");
			
	}*/
	
	@Test
	public static void BookAShowRoomVisit() throws InterruptedException{
		//Book A showroom visit without login.--First From
		WebElement floatingmenu= driver.findElement(By.cssSelector("span.icon-floating-menu"));
		myWait= new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.visibilityOf(floatingmenu));
		floatingmenu.click();
		driver.findElement(By.cssSelector("span.icon-floating-menu")).click();
		driver.findElement(By.xpath("//*[@id='book-showroom']/p")).click();
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='name']")).sendKeys("BookTestdriver");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='middleName']")).sendKeys("Bookshowroommname");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='lastName']")).sendKeys("Bookshowroomlname");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='email']")).sendKeys("bookshowroom@mailinator.com");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='phone']")).sendKeys("9811854502");
		driver.findElement(By.xpath("//div[@class='modal-body']//a[@id='lnkOTP']")).click();
		//call otp
		Thread.sleep(8000);
		JFrame path=  new JFrame();
		String otp= JOptionPane.showInputDialog(path,"Enter OTP");
		System.out.println("otp is "  +otp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='otp']")).sendKeys(otp);
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='FormChkBoxBook1']")).click();
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@id='mobile-validation-div']//input[@id='screen1-button']")).click();
		Thread.sleep(20000);
		
		try {
			myWait= new WebDriverWait(driver, 20);
			WebElement generateEnqBtn= driver.findElement(By.xpath("//div[@class='modal-body']//input[@class='btns button-black']"));
			myWait.until(ExpectedConditions.elementToBeClickable(generateEnqBtn)).sendKeys(Keys.END);
			generateEnqBtn.click();	
		} catch (Exception e) {
			System.out.println("==Button Not found ==");
		}
		//Second From Fields
		Select showcar= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='model']")));
		showcar.selectByIndex(1);
		Thread.sleep(5000);
		Select showvariant= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='variant']")));
		showvariant.selectByIndex(1);
		Thread.sleep(5000);
		Select showstate= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='dealerstate']")));
		showstate.selectByIndex(1);
		Thread.sleep(5000);
		Select showcity= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='dealercity']")));
		showcity.selectByIndex(1);
		Thread.sleep(5000);
		Select showdealer= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='dealer']")));
		showdealer.selectByIndex(1);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='date']")).click();
		driver.findElement(By.xpath("//td[@class='day'][contains(text(),'27')]")).click();
		Select showTimeslote= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='timeslot']")));
		showTimeslote.selectByIndex(1);
		
		Select showCustomerType= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='customertype']")));
		showCustomerType.selectByIndex(1);
		
		driver.findElement(By.xpath("//div[@id='defaultModal']//div[@id='cardetail-validation-div']//div[@class='forms-disclaimer']//input[1]")).click();
	
		driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='overlayContent enquiryForm']//div[@id='cardetail-validation-div']//form[@name='cardetail-validation']//div//input[@id='screen1-button']")).click();
		
		String expected= "Successfully sent!";
		String actual = driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='overlayContent enquiryForm']//h4[contains(text(),'Successfully sent!')]")).getText();
		assertEquals(actual, expected);
	}
	
	public void BookTestDrive(){
		
	}
	
	
	

}
