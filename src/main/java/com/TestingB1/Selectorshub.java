package com.TestingB1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorshub {
public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(300l,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3000l,TimeUnit.SECONDS);

driver.get("https://selectorshub.com/xpath-practice-page/");

driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("shikha");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("081315");
driver.findElement(By.name("company")).sendKeys("ToTo");
List<WebElement> frame=driver.findElements(By.tagName("iframe"));
System.out.println(frame.size());
WebElement scrollview = driver.findElement(By.xpath("//button[text()='Checkout here']"));

JavascriptExecutor	 js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", scrollview);	
//entering into iframe. 
driver.switchTo().frame("pact");	


	}

}
