package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.Asserts;
import com.AglArena.origin;

public class FloatingMenuElements extends origin{

	public void floatingMenuTest() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[4]/section[1]/div[1]/div/a/span")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/header/div[4]/ul/li[4]/a/span")).click();
		Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='book-showroom']/p")));
		WebElement name= driver.findElement(By.xpath("//*[@id='book-showroom']/p"));
		name.click();
		//Asserts.loginAssert();
		
	}
	
}
