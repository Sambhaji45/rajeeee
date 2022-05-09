package Practisesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sk23034 

{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		 r.get("https://vctcpune.com/");
		 WebElement email = r.findElement(By.xpath("//a[@class=\"et_pb_button et_pb_button_0 et_pb_bg_layout_light\"]"));
		 email.click();
		//r.get("https://vctcpune.com/selenium/practice.html#serviceid");
		 //Thread.sleep(3000);
		 
	 WebElement button = r.findElement(By.xpath("//input[@id='hide-textbox']"));
		//email.sendKeys("Sahil");
		button.click();
		//System.out.println(email.isSelected());
		//System.out.println(email.isDisplayed());
		//System.out.println(email.isEnabled());
		 
		 
	   
	}
}
