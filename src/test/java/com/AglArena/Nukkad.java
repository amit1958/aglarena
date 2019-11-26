package com.AglArena;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nukkad {
	static WebDriver driver; 
	static String url= "https://mynukad.in/Nukkad-admin/dist/html/uikits/managestuff.php";
	
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","D:/Selenium/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe");
	driver= new FirefoxDriver();
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    driver.findElement(By.name("PhoneNbr")).sendKeys("7003038783");
    driver.findElement(By.name("Password")).sendKeys("loveutsav");
    driver.findElement(By.name("login1")).click();
    System.out.println("User is successfully Login");
    
   //Go to the managestuff page.
    driver.navigate().to("https://mynukad.in/Nukkad-admin/dist/html/uikits/managestuff.php");
    driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/thead/tr/th[6]")).click();
    
    //
    System.out.println("Pop-up window open");
    WebElement uploadfile=driver.findElement(By.xpath("//*[@id='fileToUpload']"));
    uploadfile.sendKeys("C:\\Users\\AGL\\Desktop\\Screenshot of S-Presso.jpg");
    driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Dheeraj Kumar");
  
   // driver.quit();
   
 
	}
}
