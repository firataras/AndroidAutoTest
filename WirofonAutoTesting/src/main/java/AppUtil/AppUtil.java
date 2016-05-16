package AppUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AppUtil {
	 
	private static AppUtil appUtil;
	private AndroidDriver<MobileElement> driver; 
	private AppUtil() throws MalformedURLException{
	   driver = setUp();
	}
	public static AppUtil sharedInstance(){
		 if (appUtil == null){
			 try {
				appUtil = new AppUtil();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 return appUtil;
	 } 
	
	 public AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	private  AndroidDriver<MobileElement> setUp() throws MalformedURLException{
		AndroidDriver<MobileElement> driver;
		//File app = new File("/Users/ismailfirataras/Documents/ARGELA_PROJECT/TestAutomation/Chi-Gap-Client-0.3.0-rc38.apk");
		//File app = new File("/Users/ismailfirataras/Documents/ARGELA_PROJECT/TestAutomation/Wirofon-Client-2.0.0-rc04.apk");
		File app = new File("C:\\Users\\gurkanca\\Documents\\workspace\\Wirofon_Apk\\Wirofon-Client-2.0.0-rc04.apk");
		DesiredCapabilities dc = new DesiredCapabilities();
		System.out.println("---------------Setting Capabilities-----------------");
		dc.setCapability("browserName","");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("deviceName","CustomPhone4.2.2_API17");
		dc.setCapability("fullReset", false);
		dc.setCapability("app-Package", " tr.com.argela.client.android.phone.wirofon");
		System.out.println("APK path:"+app.getAbsolutePath());
		dc.setCapability("app", app.getAbsolutePath());
		//dc.setCapability("app-Activity", "com.EasyEstate.Activity.MainActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	/**
	 * Initial Screen Test
	 * @param driver
	 * @throws InterruptedException
	 */

}
