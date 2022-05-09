package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhalogin {

	@FindBy(xpath="//input[@id='userid']") private WebElement UserName;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submiy']") private WebElement submit;
	
	public void ZerodhaLoginpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String user)
	{
		UserName.sendKeys(user);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
    public void clickonSubmit()
    {
	submit.click();
    }
}
	}
}
