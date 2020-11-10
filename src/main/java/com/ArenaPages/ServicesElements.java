package com.ArenaPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.origin;

public class ServicesElements extends origin {
	
	
	public void serviceAppointment() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='sidebarNav']/nav/div/ul/li[4]/div/a/span")).click(); //click on service link
		//Now book service appointment 
		WebElement bookappointment= driver.findElement(By.xpath("//section[@class='service-quicklink-page']/div[3]/div/div/span/a")); //click on book service appointment
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", bookappointment);
	Thread.sleep(10000);
		//	Form will open
		driver.findElement(By.id("service_u_name")).sendKeys("Test");
		driver.findElement(By.id("ser_phone")).sendKeys("9810923303");
	
			//click on send OTP
		WebElement sendotp=  driver.findElement(By.xpath("//*[@id='service_apnt_form']/div/div[1]/div[3]/div/a"));
		myWait = new WebDriverWait(driver, 8);
		myWait.until(ExpectedConditions.visibilityOf(sendotp));
		sendotp.click();
			
		//verify otp
		WebElement verifyotp= driver.findElement(By.id("service_otpVerify"));
		myWait.until(ExpectedConditions.elementToBeClickable(verifyotp));
		verifyotp.sendKeys("12345");
		//select the registered car
		driver.findElement(By.xpath("//input[@name='service_selectCar']")).click();
		//select the state
		WebElement state= driver.findElement(By.cssSelector("#state_book_appointmnt"));
		Select mystate= new Select(state);
		mystate.selectByVisibleText("DELHI");
		//fetchout the dealers in the list
	
		List<WebElement> dealers= driver.findElements(By.xpath("//ul[@id='dealer_book_appointmnt'] /li"));
		
		for(WebElement requireddealer : dealers){
			if(requireddealer.getText().equalsIgnoreCase("AAA VEHICLEADES PVT LTD"));
			{
			requireddealer.click();
			}
		}
		//choose the date
		driver.findElement(By.xpath("//input[@id='service_datepic']")).click();
		
		
		List<WebElement> choosedate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'] //td"));
		for(WebElement mydate:choosedate){
			if(mydate.getAttribute("data-handler").equalsIgnoreCase("data-handler"));
			{
				mydate.click();
			}
			
		}
		driver.findElement(By.xpath("//input[@id='chk_box_service']")).click();
		//submit the form
		driver.findElement(By.xpath("//button[@id='service_continuebtn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='center thanks-content-service']/p[2]")).getText());
		
		
	
	}
	
}

	
	
	
/*	public void bookService() throws InterruptedException{
		driver.navigate().to("http://www.marutisuzuki.com/service");
		driver.findElement(By.id("arena-book-now")).click();
		driver.findElement(By.id("phone11")).sendKeys("9811854502");
		driver.findElement(By.id("lnkOTP-service")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("// div[@id='otp-service1']//*[@id='otp']")).sendKeys("12345");
		
		driver.findElement(By.id("ServiceChkBox1")).click();
		//submit the form
		driver.findElement(By.id("Btn-Service1")).click();
		Thread.sleep(10000);
		
	
	
	public void costCalculator() throws InterruptedException{
		driver.get(pr.getProperty("service"));
//		driver.findElement(By.xpath("//div[@class='first-block01 desktop-only']//img[@class='qlinkImg']")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'COST CALCULATOR')]")).click();
		//model
		
		String[] Cars = {"A-STAR","ALTO","ALTO 800","ALTO K10",
				"BALENO","CELERIO","CIAZ","DZIRE","EECO","ERTIGA","ESTEEM","GRAND VITARA",
				"GYPSY","IGNIS","KIZASHI","M 800","NEW SWIFT","NEW SWIFT DZIRE","NEW WAGON-R",
				"OMNI","RITZ","S-CROSS","SMG  BALENO","SUPER CARRY","SWIFT","SWIFT DZIRE","SX4",
				"VITARA BREZZA","WAGON R","ZEN","ZEN ESTILO"};
		for(int i = 0; i< Cars.length; i++){
			myWait= new WebDriverWait(driver, 5);
			myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='first-block01 desktop-only']//img[@class='qlinkImg']")))).click();
			myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'COST CALCULATOR')]")))).click();
			Thread.sleep(2000);
			Select car= new Select(driver.findElement(By.xpath("//select[@id='model-cost-calculate']")));
			System.out.println(Cars[i]);	
			car.selectByVisibleText(Cars[i]);
		
		//fuel
		WebElement fuel= driver.findElement(By.xpath("//select[@id='variantName-cost-calculate']"));
		
		Select cfuel= new Select(fuel);
		
		cfuel.selectByVisibleText("PETROL");
		//state
		WebElement state= driver.findElement(By.xpath("//select[@id='dealerstate-cost-calculate']"));
		Select cstate= new Select(state);
		cstate.selectByVisibleText("DELHI");
		//city
		WebElement city= driver.findElement(By.xpath("//select[@id='dealercity-cost-calculate']"));
		Select ccity= new Select(city);
		ccity.selectByVisibleText("DELHI");
		//submit
		driver.findElement(By.xpath("//button[@class='btn calculatorBtn']")).click();
	//Pop up
		driver.findElement(By.xpath("//label[contains(text(),'PERIODIC MAINTENANCE SERVICE')]")).click();
	//increase and decrease kms
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12']//div[@id='increase']")).click();
		//driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12']//div[@id='decrease']")).click();
		driver.findElement(By.xpath("//a[@class='btn-calculate']")).click();
		// Consumable Cost 
		driver.findElement(By.xpath("//label[contains(text(),'ConsumableCost')]"));
		//Cost Value
		try {
			WebElement consumablecost= (WebElement) driver.findElements(By.tagName("label"));
			System.out.println("Lables are" +consumablecost.getText());
//			String actualvalue=consumablecost.getText();
//			String expectedvalue= "1 576.45";
//			assertEquals(actualvalue, expectedvalue);
		} catch (Exception e) {
			System.out.println("Consumable cost present");
		}
		try {
			WebElement labourecost= driver.findElement(By.xpath("//label[contains(text(),'0')]"));
			String lactualvalue=labourecost.getText();
			String lexpectedvalue= "2 235";
			assertEquals(lactualvalue, lexpectedvalue);
		} catch (Exception e) {
			System.out.println("labour cost present");
		}
		try {
			WebElement partcost= driver.findElement(By.xpath("//label[contains(text(),'0')]"));
			String pactualvalue=partcost.getText();
			String pexpectedvalue= "468.5";
			assertEquals(pactualvalue, pexpectedvalue);
		} catch (Exception e) {
			System.out.println("part cost present");
		}
		
		}	
		
	}
	}*/


