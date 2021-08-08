package Package_Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Medicare_adminLogin {

	WebDriver driver = null;
	WebElement ele = null;

	@Test
	public void adminLogin(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		
		Thread.sleep(4000);
		this.driver.get("http://127.0.0.1:8082/medicare/");
		Thread.sleep(2000);
		System.out.println("24");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li[2]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("25");
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[1]/div/input"));
		ele.sendKeys("vk@gmail.com");
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[2]/div/input"));
		ele.sendKeys("admin");		
		
		ele = this.driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[3]/div/input[2]"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("26");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[1]/li[4]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("27");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div/div[2]/div/table/tbody/tr[2]/td[7]/label/div"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div/div[2]/div/table/tbody/tr[4]/td[7]/label/div"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("28");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("29");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("30");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[1]/li[3]/a"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("31");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/label/input"));
		ele.sendKeys("Aceclofenac");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/a"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("32");
		
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/ul/li/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("33");
		
	}

}
