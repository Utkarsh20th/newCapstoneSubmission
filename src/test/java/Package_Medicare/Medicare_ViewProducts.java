package Package_Medicare;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Medicare_ViewProducts {

	WebDriver driver = null;
	WebElement ele = null;	

	@Test
	public void ViewProducts(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		
		Thread.sleep(4000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[1]/li[3]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("7");
		
		String find = "Ciprofloxacin";
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[3]"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
		System.out.println("8");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/p"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/label/input"));
		ele.sendKeys(find);
		Thread.sleep(3000);
		System.out.println("9");
		
	}
	
}
