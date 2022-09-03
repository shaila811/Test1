package com.TestingB1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//radio button
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		//open window button
		 driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		  Set<String> window = driver.getWindowHandles();
		 java.util.Iterator<String> it = window.iterator();
		 String parent = it.next();
		 String child = it.next();
		 driver.switchTo().window(child);
		 String ct = driver.getTitle();
		 System.out.println(ct);
		 Assert.assertEquals(ct, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		 
		Thread.sleep(3000);
		driver.quit();
		

	}


}
