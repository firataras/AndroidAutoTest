package LoginPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import AppUtil.*;

public class PopupNotification {
	public static  boolean check(AndroidDriver<MobileElement> driver){
		System.out.println("Login sonrasi durum degerlendiriliyor ... ");
		if(LoginPage.GeciciSistemHatasi.check(driver))
		{	LoginPage.GeciciSistemHatasi.click_Tamam(driver);
			return false;
		
		}
		else if (LoginPage.HataliSifre.check(driver))
		{	LoginPage.HataliSifre.click_Tamam(driver);
			return false;}
		else if (LoginPage.NoResponsefromServer.check(driver))
		{

			return false;}
		else 
		{System.out.println("Login basarilidir.GeciciSistemHatasi,HataliSifre veya NoResponsefromServer kontrolleri gecilmistir.  ");
		return true;}
	}

	
	
}
