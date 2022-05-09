package ss;

import org.openqa.selenium.Dimension;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSK13 {
	public static void main ( String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\sss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com");
		
		//Dimension d = new Dimension(500,600);
		//driver.manage().window().setSize(d);
	}

}
