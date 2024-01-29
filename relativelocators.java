package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativelocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		 driver.navigate().to("https://demoqa.com/checkbox"); 
		 driver.manage().window().maximize(); 
		 //WebElement expand=driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"][1]"));
		 WebElement expand=driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(By.xpath("//span[@class=\"rct-checkbox\"]")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", expand);
			expand.click();
			 
	}

}
