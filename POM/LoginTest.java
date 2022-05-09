package POM;

public class LoginTest {

	public  void logewdcred() {
		
		webdriver driver= brows.browesr("https://kite.zerodha.com/");
		Zerodhalogin  zlog= new Zerodhalogin(driver);
		zerodhalogin.enterUserName(exceldatafetch.gettestdata(0,1,"Credential"));
		Zerodhalogin.password(exceldatafetch.gettestdata(1,1,"Credential"));
		Zerodhalogin.clickonsubmit();
		
	}
	
	public static void main(String[] args) {
		
		logewdcred obj= new logewdcred();
		obj.logewdcred();
		
	}
	
}
