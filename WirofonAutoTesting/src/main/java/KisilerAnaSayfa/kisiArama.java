package KisilerAnaSayfa;

import java.util.List;

import AppUtil.Enumarations;
import AppUtil.KisiBilgisi;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class kisiArama {
	
	public static void arama(AndroidDriver<MobileElement> driver){
		checkAllButton.clickKisiArmaSearchSembol(driver);
		SpesificMobilElement.sendKeysByText(driver, Enumarations.KisiAramaIsimGirisKutucugu, KisiBilgisi.Contact1.getName());

		System.out.println("Kisi Arama Testi icin "+KisiBilgisi.Contact1.getName()+" kisisi yazýldý.");

	}
}
