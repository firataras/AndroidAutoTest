package KisilerAnaSayfa;

import AppUtil.Enumarations;
import AppUtil.KisiBilgisi;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class kisiEkleme {
	public static void ekleme(AndroidDriver<MobileElement> driver,KisiBilgisi contact){
		checkAllButton.clickKisiEklemeArtiSembol(driver);
	
		SpesificMobilElement.sendKeysByText(driver, Enumarations.KisiEklemeIsimGirisKutucugu, contact.getName());
		SpesificMobilElement.sendKeysByText(driver, Enumarations.KisiEklemeNumaraGirisKutucugu, contact.getNumber());
		SpesificMobilElement.clickByText(driver, Enumarations.KisiEklemeEkraniBitirDoneButonu);
		System.out.println("Kisi Ekleme Testi icin "+contact.getName()+" kisisi"+contact.getNumber()+" numarasý ile eklendi.");
	}

}
