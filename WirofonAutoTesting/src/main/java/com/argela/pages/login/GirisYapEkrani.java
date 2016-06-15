package com.argela.pages.login;



import com.argela.enumarations.Enumarations;
import com.argela.functions.SpesificMobilElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GirisYapEkrani {
	
	public static void login(AndroidDriver<MobileElement> driver, String Username, String Password) {


		SpesificMobilElement.sendKeys(driver, Enumarations.GirisYapKullaniciAdinizEditText, Username);
		System.out.println("Kullanici adi olarak " + Username + " girildi.");

		SpesificMobilElement.sendKeys(driver, Enumarations.GirisYapSifrenizEditText, Password);
		System.out.println("Sifre  olarak " + Password + " girildi.");		
		
		SpesificMobilElement.clickByContentDesc(driver, Enumarations.GirisYapOKIcon);
		System.out.println("Giris Yapmak icin butona tiklandi.");		
		
	}

}
