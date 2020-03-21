package co.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssaignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("​https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@title='Search'"));
		SearchBox.sendKeys("Club Mahindra");
		WebElement SearchIcon = driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
		SearchIcon.click();
		WebElement CheckBox= driver.findElement(By.name("Club Mahindra Madikeri, Coorg"));
		CheckBox.click();
		Thread.sleep(2000);
		js.executeScript("window.scollBy(0,4000)");
		WebElement TextBox=driver.findElement(By.className("//a[@class='ui_button primary']"));
		TextBox.sendKeys("Club Mahindra");
		Thread.sleep(2000);

		WebElement AddReview = driver.findElement(By.id("overallRatingFlagText:"));
		CheckBox.click();
		WebElement WriteReview = driver.findElement(By.name("//input[@type='text' or @name='ReviewTitle']"));
		WriteReview.sendKeys("Nice Coorg Trip");
		js.executeScript("window.scrollBy(0,4000)");
		WebElement Review = driver.findElement(By.id("ReviewText"));
		Review.sendKeys("Nice place for vaction");
		js.executeScript("window.scollBy(0,2000)");

		WebElement SelectCheckBox=driver.findElement(By.id("noFraud"));
		SelectCheckBox.click();
		Thread.sleep(4000);
		WebElement Submit = driver.findElement(By.id("SUBMIT"));
		Submit.click();
		Thread.sleep(2000);
		driver.quit();
	}
}


