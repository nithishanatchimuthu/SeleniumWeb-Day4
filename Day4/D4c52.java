package com.example.demo.test_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4c52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//chrome
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
    	//open link and maximize
    	driver.get("https://j2store.net/free/");
    	driver.manage().window().maximize();
    	
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
    	
    	driver.findElement(By.linkText("Clothing (5)")).click();
    	Thread.sleep(5000);
    	
    	List<WebElement> l1=driver.findElements(By.xpath("//h2[@class='product-title']"));
    	for(WebElement link:l1)
    	{
    		System.out.println(link.getText());
    	}
	}

}
