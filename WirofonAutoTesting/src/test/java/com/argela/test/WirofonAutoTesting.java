package com.argela.test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import AppUtil.AppUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import ContactsPage.*;
import MessagePage.ButtonSelection;
import WelcomePage.FirstWelcomePage;
import WirofonEnumarationList.Enumarations;
import AppUtil.SpesificMobilElement;





public class WirofonAutoTesting {

	private static AndroidDriver<MobileElement> driver;
	private static Enumarations enumaration;
	private static String lusername= "firat";
	private static String lpassword = "1234";

	@Test(priority = 1, groups = "Test")
	public void getDriver() {
		driver = AppUtil.sharedInstance().getDriver();
	}

	@Test(priority = 2, groups = "Test")
	public void WarningPage() {
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

	@Test(priority = 4, groups = "Test")
	public void LogIn() {
		LoginPage.GirisYapEkrani.login(driver, lusername, lpassword);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, enumaration.BaglaniyorKullaniciAdiTextView  , lusername);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.BaglaniyorPage.checkLoginStatus(driver, lusername, lpassword);

	}



}


