package com.ArenaPages;

import org.openqa.selenium.By;

import com.AglArena.origin;

public class CarCompareElements extends origin{
	
	public void compare() throws InterruptedException{
		
		System.out.println("Title of the page");
		driver.findElement(By.xpath("/html/body/div[3]/section[1]/div[1]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='add-to-compare']/p")).click();
	}

}
