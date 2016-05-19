package com.argela.test;

import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import WelcomePage.FirstWelcomePage;
import AppUtil.*;


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

	//@Test(priority = 3, groups = "Test")
	public void GirisYapButtonTest() {
		LoginPage.GirisYapButonu.test(driver);
	}
	
	//@Test(priority = 4, groups = "Test")
	public void HesapOlusturButtonTest() {
		LoginPage.HesapOlusturButonu.test(driver);
	}

	//@Test(priority = 5, groups = "Test")
	public void LogInwithWrongPassword() {
	
		username= "firat";
		password= "1234";
		LoginPage.GirisYapButonu.click(driver);
		LoginPage.GirisYapEkrani.login(driver, username, password);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, enumaration.BaglaniyorKullaniciAdiTextView  , username);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.PopupNotification.check(driver);

	}

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
	//@Test(priority = 7, groups = "Test")
	public void KisilerAnaSayfaArtiButonTest() {
		KisilerAnaSayfa.checkAllButton.clickKisiEklemeArtiSembol(driver);
		driver.navigate().back();
		KisilerAnaSayfa.checkAllButton.clickKisiArmaSearchSembol(driver);
		driver.navigate().back();
		KisilerAnaSayfa.checkAllButton.clickMesajlarAnaSayfa(driver);
		KisilerAnaSayfa.checkAllButton.clickCagrilarAnaSayfa(driver);
		KisilerAnaSayfa.checkAllButton.clickTusTakimiAnaSayfa(driver);
		KisilerAnaSayfa.checkAllButton.clickDahaFazlaAnaSayfa(driver);
		KisilerAnaSayfa.checkAllButton.clickKisilerAnaSayfa(driver);
		KisilerAnaSayfa.kisiEkleme.ekleme(driver, KisiBilgisi.Contact1);
	}
	
	@Test(priority = 8, groups = "Test")
	public void KisiAramaTest() {
		KisilerAnaSayfa.kisiArama.arama(driver);
		
		
	}
	
	
	
}


