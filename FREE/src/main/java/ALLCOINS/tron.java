package ALLCOINS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tron {


	@Test
	public void Tronlogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32_87\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		//WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://free-tron.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("isthikhan@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Alaba2laba?");

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement element = driver
				.findElement(By.xpath("/html/body/main/section/section[1]/div/div/div[2]/div/div[1]/button"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click()", element);
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div/div/div/div/div[5]/button")));
		element1.click();

		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element11 = wait1.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div[1]/nav/div/ul/li[11]/a")));
		element11.click();

		driver.quit();

	}
}
