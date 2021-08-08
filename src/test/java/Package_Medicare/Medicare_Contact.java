package Package_Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Medicare_Contact {

	WebDriver driver = null;
	WebElement ele = null;


	@Test
	public void Contact(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		
		Thread.sleep(4000);
		ele= this.driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[1]/li[2]/a"));
		ele.click();
		Thread.sleep(3000);
		System.out.println("Viewing : \""+this.driver.getTitle()+"\"");
		String exp = "This is an contact us page";
		String act = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/p")).getText();
		Assert.assertEquals(act, exp);
		System.out.println("Message on webpage : \""+act+"\"");
		System.out.println("6");

	}

}
