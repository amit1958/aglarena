package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.AglArena.AmitAssertion;
import com.AglArena.origin;

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
			AmitAssertion.AltoPriceAssertMetallic();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed if no match found");
		}
		
		
	
		}
	}

