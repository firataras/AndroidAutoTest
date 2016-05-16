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
	public void WelcomePage() {
		FirstWelcomePage.checkAllButons(driver);
	}

	@Test(priority = 3, groups = "Test")
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
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, Enumarations.BaglaniyorKullaniciAdiTextView  , username);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.BaglaniyorPage.checkLoginStatus(driver, username, password);

	}

	@Test(priority = 6, groups = "Test")
	public void LogInwithCotrrectPassword() {
	
		username= "canmor";
		password = "Ar234567";
		LoginPage.GirisYapButonu.click(driver);
		LoginPage.GirisYapEkrani.login(driver, username, password);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, Enumarations.BaglaniyorKullaniciAdiTextView  , username);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.BaglaniyorPage.checkLoginStatus(driver, username, password);

	}

}


