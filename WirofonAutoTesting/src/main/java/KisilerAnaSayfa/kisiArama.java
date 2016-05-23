package KisilerAnaSayfa;

import java.util.List;

import AppUtil.Enumarations;
import AppUtil.KisiBilgisi;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;



public class kisiArama {
	
	public static void arama(AndroidDriver<MobileElement> driver, KisiBilgisi kisi){
		checkAllButton.clickKisiArmaSearchSembol(driver);
		SpesificMobilElement.sendKeysbyClass(driver,Enumarations.KisiAramaIsimGirisKutucugu,kisi.getName());
		System.out.println(KisiBilgisi.Contact1.getName() +  "  ismi araniyor.");
	}
}