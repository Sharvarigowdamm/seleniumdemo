package com.sel.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		 driver.navigate().to("https://demoqa.com/checkbox"); 
		 driver.manage().window().maximize(); 
		 WebElement expand=driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"][1]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", expand);
			expand.click();
			 
	}

}
