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
import io.appium.*;


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
		System.out.println("---------------Getting Test Folders and Mobile App Version-----------------");
		AndroidDriver<MobileElement> driver;
		UsersEnumaration usersEnumaration = null;
		TestingApp testingapp = null;
		String testingfolder = null;
		String mobileappname= null ;
		System.out.println("Test edilecek mobile application ile ilgili bilgiler ..... ");
		String computer_username= System.getProperty("user.name");
		System.out.println("Test kosulan bilgisayarin kullanici adi = " + computer_username);
		testingfolder=usersEnumaration.valueOf(computer_username).getFilepath();
		System.out.println("Yukun alindigi folder = " + testingfolder);
		mobileappname=testingapp.targetapplication.getVersion();
		System.out.println("Test edilecek version= "+ mobileappname);
		File app = new File (testingfolder+mobileappname);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                                                             ");

		System.out.println("---------------Setting Appium Capabilities-----------------");
		AppiumCapabilities appcap = null;
		
		//Hangi capability istenirse onun indexini buraya yazmak lazim
		int local_capability_index =0;  
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("browserName",appcap.values()[local_capability_index].getBrowserName());
		System.out.println("Appium dc browserName :" + appcap.values()[local_capability_index].getBrowserName());
		
		dc.setCapability("platformName", appcap.values()[local_capability_index].getPlatformName());
		System.out.println("Appium dc platformName :" + appcap.values()[local_capability_index].getPlatformName());

		dc.setCapability("platformVersion",appcap.values()[local_capability_index].getPlatformVersion());
		System.out.println("Appium dc platformVersion :" + appcap.values()[local_capability_index].getPlatformVersion());

		dc.setCapability("deviceName",appcap.values()[local_capability_index].getDeviceName());
		System.out.println("Appium dc deviceName :" + appcap.values()[local_capability_index].getDeviceName());

		dc.setCapability("fullReset", appcap.values()[local_capability_index].getFullReset());
		System.out.println("Appium dc fullReset :" + appcap.values()[local_capability_index].getFullReset());
		
		dc.setCapability("app-Package", appcap.values()[local_capability_index].getAppPackage());
		System.out.println("Appium dc app-Package :"+appcap.values()[local_capability_index].getAppPackage());
		
		dc.setCapability("unicodeKeyboard", appcap.values()[local_capability_index].getUnicodeKeyboard());
		System.out.println("Appium dc app-Package :"+appcap.values()[local_capability_index].getUnicodeKeyboard());

		dc.setCapability("app", app.getAbsolutePath());
		System.out.println("Absolute path of the testing mobile app is  :" + app.getAbsolutePath());
		

		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                                                             ");

		return driver;
	}
	/**
	 * Initial Screen Test
	 * @param driver
	 * @throws InterruptedException
	 */

}
