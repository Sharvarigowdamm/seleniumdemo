package com.sel.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver(); 
		 driver.navigate().to("https://igvenkatesh.github.io/simpleHtmlDemoPage"); 
		 driver.manage().window().maximize(); 
		 driver.findElement(By.xpath("//input[@value='m']")).click();
		 //WebElement ele= driver.findElement(By.id("fname"));
		 //WebElement ele= driver.findElement(By.cssSelector("#fname"));
		 WebElement ele= driver.findElement(By.xpath("//input[@id='fname']"));
		 ele.clear();
		 ele.sendKeys("Sharvari");
		 
		 WebElement ele1= driver.findElement(By.id("lname"));
		 ele1.clear();
		 ele1.sendKeys("Gowda");
		 
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 //driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
