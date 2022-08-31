package com.TestingB1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartPractice {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(6l,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3l,TimeUnit.SECONDS);	
driver.get("https://www.flipkart.com/");

Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");		
List<WebElement> totallist = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
for(int i=0;i<totallist.size();i++) {
totallist.get(i).getText();
System.out.println(totallist.get(i).getText()); 
if(totallist.get(i).getText().equalsIgnoreCase("iphone 13")){
totallist.get(i).click();
}
}
driver.quit();
	
}
		
	}		

	


