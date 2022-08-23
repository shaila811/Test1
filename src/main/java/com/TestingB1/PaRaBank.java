package com.TestingB1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaRaBank {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//Assertion
		String actual=driver.findElement(By.xpath("//h1[@class='title']")).getText();//actual result
		System.out.println(actual);
		String expected="Signing up is easy!";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
		
		
		
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Shaila");
    driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Parveen");
    driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("2500 Kinghts Rd");
    driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bensalem");
    driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("PA");
    driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("19020");
    driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("6462702783");
    driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("0811131530");
    driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Nayo1");
    driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("1234561");
    driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("1234561");
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='Register']")).click();
    
		
	driver.quit();	
		
		
		
		
		
	}

}
