package Practisesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sud {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		WebElement username = driver.findElement(By.xpath("//input[@id='email]"));
		username.sendKeys("Darshan");
		Thread.sleep(3000);
		driver.close();
		
	}

}
