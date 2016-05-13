package com.argela.test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import AppUtil.AppUtil;
import AppUtil.Enumarations;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import ContactsPage.*;
import MessagePage.ButtonSelection;
import WelcomePage.FirstWelcomePage;
import AppUtil.SpesificMobilElement;
import AppUtil.Enumarations;





public class WirofonAutoTesting {

	private static AndroidDriver<MobileElement> driver;
	private static Enumarations enumaration;

	@Test(priority = 1, groups = "Test")
	public void getDriver() {
		driver = AppUtil.sharedInstance().getDriver();
	}

	@Test(priority = 2, groups = "Test")
	public void WelcomePage() {
		FirstWelcomePage.checkAllButons(driver);
	}

	@Test(priority = 3, groups = "Test")
	public void LogIn() {
		String lusername = "firat";
		String lpassword = "1234";
		LoginPage.GirisYapButonu.test(driver);
		LoginPage.HesapOlusturButonu.test(driver);
		LoginPage.GirisYapButonu.click(driver);
		LoginPage.GirisYapEkrani.login(driver, lusername, lpassword);
		LoginPage.BaglaniyorPage.checkUsernameInProgressbarPage(driver, enumaration.BaglaniyorKullaniciAdiTextView  , lusername);
		LoginPage.BaglaniyorPage.waiting(driver);
		LoginPage.BaglaniyorPage.checkLoginStatus(driver, lusername, lpassword);
		
		

	}



}