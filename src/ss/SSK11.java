package ss;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class SSK11 { // Nevigate Method
      
	public static void main ( String[]args)
{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://web.whatsapp.com");
	//driver.getTitle();
  driver.navigate().to("https://web.whatsapp.com");
  driver.navigate().back();   // to backword page
  driver.navigate().forward(); // to forword page
  driver.navigate().refresh(); // to refresh the page
  }
}
