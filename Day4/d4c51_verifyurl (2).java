package com.example.demo.test_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4c51_verifyurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //browser driver setup
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		//WebDriver driver=new EdgeDriver();
    
		//open link and maximize
    	driver.get("https://j2store.net/free/");
    	driver.manage().window().maximize();
    	
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
  
    	String url1="https://j2store.net/free/";
    	String url2="";
    	url2=driver.getCurrentUrl();
    	if(url1.equals(url2))
    		System.out.println("Correct 1st page");
    	
    	driver.findElement(By.linkText("Clothing (5)")).click();
    	
    	url1=driver.getCurrentUrl();
    	if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11"));
    		System.out.println("Correct 2nd page");
    	
    	driver.navigate().back();
    	driver.navigate().forward();
    	driver.navigate().refresh();
    	driver.quit();
	}

}
