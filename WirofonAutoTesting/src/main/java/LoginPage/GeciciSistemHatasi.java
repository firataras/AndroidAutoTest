package LoginPage;

import java.util.List;

import AppUtil.SpesificMobilElement;
import WirofonEnumarationList.Enumarations;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GeciciSistemHatasi {
	
	public static boolean check (AndroidDriver<MobileElement> driver){
		System.setProperty("file.encoding", "ISO-8859-1");
		boolean local_flag = false; 
		List<MobileElement> local_array= SpesificMobilElement.getLayouts(driver, Enumarations.GeciciSistemHatasiTekrarDeneyinTextView);
		for(int i=0; i<local_array.size();i++)
		{	if ( local_array.get(i).getText().equals(Enumarations.GeciciSistemHatasiTekrarDeneyinTextView.getText()))
				{	local_flag = true;
					System.out.println("Login olmaya calisirken alinan hata su sekildedir:"); 
					System.setProperty("file.encoding", "UTF-8");
					System.out.println(Enumarations.GeciciSistemHatasiTekrarDeneyinTextView.getText()); 
					System.out.println("Login denemesi basarisiz olmustur.");
				}
		}
		return local_flag;
	}
}

