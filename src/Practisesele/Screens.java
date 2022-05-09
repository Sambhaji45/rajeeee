
package Practisesele;

public class Screens {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\sss\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://demo.guru99.com/test/radio.html");
	File Sk = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	File SS = new File("E:\\DailyNotes//sk1.jpg");
  
	 FileHandler.copy(Sk, SS);
	
}
}
