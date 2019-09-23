package com.ArenaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.AglArena.origin;

public class PriceListElements extends origin{
	
	public void AllCarsPriceTest() throws InterruptedException{
		//Apply Now Button
		String title= driver.getTitle();
		System.out.println("Title of the page" + title);
		//GetPricelist
		//driver.findElement(By.xpath("//a[@id='price-list']")).click();
		String pricelistpage= "https://www.marutisuzuki.com/channels/arena/price-list";
		//driver.navigate().to(pricelistpage);
		
		Thread.sleep(3000);
		
		//Select Car/state/city
		//Select car= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='model']")));
		
		String[] Cars = {"ALTO","ALTO K10","CELERIO","CELERIO X","DZIRE","EECO","ERTIGA",/*"GYPSY","OMNI"*/"SWIFT","VITARA BREZZA","WAGONR"};
		for(int i = 0; i< Cars.length; i++){
			driver.navigate().to(pricelistpage);
			Thread.sleep(2000);
			Select car= new Select(driver.findElement(By.xpath("//select[@id='modelpricelist']")));

			System.out.println(Cars[i]);
			
			
		car.selectByVisibleText(Cars[i]);
		
		//Select state= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='state']")));
		Select state= new Select(driver.findElement(By.xpath("//select[@id='stateCode']")));
		state.selectByVisibleText("DELHI");
		Thread.sleep(2000);
		//Select city= new Select(driver.findElement(By.xpath("//div[@class='modal-body']//select[@id='city']")));
		Select city= new Select(driver.findElement(By.xpath("//div[@id='citydealer']//select[@id='dealercity']")));
		city.selectByVisibleText("DELHI");
		
		//Submit the Form
		//driver.findElement(By.xpath("//div[@class='modal-body']//button[@class='btns button-black toggleScreen get-pricelist-result'][contains(text(),'CONTINUE')]")).click();
		driver.findElement(By.xpath("//button[@class='btns button-black toggleScreen getPriceList']")).click();
		Thread.sleep(10000);
		
		/*WebElement calculateEMI= driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[4]//a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calculateEMI);
		Actions mousemove= new Actions(driver);
		mousemove.moveToElement(calculateEMI).perform();*/
		
		switch(Cars[i].toLowerCase()) {
        case "alto" :
        		String expecteda="₹2,93,689.00";
				String actual = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
				System.out.println("====acutal=== " + actual);
//				StringBuilder build = new StringBuilder(actual);
//				System.out.println("Pre Builder : " + build);
//				build.deleteCharAt(0); // Shift the positions front.
//			    build.deleteCharAt(1);
//			    build.deleteCharAt(3);
//			    build.deleteCharAt(6);
//			    build.deleteCharAt(6);
//			    build.deleteCharAt(6);
//				System.out.println("Post Builder : " + build);
				//String expected1=actual1.toString();
				Assert.assertEquals(actual, expecteda);
				System.out.println("TestCase passed");
				break;
				
						
		case "alto k10" :
		     
    		String expectedk10="₹3,65,843.00";
			String actualk10 = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualk10);
			Assert.assertEquals(actualk10, expectedk10);
			System.out.println("TestCase passed");
			break;
			
		case "celerio" :
		     
    		String expectedcelerio="₹4,31,289.00";
			String actualcelerio = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualcelerio);
			Assert.assertEquals(actualcelerio, expectedcelerio);
			System.out.println("TestCase passed");
			break;
			
		case "celerio x" :
		     
    		String expectedceleriox="₹4,80,198.00";
			String actualceleriox = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualceleriox);
			Assert.assertEquals(actualceleriox, expectedceleriox);
			System.out.println("TestCase passed");
			break;
		
		case "dzire" :
		     
    		//String expecteddzire="₹5,69,923.00";
			String expecteddzire="₹5,82,613.00";
			String actualdzire = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualdzire);
			Assert.assertEquals(actualdzire, expecteddzire);
			System.out.println("TestCase passed");
			break;
		
		case "eeco" :
		     
    		String expectedeeco="₹3,55,205.00";
			String actualeeco = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualeeco);
			Assert.assertEquals(actualeeco, expectedeeco);
			System.out.println("TestCase passed");
			break;
		case "ertiga" :
		     
    		//String expectedertiga="₹7,44,689.00";
			String expectedertiga="₹7,54,689.00";
			String actualertiga = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualertiga);
			Assert.assertEquals(actualertiga, expectedertiga);
			System.out.println("TestCase passed");
			break;
			
		case "swift" :
		     
    		//String expectedswift="₹4,99,000.00";
    		String expectedswift="₹5,14,000.00";
			String actualswift = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualswift);
			Assert.assertEquals(actualswift, expectedswift);
			System.out.println("TestCase passed");
			break;
		case "vitara brezza" :
		     
    		String expectedvitara="₹7,67,742.00";
			String actualvitara = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualvitara);
			Assert.assertEquals(actualvitara, expectedvitara);
			System.out.println("TestCase passed");
			break;
		case "wagonr" :
			//String expectedwagonr="₹4,19,613.00";
    		String expectedwagonr="₹4,34,000.00";
			String actualwagonr = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualwagonr);
			Assert.assertEquals(actualwagonr, expectedwagonr);
			System.out.println("TestCase passed");
			break;
			
	/*	case "gypsy" :
		     
    		String expectedgypsy="₹6,26,091.00";
			String actualgypsy = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualgypsy);
			Assert.assertEquals(actualgypsy, expectedgypsy);
			System.out.println("TestCase passed");
			break;
		case "omni" :
		     
    		String expectedomni="₹2,85,663.00";
			String actualomni = driver.findElement(By.xpath("//section[@class='price-list-check']//li[2]//div[2]//p[1]")).getText().trim();
			System.out.println("====acutal=== " + actualomni);
			Assert.assertEquals(actualomni, expectedomni);
			System.out.println("TestCase passed");
			break;
       */
		}	
       
     }
	}
}
		
			
		
		
	


	

