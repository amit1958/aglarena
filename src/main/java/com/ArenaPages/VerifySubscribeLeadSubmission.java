package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.AglArena.origin;

public class VerifySubscribeLeadSubmission extends origin {
	@Test
	public void SubscribeLeadSubmit() {
		VerifySubscribeState st = new VerifySubscribeState();
		st.VerifyStates();
		WebElement city = driver.findElement(By.id("shm_dealercity"));
		Select mycity = new Select(city);
		mycity.selectByIndex(1);
		WebElement mydealer = driver.findElement(By.id("shm_dealer"));
		Select dealer = new Select(mydealer);
		dealer.selectByIndex(1);
		driver.findElement(
				By.xpath("//*[@id='form-book-test-drive']/div[1]/div[8]/label/span"))
				.click();
		// submit the from
		driver.findElement(By.id("btnSubmit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("first_otp"))));
		driver.findElement(By.id("first_otp")).click();
		driver.findElement(By.id("first_otp")).sendKeys("1");
		driver.findElement(By.id("first_otp")).click();
		driver.findElement(By.id("first_otp")).sendKeys("2");
		driver.findElement(By.id("first_otp")).click();
		driver.findElement(By.id("first_otp")).sendKeys("3");
		driver.findElement(By.id("first_otp")).click();
		driver.findElement(By.id("first_otp")).sendKeys("4");
		driver.findElement(By.id("first_otp")).click();
		driver.findElement(By.id("first_otp")).sendKeys("5");

		driver.findElement(
				By.xpath("//*[@id='smp_enquiry_otp_form']/div/div[3]/a"))
				.click();
	}

}
