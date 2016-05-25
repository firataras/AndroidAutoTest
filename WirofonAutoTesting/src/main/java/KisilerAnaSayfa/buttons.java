package KisilerAnaSayfa;

import AppUtil.Enumarations;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class buttons {
	


	public static void clickKisiEklemeArtiSembol(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByIndex(driver, Enumarations.KisilerAnaSayfaArtiSembolKisiEkleme);
		System.out.println("Kisiler Ana Sayfa Arti Sembolune basildi.");
		}
	

	
	public static void clickKisiAramaSearchSembol(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByIndex(driver, Enumarations.KisilerAnaSayfaSearchSembolKisiArama);
		System.out.println("Kisiler Ana Sayfa Search Sembolune basildi.");
		}
	public static void clickKisilerAramaCarpiButonu(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByIndex(driver, Enumarations.KisiAramaCarpiButonu);
		System.out.println("Kisiler Ana Sayfa Carpi Sembolune basildi.");
		}
	
	
	
	public static void clickMesajlarAnaSayfa(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickRelativeLayoutByIndex(driver, Enumarations.KisilerAnaSayfaMesajlarRelativeLayout);
		System.out.println("Mesajlar Ana Sayfasina Gecildi.");
		}

	public static void clickCagrilarAnaSayfa(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickRelativeLayoutByIndex(driver, Enumarations.KisilerAnaSayfaCagrilarRelativeLayout);
		System.out.println("Cagrilar Ana Sayfasina Gecildi.");
		}
	
	public static void clickTusTakimiAnaSayfa(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickRelativeLayoutByIndex(driver, Enumarations.KisilerAnaSayfaTustakimiRelativeLayout);
		System.out.println("Tus Takimi Sayfasina Gecildi.");
		}
	
	public static void clickDahaFazlaAnaSayfa(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickRelativeLayoutByIndex(driver, Enumarations.KisilerAnaSayfaDahafazlaRelativeLayout);
		System.out.println("Daha Fazla Ana Sayfasina Gecildi.");
		}
	public static void clickKisilerAnaSayfa(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickRelativeLayoutByIndex(driver, Enumarations.KisilerAnaSayfaKisilerRelativeLayout);
		System.out.println("Kisiler Ana Sayfasina Gecildi.");
		}
	public static void clickKisilerWirofon(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByText(driver, Enumarations.KisilerAnaSayfaWirofon);
		System.out.println("Wirofon kontaklari sayfasina gecildi.");
		}
	public static void clickKisilerTumu(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByText(driver, Enumarations.KisilerAnaSayfaTumu);
		System.out.println("Tum kontaklar ana sayfasina gecildi.");
		}

	
}
