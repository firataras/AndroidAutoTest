package LoginPage;
import java.util.List;

import AppUtil.SpesificMobilElement;
import WirofonEnumarationList.GirisYapPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaglaniyorPage {

	public static  boolean checkUsernameInProgressbarPage(AndroidDriver<MobileElement> driver,GirisYapPage enumaration, String username){
		
		System.out.println("Progress Bar'da donen username =" + SpesificMobilElement.returnText(driver, enumaration) );
		System.out.println("Olmasi gereken username ise " + username );
		
		if(SpesificMobilElement.returnText(driver, enumaration).equals(username)){
			System.out.println("Karsilastirma basarili, checkUsernameInProgressbarPage success");
			return true;
		}else{
			System.out.println("Karsilastirma basarisiz, checkUsernameInProgressbarPage success");
			return false;
		}
	} 
	
	public static void waiting(AndroidDriver<MobileElement> driver) {
			boolean result;
			do {
				System.out.print(".");
				List<MobileElement> local_layouts = SpesificMobilElement.getLayouts(driver, GirisYapPage.BaglaniyorProgressBar);
				if (local_layouts.size() != 0) {
					result = local_layouts.get(0).isDisplayed();
				} else {
					result = false;
				}
			} while (result);
			System.out.println("Progress bar donusu tamamlandi.Login success/fail kontrolu yapilacak..");
		}

	public static  boolean checkLoginStatus(AndroidDriver<MobileElement> driver,String Username, String Password){

		System.out.println("Login sonrasi durum degerlendiriliyor ... ");
		if(LoginPage.GeciciSistemHatasi.check(driver))
		{	
			return false;
		}
		
		else if (LoginPage.HataliSifre.check(driver))
		{
			return false;
		}
		else if (LoginPage.NoResponsefromServer.check(driver))
		{
			return false;
		}
		
		else 
		{
			System.out.println("Login basarilidir. Kullanici adi= "+Username+"Sifre ="+Password+"˛ekilnde girilerek login olunmu˛tur.");
			return true;
		}

	} 
	
		
}
	
