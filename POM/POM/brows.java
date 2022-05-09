package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brows {
	public static WebDriver Browser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\sss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
		}
}
