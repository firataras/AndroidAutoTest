package LoginPage;

import java.util.List;

import AppUtil.Enumarations;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HataliSifre {

	public static boolean check (AndroidDriver<MobileElement> driver){
		System.setProperty("file.encoding", "ISO-8859-1");
		boolean local_flag = false; 
		List<MobileElement> local_array= SpesificMobilElement.getLayouts(driver, Enumarations.HataliSifreAciklamaTextView);
		for(int i=0; i<local_array.size();i++)
		{	if ( local_array.get(i).getText().equals(Enumarations.HataliSifreAciklamaTextView.getText()))
				{	local_flag = true;
					System.out.println("Login olmaya calisirken alinan hata su sekildedir:"); 
					System.setProperty("file.encoding", "UTF-8");
					System.out.println(Enumarations.HataliSifreAciklamaTextView.getText()); 
					System.out.println("Login denemesi basarisiz olmustur.");
				}
		}
		return local_flag;
	}
	
	public static void  click_Tamam(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.HataliSifreTamamButonu);
	}
	public static void  click_Yardim(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.HataliSifreYardimButonu);
	}

}


