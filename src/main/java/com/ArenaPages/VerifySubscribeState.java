package com.ArenaPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AglArena.origin;

public class VerifySubscribeState extends origin {
	@Test
	public void VerifyStates() {
		driver.navigate().to(pr.getProperty("subscribe"));
		// driver.findElement(By.xpath("//*[@id='sidebarNav']/nav/div/ul/li[5]/div/a/span")).click();
		// driver.findElement(By.xpath("//h3[@id='4-PrimaryNav-Maruti-Suzuki-Subscribe']")).click();
		// check I M interested Pop-up
		driver.findElement(By.xpath("//*[@id='car-interested']")).click();
		driver.findElement(By.id("shm_name")).sendKeys("Automation Test");
		;
		driver.findElement(By.id("shm_mobile")).sendKeys("9810923303");
		driver.findElement(By.id("shm_email")).sendKeys(
				"amit.kumar1@adglobal360.com");
		// WebElement state=driver.findElement(By.id("shm_dealerstate"));
		// Select mystate= new Select(state);
		// mystate.selectByValue("TL");
		verifyState();
	}

	public void verifyState() {
		List<WebElement> mystates = driver.findElements(By
				.xpath("//*[@id='shm_dealerstate']/option"));
		for (int i = 0; i < mystates.size(); i++) {
			System.out.println("states: " + mystates.get(i).getText());
			if (mystates.get(i).getText().equalsIgnoreCase("DELHI"));
			{
				System.out.println("Delhi is Present");
			}
			if (mystates.get(i).getText().equalsIgnoreCase("HARYANA"));
			{
				System.out.println("HARYANA is Present");
			}
			if (mystates.get(i).getText().equalsIgnoreCase("KARNATAKA"));
			{
				System.out.println("KARNATAKA is Present");
			}
			if (mystates.get(i).getText().equalsIgnoreCase("MAHARASHTRA"));
			{
				System.out.println("MAHARASHTRA is Present");
			}
			if (mystates.get(i).getText().equalsIgnoreCase("TELANGANA"));
			{
				System.out.println("TELANGANA is Present");
			}
			if (mystates.get(i).getText().equalsIgnoreCase("UTTAR PRADESH"));
			{
				System.out.println("UTTAR PRADESH is Present");
			}
		
			mystates.get(5).click();
			System.out.println("TestCase is passed");
			}
		}
		
	
	
}

