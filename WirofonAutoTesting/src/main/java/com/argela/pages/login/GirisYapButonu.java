package com.argela.pages.login;

import java.util.List;

import com.argela.enumarations.Enumarations;
import com.argela.functions.SpesificMobilElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GirisYapButonu {
	
	public static boolean test(AndroidDriver<MobileElement> driver) {
		System.out.println("Giris Butonuna Basiliyor");
		SpesificMobilElement.clickByIndex(driver, Enumarations.GirisYapButton);
		
		boolean result = control(driver);
		
		if(result == true) {
			System.out.println("Giris Butonuna basildiktan sonra , program dogru sayfaya gidiyor.");
		} 
		else{
			System.out.println("Giris Butonuna basildiktan sonra , program yanl?? sayfaya gidiyor.");
		}  
			
		
		System.out.println("Giris Butonuna Basildi");
		driver.navigate().back();
		System.out.println("Bir onceki sayfaya geri donuldu");
		return result;
	}

	public static void click(AndroidDriver<MobileElement> driver) {
		System.out.println("Giris Butonuna Basiliyor");
		SpesificMobilElement.clickByIndex(driver, Enumarations.GirisYapButton);
		System.out.println("Giris Butonuna Basildi");

	}
	
	public static boolean control(AndroidDriver<MobileElement> driver){
		boolean result = false;
		List<MobileElement> mobile_element_array = SpesificMobilElement.getLayouts(driver, Enumarations.GirisYapTextView );
		for (int i=0; i<mobile_element_array.size(); i++ )
		{
			if (mobile_element_array.get(i).getText().equals(Enumarations.GirisYapTextView.getText()))
			{
				result = true;
			}
		
		}
		
		

		
		return result;
		
	}
	
	
	
}
