package Package_Medicare;

import org.openqa.selenium.WebDriver;                       // Add 3.141.59 selenium jar file    ++++++    // Add latest chromdriver "C:\Selenium_JARs\2_ChromeDriver\Zipped_File"
//import io.github.bonigarcia.wdm.WebDriverManager;           // Add 4.3.1 WebDriverManager jar file
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
import Package_Medicare.Medicare_Homepage;
import Package_Medicare.Medicare_scrollHomepage;
import Package_Medicare.Medicare_About;
import Package_Medicare.Medicare_Contact;
import Package_Medicare.Medicare_ViewProducts;
import Package_Medicare.Medicare_Login;
import Package_Medicare.Medicare_adminLogin;
import Package_Medicare.Medicare_PlaceOrder;
*/

public class Medicare_Driver {

	WebDriver driver = null;
	ChromeOptions chromeOptions = null;

	@BeforeClass
	public void setup() throws InterruptedException {
		
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_JARs\\2_ChromeDriver\\Zipped_File\\chromedriver.exe");

		//Creating WebDriver instance
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8082/medicare/");
		Thread.sleep(4000);

	}

	@Test(priority = 1)
	public void calling_webpages() throws InterruptedException {
		Medicare_Homepage       obj1 = new Medicare_Homepage();
		Medicare_scrollHomepage obj2 = new Medicare_scrollHomepage();
		Medicare_About          obj3 = new Medicare_About();
		Medicare_Contact        obj4 = new Medicare_Contact();
		Medicare_ViewProducts   obj5 = new Medicare_ViewProducts();
		Medicare_Login          obj6 = new Medicare_Login();
		Medicare_adminLogin     obj7 = new Medicare_adminLogin();
		Medicare_PlaceOrder     obj8 = new Medicare_PlaceOrder();
		obj1.Homepage(driver);
		obj2.scrollHomepage(driver);
		obj3.About(driver);
		obj4.Contact(driver);
		obj5.ViewProducts(driver);
		obj6.Login(driver);
		obj7.adminLogin(driver);
		obj8.PlaceOrder(driver);
		
	}	

	@AfterClass
	public void ending() {
		driver.quit();

	}

}
