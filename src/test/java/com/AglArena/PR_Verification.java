package com.AglArena;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PR_Verification extends origin {

	/*@Test
		public void Media_Page() throws InterruptedException {
			//Apply Now Button
			String title1= driver.getTitle();
			System.out.println("Title is " + title1);
			driver.navigate().to(pr.getProperty("media"));
			Thread.sleep(3000);
		}*/
	@Test
		public void PR_Validation() throws InterruptedException {
			//Apply Now Button
			String title= driver.getTitle();
			System.out.println("Title is " + title);
			driver.navigate().to(pr.getProperty("pr"));
			WebElement loadmore= driver.findElement(By.xpath("//button[@class='btns showMore button-black'][contains(text(),'Load More')]"));
			loadmore.click();
			Thread.sleep(3000);
	}
}

