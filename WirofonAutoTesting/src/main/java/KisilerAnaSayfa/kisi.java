package KisilerAnaSayfa;

import java.util.List;

import AppUtil.Enumarations;
import AppUtil.KisiBilgisi;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;



public class kisi{
	
	public static void arama(AndroidDriver<MobileElement> driver, KisiBilgisi kisi){
		checkAllButton.clickKisiArmaSearchSembol(driver);
		SpesificMobilElement.sendKeysbyClass(driver,Enumarations.KisiAramaIsimGirisKutucugu,kisi.getName());
		System.out.println(KisiBilgisi.Contact1.getName() +  "  ismi araniyor.");
	}
	public static void ekleme(AndroidDriver<MobileElement> driver,KisiBilgisi contact){
		checkAllButton.clickKisiEklemeArtiSembol(driver);
		SpesificMobilElement.sendKeysByText(driver, Enumarations.KisiEklemeIsimGirisKutucugu, contact.getName());
		SpesificMobilElement.sendKeysByText(driver, Enumarations.KisiEklemeNumaraGirisKutucugu, contact.getNumber());
		SpesificMobilElement.clickByText(driver, Enumarations.KisiEklemeEkraniBitirDoneButonu);
		System.out.println("Kisi Ekleme Testi icin "+contact.getName()+" kisisi"+contact.getNumber()+" numarasi ile eklendi.");
	}
	public static void silme(AndroidDriver<MobileElement> driver,KisiBilgisi contact){
		
	}
	public static void sesliAra(AndroidDriver<MobileElement> driver,KisiBilgisi contact){
	
	}
	public static void goruntuluAra(AndroidDriver<MobileElement> driver,KisiBilgisi contact){
		
	}
	
	
}