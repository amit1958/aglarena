package com.AglArena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Asserts extends origin{

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
}
		
	
	 

