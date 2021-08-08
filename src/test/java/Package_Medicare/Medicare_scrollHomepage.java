package Package_Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Medicare_scrollHomepage {
	
	WebDriver driver = null;
	WebElement ele = null;
	
	@Test
	public void scrollHomepage(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		
		Thread.sleep(4000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/p"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(3000);
		this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		System.out.println("3");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr/td[6]/a[1]/span"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("Viewing : \""+this.driver.getTitle()+"\"");
		System.out.println("4");
		
  }  
  
}
