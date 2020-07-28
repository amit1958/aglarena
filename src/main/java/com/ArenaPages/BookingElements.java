package com.ArenaPages;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.AglArena.origin;

public class BookingElements extends origin {

	public void bookingElementsTest() throws InterruptedException {
		// Apply Now Button
		String title = driver.getTitle();
		driver.navigate().to(pr.getProperty("bookingpage1"));
		System.out.println("========Page Title is =======" + title);
		Thread.sleep(5000);
		// Form Open
		driver.findElement(By.xpath("// div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12'] //input[@id='name']"))
				.sendKeys("BookingTest");
		driver.findElement(By.xpath("// div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12'] //input[@id='email']"))
				.sendKeys("test1@booking.com");
		driver.findElement(
				By.xpath("// div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12'] //input[@id='phone']"))
				.sendKeys("9811854502");
		driver.findElement(By.id("triggerOTP-bo")).click();

		JFrame path = new JFrame();
		String otp = JOptionPane.showInputDialog(path, "Enter OTP");
		System.out.println("otp is " + otp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12'] //input[@id='otp']"))
				.sendKeys(otp);

		driver.findElement(By.id("FormChkBoxBook5")).click();
		driver.findElement(By.xpath("//div[@class='footer'] //input[@id='screen1-button']"))
				.click();
		Thread.sleep(5000);
		driver.getCurrentUrl();
		String expectedurl = "https://www.marutisuzuki.com/channels/arena/service/ebook-car/ebook-dealer-model";
		if (driver.getCurrentUrl() == expectedurl) {
			System.out.println(("Testcase is passed"));
		}

		List<WebElement> state = driver.findElements(By.xpath("//select[@class='dropdown-frame select-state']"));
		int statecount = state.size();
		System.out.println(statecount);
		for (int i = 0; i < statecount; i++) {
			state.get(i).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		
			List<WebElement> city = driver.findElements(By.xpath("//select[@class='dropdown-frame select-city']"));
		
			for (int c = 0; c < city.size(); c++) {
				city.get(c).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				List<WebElement> dealers = driver.findElements(By.xpath("//select[@class='dropdown-frame select-dealer']"));
				for (int j = 0; j < dealers.size(); j++) {
					String dealerResult = dealers.get(j).getText();
					System.out.println("Dealers are " + dealerResult);
				}
			}

		}

	}
}
