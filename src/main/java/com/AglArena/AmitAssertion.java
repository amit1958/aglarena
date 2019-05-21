package com.AglArena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AmitAssertion extends origin{

	public static void loginAssert(){
		WebElement expected= driver.findElement(By.xpath("//*[@id='otp']"));
		String sexpected= expected.getAttribute("placeholder");
		String actual= "OTP1 *";
		try {
			Assert.assertEquals(sexpected, actual);;
		} catch (Exception e) {
			System.out.println(e);
		}
	
	 
		}
	public static void MSTAAssert(){
		String expected="Your request has been successfully sent."
				+ "Please sit back & relax while our customer experts get back to you!";
		WebElement actual = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/section/div[2]/div/div/p"));
		String actual1= actual.getText();
		System.out.println("text is " +actual1);
		Assert.assertEquals(actual1, expected);
			
		}
	
		public static void AltoPriceAssertMetallic(){
			String expecteda= "2,93,689.00";
			WebDriverWait price= new WebDriverWait(driver, 10);
			WebElement actual = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]"));
			price.until(ExpectedConditions.visibilityOf(actual));
			String actual1= actual.getText().trim();
			StringBuilder build = new StringBuilder(actual1);
			System.out.println("Pre Builder : " + build);
			build.deleteCharAt(0); // Shift the positions front.
//		    build.deleteCharAt(1);
//		    build.deleteCharAt(3);
//		    build.deleteCharAt(6);
//		    build.deleteCharAt(6);
//		    build.deleteCharAt(6);
			System.out.println("Post Builder : " + build);
			//String expected1=actual1.toString();
			Assert.assertEquals(build, expecteda);
			
		}
		/*public static void AltoPriceAssertNonMetallic(){
			String expected="2,93,689.00";
			WebElement actual = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[3]//p[1]"));
			String actual1= actual.getText().toString();
			System.out.println("text is " +actual1);
			Assert.assertEquals(actual1, expected);
	
		}
		*/
}
	 

