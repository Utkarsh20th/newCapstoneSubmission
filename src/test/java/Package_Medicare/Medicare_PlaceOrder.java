package Package_Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Medicare_PlaceOrder {

	WebDriver driver = null;
	WebElement ele = null;	

	@Test
	public void PlaceOrder(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		
		Thread.sleep(2000);
		this.driver.get("http://127.0.0.1:8082/medicare/");
		Thread.sleep(2000);
		System.out.println("34");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li[2]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("35");
		
		ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[1]/div/input"));
		ele.sendKeys("kn@gmail.com");
		
		ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[2]/div/input"));
		ele.sendKeys("12345");
		
		ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div[2]/form/div[3]/div/input[2]"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("35");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[4]/div/h3"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[5]/div[4]/div/div/a"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("36");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/a[1]"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("37");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tbody/tr/td[3]/input"));
		ele.click();
		Thread.sleep(2000);
		System.out.println("38");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tbody/tr/td[5]/button"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("39");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tfoot/tr[2]/td[1]/a"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("40");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a[2]/span"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[6]/a[2]/span"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("41");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tfoot/tr[2]/td[4]/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("43");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div/div/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("44");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/input"));
		ele.sendKeys("111222333444");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div[1]/input"));
		ele.sendKeys("02");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div[2]/input"));
		ele.sendKeys("20");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div/input"));
		ele.sendKeys("123");
		
		Thread.sleep(4000);
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("45");
		
		Thread.sleep(5000);
		
		ele= driver.findElement(By.xpath("/html/body/div/nav/div/div/a"));
		ele.click();
		Thread.sleep(4000);
		System.out.println("46");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("47");
		
		ele = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li/ul/li[3]/a"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("48");		
		
	}

}
