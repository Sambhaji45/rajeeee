package SFlat7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSD {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement sam = driver.findElement(By.xpath("//input[@value='Option 1']"));
		//sam.sendKeys("MS");
		
		sam.click();
		System.out.print(sam.isDisplayed());
		 
	    
	}
	

}
