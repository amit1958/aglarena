package com.AglArena;
import org.testng.annotations.Test;

public class MSGA_Verification extends origin {
	@Test
		public void MSGA_Validation() throws InterruptedException {
			//Apply Now Button
			String title= driver.getTitle();
			System.out.println("Title is " + title);
			driver.navigate().to(pr.getProperty("msga"));
			Thread.sleep(3000);
	}
}

