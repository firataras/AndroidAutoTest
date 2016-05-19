package KisilerAnaSayfa;

import AppUtil.Enumarations;
import AppUtil.SpesificMobilElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class checkAllButton {
	


	public static void clickKisiEklemeArtiSembol(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByIndex(driver, Enumarations.KisilerAnaSayfaArtýSembolKiþiEkleme);
		System.out.println("Kisiler Ana Sayfa Artý Sembolune basýldý.");
		}
	
	public static void clickKisiArmaSearchSembol(AndroidDriver<MobileElement> driver) {
		SpesificMobilElement.clickByIndex(driver, Enumarations.KisilerAnaSayfaSearchSembolKiþiArama);
		System.out.println("Kisiler Ana Sayfa Search Sembolune basýldý.");
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
	
}
