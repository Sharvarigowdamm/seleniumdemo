package com.sel.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demopage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		 driver.navigate().to("https://demoqa.com/text-box"); 
		 driver.manage().window().maximize(); 
		 WebElement name=driver.findElement(By.id("userName"));
		 name.sendKeys("Sharvari");
		 WebElement email=driver.findElement(By.id("userEmail"));
		 email.sendKeys("Sharvari.mm@tcs.com");
		 WebElement cadd=driver.findElement(By.id("currentAddress"));
		 cadd.sendKeys("#75,2nd cross,banglore");
		 WebElement ele4=driver.findElement(By.id("permanentAddress"));
		 ele4.sendKeys("manglore,karnataka");
		 
	        // Scrolling down the page till the element is found   
		WebElement sub= driver.findElement(By.id("submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", sub);
		 
		 sub.click();
		 
	}

}
