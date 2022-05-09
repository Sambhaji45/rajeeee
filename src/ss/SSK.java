package ss;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SSK { // get Method

	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
           WebDriver driver = new ChromeDriver();
           
          driver.get("https://web.whatsapp.com");	
	}
	
	 
	 } 
