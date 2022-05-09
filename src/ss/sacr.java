package ss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sacr {

	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	File sa=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File da =new File("E:\\DailyNotes\\sambha.jpg");
	FileHandler.copy(sa, da);
	}}
