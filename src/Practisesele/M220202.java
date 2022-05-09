package Practisesele;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class M220202 {
	public static void main(String[] args) {
		WebDriver s = M2202PM.Openbrowser("https://www.facebook.com/");
	    WebElement button = s.findElement((By.tagName("button")));
	    button.click();
	}

}
