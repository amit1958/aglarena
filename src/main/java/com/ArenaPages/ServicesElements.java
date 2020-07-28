package com.ArenaPages;

import org.openqa.selenium.By;

import com.AglArena.origin;

public class ServicesElements extends origin {
	
	public void bookService() throws InterruptedException{
		driver.navigate().to("http://www.marutisuzuki.com/service");
		driver.findElement(By.id("arena-book-now")).click();
		driver.findElement(By.id("phone11")).sendKeys("9811854502");
		driver.findElement(By.id("lnkOTP-service")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("// div[@id='otp-service1']//*[@id='otp']")).sendKeys("12345");
		
		driver.findElement(By.id("ServiceChkBox1")).click();
		//submit the form
		driver.findElement(By.id("Btn-Service1")).click();
		Thread.sleep(10000);
		
		
	}

}
