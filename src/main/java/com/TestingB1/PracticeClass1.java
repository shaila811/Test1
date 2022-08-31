package com.TestingB1;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass1 {
	
public static void main(String[] args) throws InterruptedException {
	
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
	
   driver.manage().window().maximize();
   driver.manage().timeouts().pageLoadTimeout(6000l,TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(3000l,TimeUnit.SECONDS);

   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  /* String actual = driver.getTitle();
   String expected = "Practice Page";
   Assert.assertEquals(actual, expected);
   System.out.println(driver.getTitle());
   
   
   driver.findElement(By.className("radioButton")).click();
   driver.findElement(By.id("autocomplete")).clear();
   
   driver.findElement(By.id("autocomplete")).sendKeys("Bangladesh");
   WebElement s = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
   
   Select select=new Select(s);
   
   select.selectByVisibleText("Option2");
  
   driver.findElement(By.id("checkBoxOption2")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
   
   Thread.sleep(3000);
   driver.switchTo().alert().accept();
   
   WebElement r=driver.findElement(By.xpath("//button[@id='mousehover']"));
   JavascriptExecutor je=(JavascriptExecutor)driver;
   je.executeScript("arguments[0].scrollIntoView();", r);
   Actions action=new Actions(driver);
   action.moveToElement(r).perform();
   
   Thread.sleep(3000);
   WebElement w=driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
   action.moveToElement(w).click().perform();*/
   
  driver.findElement(By.xpath("//button[@id='openwindow']")).click();
  Set<String> window = driver.getWindowHandles();
 java.util.Iterator<String> it = window.iterator();
 String parent = it.next();
 String child = it.next();
 driver.switchTo().window(child);
 String ct = driver.getTitle();
 System.out.println(ct);
 Assert.assertEquals(ct, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
 
  Thread .sleep(3000);
  driver.quit();
   
   
   }

}
