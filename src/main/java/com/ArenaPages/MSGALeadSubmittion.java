package com.ArenaPages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AglArena.origin;

public class MSGALeadSubmittion extends origin {
	@Test
	public void VerifyLeadSubmit() throws InterruptedException {
		driver.navigate().to(pr.getProperty("msga"));
		// driver.findElement(By.linkText("View All"));
		driver.findElement(By.xpath("//*[@id='ViewAllTrending']/a")).click();

		// driver.findElement(By.xpath("//*[@id='car-interested']")).click();

		// find all product on the page
		List<WebElement> products = driver.findElements(By
				.xpath("//*[@id='paginationddata']/div"));
		for (int i = 0; i < products.size(); i++) {
			System.out.println("Prodcut name: " + products.get(i).getText());
			if (products.contains("metalic car frame(mcf 1cr)(shv)")) {
				System.out.println("product is matching");

				break;

			}

		}

		// products.get(2).click();
		//Properties mypr = new Properties();
		driver.navigate()
				.to("https://scstage-arena-cd.azurewebsites.net/more-from-us/maruti-suzuki-genuine-accessories/accessories/part?id=8AEA73F2-1B0E-42AC-9105-6641EF9B9245&partname=BACK%20DOOR%20GARNISH");
		// single product selection
		// driver.findElement(By.xpath("//*[@id='paginationddata']/div[1]/a")).click();

		// Navigate to the product detail page
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.findElement(By.id("enquiry-button")).click();

		// Fill the From
		driver.findElement(By.id("msgaName")).sendKeys("MSGA AUTOMATION");
		driver.findElement(By.id("msgaMail")).sendKeys(
				"test@test.com");
		driver.findElement(By.id("msgaMobile")).sendKeys("9800000000");
		Thread.sleep(5000);
		Select msgastate = new Select(driver.findElement(By.xpath("//*[@id='msgadealerstate']")));
		msgastate.selectByIndex(10);
//		List<WebElement> mystates = driver.findElements(By
//				.xpath("//*[@id='msgadealer']/option"));
//		for (int i = 0; i < mystates.size(); i++) {
//			System.out.println("states: " + mystates.get(i).getText());
//			if (mystates.get(i).getText().equalsIgnoreCase("DELHI"))
//				;
//			mystates.get(9).click();
//		}
		Thread.sleep(5000);
		Select msgacity = new Select(
				driver.findElement(By.id("msgadealercity")));
		msgacity.selectByIndex(1);
		Thread.sleep(5000);
		Select msgadealer = new Select(driver.findElement(By.id("msgadealer")));
		msgadealer.selectByIndex(1);
		driver.findElement(By.id("msgaQuery")).sendKeys(
				"Automations Testing. Please ignor it.");
		driver.findElement(By.id("MSGAFeedBackSubmit")).click();
		Thread.sleep(4000);
		String expected= "THANK YOU FOR YOUR QUERY! IN COMPLIANCE WITH GOVERNMENT ADVISORY ON COVID-19, MANY MARUTI SUZUKI DEALERSHIPS ARE CLOSED.IN THE MEANTIME, OUR REGIONAL ACCESSORIES MANAGER WILL GET IN TOUCH WITH YOU WITHIN 2 WORKING DAYS.";
	
	WebElement acutal =	driver.findElement(By.xpath("//h3[contains(text(), 'Thank You')]"));
	String mytext= acutal.getText();
	System.out.println("textis " +mytext);
  Assert.assertEquals(mytext, expected);
	}

}
