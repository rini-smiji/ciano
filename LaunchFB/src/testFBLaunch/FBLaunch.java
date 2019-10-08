package testFBLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLaunch {
	
	public static void main(String[] args) {
		
		String gpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", gpath + "/lib/chromedriver/chromedriver.exe");
		
				
		
		WebDriver wbdrvr = new ChromeDriver();
		wbdrvr.get("https://www.facebook.com");
	}
	
	
	
	
	
	

}
