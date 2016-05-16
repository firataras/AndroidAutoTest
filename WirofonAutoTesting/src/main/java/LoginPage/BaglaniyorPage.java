package LoginPage;
import java.util.List;

import AppUtil.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaglaniyorPage {

	public static  boolean checkUsernameInProgressbarPage(AndroidDriver<MobileElement> driver,Enumarations enumaration, String username){
		
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
				List<MobileElement> local_layouts = SpesificMobilElement.getLayouts(driver, Enumarations.BaglaniyorProgressBar);
				if (local_layouts.size() != 0) {
					result = local_layouts.get(0).isDisplayed();
				} else {
					result = false;
				}
			} while (result);
			System.out.println("Progress bar donusu tamamlandi.Login success/fail kontrolu yapilacak..");
		}

	


		
}
	
