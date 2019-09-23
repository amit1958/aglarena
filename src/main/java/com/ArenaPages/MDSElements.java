package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.AmitAssertion;
import com.AglArena.origin;

public class MDSElements extends origin{
	
	public void MDSElementsTest() throws InterruptedException{
		//Apply Now Button
		String title= driver.getTitle();
		driver.navigate().to(pr.getProperty("mdslive"));
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//*[@id='closeCookieConsent']/span")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=====Print the logs " +e);
		}
		
		System.out.println("========Page Title is =======" +title);
		myWait = new WebDriverWait(driver, 5);
		myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='item slick-slide slick-current slick-active']//button[@class='apply-now-model apply-now'][contains(text(),'Apply Now')]")))).click();
		
		//Course Name select
		Select course= new Select(driver.findElement(By.id("freshercourse")));
		course.selectByVisibleText("Advance");
		driver.findElement(By.id("email")).sendKeys("amit.kumar1@adglobal360.com");
		
		Select state= new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Delhi");
		Thread.sleep(4000);
		Select city= new Select(driver.findElement(By.id("mdscity")));
		city.selectByVisibleText("NEW DELHI");
		Thread.sleep(4000);
		Select dealer= new Select(driver.findElement(By.id("dealer")));
		dealer.selectByVisibleText("IDTR -Loni");
		Thread.sleep(4000);
		driver.findElement(By.id("phone")).sendKeys("9811854502");
		//Send OTP
		driver.findElement(By.id("triggerOTP-bo")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='corporate']/div[7]/div/ul/li[2]/input"));
		driver.findElement(By.xpath("//*[@id='mds-frm-chk']")).click();
		
		driver.findElement(By.id("mds-submit-btn")).click();
		
		AmitAssertion.MSTAAssert();
		
            
	
        }
	}

