package Practisesele;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class M2202PM 
{
		public static WebDriver Openbrowser(String url)
	{
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(url);
return driver;
	}		
	}
	
	


