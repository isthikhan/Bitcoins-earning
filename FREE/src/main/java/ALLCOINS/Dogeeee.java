package ALLCOINS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Dogeeee {

	@Test
	public void ITClogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32_87\\chromedriver.exe");
	//ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	//WebDriver driver = new ChromeDriver(options);
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://dogehero.xyz/account/login");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.name("user_name")).sendKeys("isthikhan");
	driver.findElement(By.name("password")).sendKeys("Alaba2laba?");
	
	WebElement iFrame_checkbox = 
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]"));
			iFrame_checkbox.click();
	
	
	
	
}
}