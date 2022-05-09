package Practisesele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SK2203 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
	       Thread.sleep(3000);
         
		driver.navigate().to("https:www.facebook.com/login");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}

