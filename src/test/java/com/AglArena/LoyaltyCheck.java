package com.AglArena;

import static org.testng.Assert.assertEquals;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoyaltyCheck extends origin {

/*	@Test
	public void Loyalty_Login() throws InterruptedException{
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
	
	@Test
	public static void LoginLoyaltyFrom() throws InterruptedException{
	//Thread.sleep(9000);
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
		
	
	//String expectedURL="https://www.marutisuzuki.com/owners/customer-profile";
	WebElement verifylogin=driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Loyalty')]"));
	WebDriverWait waitforloyalty= new WebDriverWait(driver, 45);
	String actualURL =	driver.getCurrentUrl();
	System.out.println("URL is " +actualURL);
	waitforloyalty.until(ExpectedConditions.elementToBeClickable(verifylogin));
	String verifyitem= verifylogin.getText();
	System.out.println("Text is" +verifyitem);
	//assertEquals(actualURL, expectedURL);
	assertEquals(verifyitem, "LOYALTY");
	System.out.println("TestCase is pass");
			
	}
}

