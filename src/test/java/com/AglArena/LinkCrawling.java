package com.AglArena;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkCrawling extends origin {

	@Test
	public void findAllLinks() throws MalformedURLException, Exception {
		List<WebElement> mylist = new ArrayList<WebElement>();
		mylist = driver.findElements(By.tagName("a"));
		System.out.println(mylist);
		mylist.addAll(driver.findElements(By.tagName("img")));
//		List<WebElement> finallist = new ArrayList<WebElement>();
		List<WebElement> linklist = new LinkedList<WebElement>();
		for (WebElement alllink : mylist) {
			if (alllink.getAttribute("href") != null
					&& alllink.getAttribute("href").startsWith("https")) {
				//String url = alllink.getAttribute("href");
				// System.out.println("==============myurls======= " +url);
				/*
				 * try{ driver.get(url); } catch (Exception e) {
				 * System.out.println("Failed"); }
				 */

				// System.out.println(alllink.getAttribute("href"));
				System.out.println("URL: " + alllink.getAttribute("href")
						+ " returned "
						+ isLinkBroken(new URL(alllink.getAttribute("href"))));

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
