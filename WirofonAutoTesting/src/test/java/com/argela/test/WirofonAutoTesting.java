package com.argela.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.argela.apputil.AppUtil;
import com.argela.enumarations.Enumarations;
import com.argela.enumarations.KisiBilgisi;
import com.argela.functions.SpesificMobilElement;
import com.argela.pages.welcome.FirstWelcomePage;
import com.argela.pages.kisiler.buttons;
import com.argela.pages.kisiler.kisi;
import com.argela.pages.kisiler.popup;
import com.argela.pages.login.BaglaniyorPage;
import com.argela.pages.login.GirisYapButonu;
import com.argela.pages.login.GirisYapEkrani;
import com.argela.pages.login.LoginResponse;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class WirofonAutoTesting {

	private static AndroidDriver<MobileElement> driver;


	@BeforeClass(alwaysRun=true)
	public void getDriver() {
		driver = AppUtil.sharedInstance().getDriver();
	}

	@Test(groups = {"p1", "Warning Page Tests"})
	public void WarningPage() {
		FirstWelcomePage.checkAllButons(driver);
		SpesificMobilElement.clickByIndex(driver, Enumarations.CloseIconHosgeldinizEkrani);
		GirisYapButonu.click(driver);

	}


	@Test(groups = {"p1", "Login Test with wrong password"}, dependsOnMethods="WarningPage")
	public void LogInwithWrongPassword() {
		GirisYapEkrani.login(driver, "firat", "1234");
		BaglaniyorPage.checkUsernameInProgressbarPage(driver, Enumarations.BaglaniyorKullaniciAdiTextView  , "firat");
		BaglaniyorPage.waiting(driver);
		LoginResponse.check(driver);
		try {
			driver.wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(groups = {"p1", "Login Test with correct password"}, dependsOnMethods="LogInwithWrongPassword")
	public void LogInwithCorrectPassword() {
	
		GirisYapEkrani.login(driver, "canmor", "Ar234567");
		BaglaniyorPage.checkUsernameInProgressbarPage(driver, Enumarations.BaglaniyorKullaniciAdiTextView  , "canmor");
		BaglaniyorPage.waiting(driver);
		LoginResponse.check(driver);
		try {
			driver.wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(groups = {"p1", "Wirofon Pages Check "}, dependsOnMethods="LogInwithCorrectPassword")
	public void WirofonPageChecks() {
		buttons.clickKisiEklemeArtiSembol(driver);
		driver.navigate().back();
		buttons.clickKisiEklemeArtiSembol(driver);
		driver.navigate().back();
		buttons.clickKisiAramaSearchSembol(driver);
		driver.navigate().back();
		buttons.clickMesajlarAnaSayfa(driver);
		buttons.clickCagrilarAnaSayfa(driver);
		buttons.clickTusTakimiAnaSayfa(driver);
		buttons.clickDahaFazlaAnaSayfa(driver);
		buttons.clickKisilerAnaSayfa(driver);
	}
	
	@Test(groups = {"p1", "Wirofon Add Subscriber "}, dependsOnMethods="LogInwithCorrectPassword")
	public void WirofonAddSubscriber() {
		kisi.ekleme(driver, KisiBilgisi.Contact1);
	}
	
	

	
	@Test(priority = 16, groups = "Test")
	public void KisiAramaWirofonTest() {
		buttons.clickKisilerWirofon(driver);
		kisi.arama(driver, KisiBilgisi.Contact1);
	}
	
	@Test(priority = 17, groups = "Test")
	public void KisiAramaTumu() {
		buttons.clickKisilerTumu(driver);
		kisi.arama(driver, KisiBilgisi.Contact1);
		buttons.clickKisilerAramaCarpiButonu(driver);

	}
	@Test(priority = 18, groups = "Test")
	public void KisiSilmeTest() {
		buttons.clickKisilerWirofon(driver);
		kisi.doubleclick(driver, KisiBilgisi.Contact1);
		popup.clickSil(driver);
		popup.clickWirofonPopUpTamam(driver);
		
	}
	
	@AfterClass(alwaysRun=true)
	public void teardown(){
		driver.quit();
	}

	
}


