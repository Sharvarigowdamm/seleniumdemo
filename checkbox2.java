package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class checkbox2 {

	       static WebDriver driver;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(driver);
		 driver=new ChromeDriver(); 
		 System.out.println(driver);
			 driver.navigate().to("https://demoqa.com/checkbox"); 
			 driver.manage().window().maximize(); 
			 //WebElement expand=driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"][1]"));
			 WebElement expand=driver.findElement(By.xpath("//button[@class=\"rct-option rct-option-expand-all\"]"));
				
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("arguments[0].scrollIntoView();", expand);
				 
			
				expand.click();
				//driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]")).click();
				//WebElement angular=driver.findElement(By.id("tree-node-react"));
				//angular.click();
				WebElement angular=driver.findElement(By.xpath("//label[@for='tree-node-office']"));
				System.out.println("is displayed"+angular.isDisplayed());
				System.out.println("is enabled"+angular.isEnabled());
				angular.click();
				
		}


	}
