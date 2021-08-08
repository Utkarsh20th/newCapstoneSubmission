package Package_Medicare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Medicare_Homepage {

	WebDriver driver = null;
	WebElement ele = null;

	@Test
	public void Homepage(WebDriver driver) throws InterruptedException {

		this.driver = driver;

		Thread.sleep(4000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]/div/h3"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		System.out.println("Viewing : \"Most Viewed Medicines\"");
		Thread.sleep(3000);
		System.out.println("1");

		ele = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[4]/div/h3"));
		((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		System.out.println("Viewing : \"Most Purchased Medicines\"");
		Thread.sleep(3000);
		System.out.println("2");

	}

}
