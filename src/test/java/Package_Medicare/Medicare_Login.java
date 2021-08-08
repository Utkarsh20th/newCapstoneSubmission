package Package_Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Medicare_Login {
	
	WebDriver driver = null;
	WebElement ele = null;

	@Test
	public void Login(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		
		Thread.sleep(4000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li[2]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("10");
		
		String username = "kn@gmail.com";
		String password = "12345";
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[1]/div/input"));
		ele.sendKeys(username);
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[2]/div/input"));
		ele.sendKeys(password);
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[3]/div/input[2]"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("11");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/a"));
		ele.click();
		Thread.sleep(1000);
		System.out.println("12");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/ul/li[3]/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("13");

	}
	
}
