package SFlat7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		 
		WebElement alert =driver.findElement(By.xpath("//input[@class='inputs']"));
		alert.sendKeys("Sudarshan");
	  alert.click();
	System.out.println(alert.isDisplayed());
	
	}
	

}
