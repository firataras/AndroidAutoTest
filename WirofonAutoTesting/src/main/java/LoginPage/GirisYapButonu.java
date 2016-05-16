package LoginPage;

import AppUtil.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GirisYapButonu {
	
	public static void test(AndroidDriver<MobileElement> driver) {
		System.out.println("Giris Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.GirisYapButton);
		// Dogru yere mi gidiyor diye bir iki kontrol koymak lazim.
		System.out.println("Giris Butonuna Basildi");
		driver.navigate().back();
		System.out.println("Bir onceki sayfaya geri donuldu");

	}

	public static void click(AndroidDriver<MobileElement> driver) {
		System.out.println("Giris Butonuna Basiliyor");
		SpesificMobilElement.clickByText(driver, Enumarations.GirisYapButton);
		System.out.println("Giris Butonuna Basildi");

	}
	
}
