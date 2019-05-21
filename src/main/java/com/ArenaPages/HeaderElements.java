package com.ArenaPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.AmitAssertion;
import com.AglArena.origin;

public class HeaderElements extends origin{

	public void loginTest() throws InterruptedException{
		driver.findElement(By.cssSelector(".utilityItems > li:nth-child(4) > a:nth-child(1) > span:nth-child(1)")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/header/div[4]/ul/li[4]/a/span")).click();
		Thread.sleep(5000);
		
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	
		
                    System.out.println(driver.switchTo().window(ChildWindow).getTitle());
            }
        }
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='name' ][class='form-control' ]")));
		WebElement name= driver.findElement(By.xpath("input[id='name' ][class='form-control']"));
		name.sendKeys("LoginTest"); 
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("9800000000");
		driver.findElement(By.xpath("//*[@id='lnkOTP']")).click();
		Thread.sleep(8000);
		AmitAssertion.loginAssert();
		
            
	
        }
	}

