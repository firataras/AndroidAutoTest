package com.argela.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.argela.enumarations.Enumarations;
import com.argela.functions.SpesificMobilElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GirisYapEkrani {
	
	public static void login(AndroidDriver<MobileElement> driver, String Username, String Password) {
		String username = Username;
		String password = Password;

		com.argela.functions.SpesificMobilElement.sendKeys(driver, Enumarations.GirisYapKullaniciAdinizEditText, username);
		System.out.println("Kullanici adi olarak " + username + " girildi.");

		SpesificMobilElement.sendKeys(driver, Enumarations.GirisYapSifrenizEditText, password);
		System.out.println("Sifre  olarak " + password + " girildi.");		
		
		SpesificMobilElement.clickByContentDesc(driver, Enumarations.GirisYapOKIcon);
		System.out.println("Giris Yapmak icin butona tiklandi.");		
		
	}

}
