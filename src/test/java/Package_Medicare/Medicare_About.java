package Package_Medicare;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Medicare_About {

	WebDriver driver = null;
	WebElement ele = null;

	@Test
	public void About(WebDriver driver) throws InterruptedException {

		this.driver = driver;

		Thread.sleep(4000);
		ele = this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[1]/li[1]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("Viewing : \""+this.driver.getTitle()+"\"");
		String exp = "This is an about us page";
		String act = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/p")).getText();
		Assert.assertEquals(act, exp);
		System.out.println("Message on webpage : \""+act+"\"");
		System.out.println("5");

	}

}
