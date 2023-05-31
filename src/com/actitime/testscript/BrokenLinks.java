package com.actitime.testscript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrokenLinks 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	    public static void main(String[] args) 
	    {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.actitime.com/login.do");
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        for (WebElement link : links) 
	        {
	            String href = link.getAttribute("href");
	                try 
	                {
	                	URL u=new URL(href);
	                	URLConnection uc = u.openConnection();
	                    HttpURLConnection huc = (HttpURLConnection)uc;
	                    huc.connect();
	                    int responseCode = huc.getResponseCode();
	                    if (responseCode >= 400) 
	                        System.out.println("Broken link found: " + href);
	                      else 
	                        System.out.println("Valid link found: " + href);
	                } 
	                catch (Exception e) 
	                {
	                }
	            }
	        driver.quit();
	    }
}


