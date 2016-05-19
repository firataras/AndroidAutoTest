package LoginPage;

import java.util.List;

import AppUtil.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HesapOlusturButonu {
	
	public static void test(AndroidDriver<MobileElement> driver) {
		System.out.println("Hesap Olustur Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.HesapOlusturButton);
		System.out.println("Hesap Olustur Butonuna Basildi");
		boolean result = control(driver);
		
		if(result == true) {
			System.out.println("Hesap oluþtur butonuna basildiktan sonra , program dogru sayfaya gidiyor.");
		} 
		else{
			System.out.println("Hesap oluþtur butonuna basildiktan sonra , program yanlýþ sayfaya gidiyor.");
		}  
			
		driver.navigate().back();
		System.out.println("Bir onceki sayfaya geri donuldu");
	}

	public static void click(AndroidDriver<MobileElement> driver) {
		System.out.println("Hesap Olustur Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.HesapOlusturButton);
		System.out.println("Hesap Olustur Butonuna Basildi");
	}
	
	public static boolean control(AndroidDriver<MobileElement> driver){
		boolean result = false;
		
		List<MobileElement> mobile_element_array = SpesificMobilElement.getLayouts(driver, Enumarations.HesapOlusturTextView );
		//System.out.println(mobile_element_array.size());
		for (int i=0; i<mobile_element_array.size(); i++ )
		{
			//System.out.println("%%%%%%%*******    "+mobile_element_array.get(i).getText()+"    %%%%%%%*******");
			if (mobile_element_array.get(i).getText().equals(Enumarations.HesapOlusturTextView.getText()))
			{
				result = true;
			}
		
		}
		

		
		
		//System.out.println("controlden cýkýldý");
		
		return result;
		
	}

}
