package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AglArena.*;

public class PriceListElements extends origin{
	
	public void AltoPriceList() throws InterruptedException{
		//Apply Now Button
		String title= driver.getTitle();
		System.out.println("Title of the page" + title);
		//GetPricelist
		driver.findElement(By.xpath("//a[@id='price-list']")).click();
		Thread.sleep(5000);
		
		//Select Car/state/city
		Select car= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='model']")));
		car.selectByVisibleText("ALTO");
		Select state= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='state']")));
		state.selectByVisibleText("DELHI");
		Thread.sleep(2000);
		Select city= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='city']")));
		city.selectByVisibleText("DELHI");
		
		//Submit the Form
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@class='btns button-black toggleScreen get-pricelist-result'][contains(text(),'CONTINUE')]")).click();
		Thread.sleep(5000);
		
		WebElement calculateEMI= driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[4]//a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calculateEMI);
		Actions mousemove= new Actions(driver);
		mousemove.moveToElement(calculateEMI).perform();
		
		try {
			String expecteda= "?2,93,689.00";
			WebDriverWait price= new WebDriverWait(driver, 10);
			WebElement actual = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]"));
			price.until(ExpectedConditions.visibilityOf(actual));
			String actual1= actual.getText().trim();
//			StringBuilder build = new StringBuilder(actual1);
//			System.out.println("Pre Builder : " + build);
//			build.deleteCharAt(0); // Shift the positions front.
//		    build.deleteCharAt(1);
//		    build.deleteCharAt(3);
//		    build.deleteCharAt(6);
//		    build.deleteCharAt(6);
//		    build.deleteCharAt(6);
//			System.out.println("Post Builder : " + build);
			//String expected1=actual1.toString();
			Assert.assertEquals(actual1, expecteda);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed if no match found");
		}
		
		
	
		}
	}

