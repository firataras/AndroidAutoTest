package LoginPage;

import AppUtil.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HesapOlusturButonu {
	
	public static void test(AndroidDriver<MobileElement> driver) {
		System.out.println("Hesap Olustur Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.HesapOlusturButton);
		System.out.println("Hesap Olustur Butonuna Basildi");
		driver.navigate().back();
		System.out.println("Bir onceki sayfaya geri donuldu");
	}

	public static void click(AndroidDriver<MobileElement> driver) {
		System.out.println("Hesap Olustur Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.HesapOlusturButton);
		System.out.println("Hesap Olustur Butonuna Basildi");
	}

}
