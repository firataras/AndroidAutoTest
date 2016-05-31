

package com.argela.test;

import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import WelcomePage.FirstWelcomePage;
import AppUtil.*;
import KisilerAnaSayfa.*;


public class WirofonAutoTesting {

	private static AndroidDriver<MobileElement> driver;
	private static Enumarations enumaration;
	private static String username="";
	private static String password="";

	@Test(priority = 1, groups = "Test")
	public void getDriver() {
		driver = AppUtil.sharedInstance().getDriver();
	}

	@Test(priority = 2, groups = "Test")
	public void WarningPage() {
		FirstWelcomePage.checkAllButons(driver);
	}

	/*@Test(priority = 3, groups = "Test")
	public void GirisYapButtonTest() {
		LoginPage.GirisYapButonu.test(driver);
	}
	
	@Test(priority = 4, groups = "Test")
	public void HesapOlusturButtonTest() {
		LoginPage.HesapOlusturButonu.test(driver);
	}

	@Test(priority = 5, groups = "Test")
	public void LogInwithWrongPassword() {
	
		username= "firat";
		password= "1234";
		LoginPage.GirisYapButonu.click(driver);
		LoginPage.GirisYapEkrani.login(driver, username, password);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, enumaration.BaglaniyorKullaniciAdiTextView  , username);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.PopupNotification.check(driver);

	}*/

	@Test(priority = 6, groups = "Test")
	public void LogInwithCorrectPassword() {
	
		username= "canmor";
		password = "Ar234567";
		LoginPage.GirisYapButonu.click(driver);
		LoginPage.GirisYapEkrani.login(driver, username, password);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, enumaration.BaglaniyorKullaniciAdiTextView  , username);
		LoginPage.BaglaniyorPage.waiting(driver);
		//LoginPage.PopupNotification.check(driver);
		
	}
	/*@Test(priority = 7, groups = "Test")
	public void KisilerAnaSayfaButonTestleri() {
		buttons.clickKisiEklemeArtiSembol(driver);
		driver.navigate().back();
	}		
	
	@Test(priority = 8, groups = "Test")
	public void KisilerAnaSayfaKisiEklemeButonTest() {
		buttons.clickKisiEklemeArtiSembol(driver);
		driver.navigate().back();
	}
	
	@Test(priority = 9, groups = "Test")
	public void KisilerAnaSayfaKisiAramaButonTest() {
	buttons.clickKisiAramaSearchSembol(driver);
		driver.navigate().back();
	}

	@Test(priority = 10, groups = "Test")
	public void MesajlarAnaSayfaButonTest() {
		buttons.clickMesajlarAnaSayfa(driver);
	}
	
	@Test(priority = 11, groups = "Test")
	public void CagrilarAnaSayfaButonTest() {
		buttons.clickCagrilarAnaSayfa(driver);
	}

	@Test(priority = 12, groups = "Test")
	public void TusTakimiAnaSayfaButonTest() {
		buttons.clickTusTakimiAnaSayfa(driver);
	}
	@Test(priority = 13, groups = "Test")
	public void DahaFazlaButonTest() {
		buttons.clickDahaFazlaAnaSayfa(driver);
	}
	
	@Test(priority = 14, groups = "Test")
	public void KisilerAnaSayfaButonTest() {
		buttons.clickKisilerAnaSayfa(driver);
	}

	*/
	
	@Test(priority = 15, groups = "Test")
	public void KisiEklemeTest() {
		KisilerAnaSayfa.kisi.ekleme(driver, KisiBilgisi.Contact1);
	}

	
	@Test(priority = 16, groups = "Test")
	public void KisiAramaWirofonTest() {
		buttons.clickKisilerWirofon(driver);
		KisilerAnaSayfa.kisi.arama(driver, KisiBilgisi.Contact1);
	}
	
	@Test(priority = 17, groups = "Test")
	public void KisiAramaTumu() {
		buttons.clickKisilerTumu(driver);
		KisilerAnaSayfa.kisi.arama(driver, KisiBilgisi.Contact1);
		buttons.clickKisilerAramaCarpiButonu(driver);

	}
	@Test(priority = 18, groups = "Test")
	public void KisiSilmeTest() {
		buttons.clickKisilerWirofon(driver);
		KisilerAnaSayfa.kisi.doubleclick(driver, KisiBilgisi.Contact1);
		KisilerAnaSayfa.popup.clickSil(driver);
		KisilerAnaSayfa.popup.clickWirofonPopUpTamam(driver);
		
	}
	
	
	
}


