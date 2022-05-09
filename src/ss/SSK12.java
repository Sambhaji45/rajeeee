package ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSK12 {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com"); //get method help us to open a url on browser
		String actualTitle = " WhatsApp Web ";
		String currentTitle = driver.getTitle(); // to get current title of webpage
		//driver.getTitle();
		if(actualTitle.equals(currentTitle))
		{
			System.out.println("This is Matching");
		}
		else
		{
			System.out.println("This is Mismatchig");
		}
		String url =driver.getCurrentUrl();	 // to get current url of webpage	
	       System.out.println(url);
	   //   driver.manage().window().maximize();// to maximize browser
         // driver.manage().window().minimize(); // to minimize browser
	}
}
