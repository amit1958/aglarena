package com.ArenaPages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bsh.Console;

import com.AglArena.origin;

public class PressReleaseElements extends origin{
	@Test
	public void PRElementsTest() throws MalformedURLException, Exception{
		//Apply Now Button
		String title= driver.getTitle();
		System.out.println("Title is " + title);
		driver.navigate().to(pr.getProperty("arenaworld"));
		driver.findElements(By.xpath("//*[@id='divContainer']/div[@class='card mb-4 box-shadow']"));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[2]/div/div[2]/div[1]/ul/li[6]/a")).click();
		
		
		List<WebElement> mylist = new ArrayList<WebElement>();
		mylist = driver.findElements(By.tagName("a"));
		System.out.println(mylist);
		mylist.addAll(driver.findElements(By.tagName("img")));

		//List<WebElement> linklist = new LinkedList<WebElement>();
		for (WebElement alllink : mylist) {
			if (alllink.getAttribute("href") != null
					&& alllink.getAttribute("href").startsWith("https://www.marutisuzuki.com/arenaworld/")) {
				//String url = alllink.getAttribute("href");
				// System.out.println("==============myurls======= " +url);
				/*
				 * try{ driver.get(url); } catch (Exception e) {
				 * System.out.println("Failed"); }
				 */

				// System.out.println(alllink.getAttribute("href"));
				//String allurls= alllink.getAttribute("href");
				//System.out.println("=======All URLS=======" +allurls );
				System.out.println("URL: " + alllink.getAttribute("href")
						+ " returned "
						+ isLinkBroken(new URL(alllink.getAttribute("href"))));
				ArrayList<String> urls= new ArrayList<String>();
				System.out.println("URL's are " +urls.add(alllink.getAttribute("href")));
				
			}

		}
	}

	public String isLinkBroken(URL url) throws Exception

	{

		// url = new URL("http://yahoo.com");

		String response = "";

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		try

		{

			connection.connect();

			response = connection.getResponseMessage();
			System.out.println(connection.getResponseMessage());

			connection.disconnect();

			return response;

		}

		catch (Exception exp)

		{

			return exp.getMessage();

		}

	}
	}

