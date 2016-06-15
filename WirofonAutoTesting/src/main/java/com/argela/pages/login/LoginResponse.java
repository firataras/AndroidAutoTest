package com.argela.pages.login;

import java.util.List;

import com.argela.enumarations.Enumarations;
import com.argela.functions.SpesificMobilElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginResponse {

	
	 public static  String  check(AndroidDriver<MobileElement> driver){
		 System.setProperty("file.encoding", "ISO-8859-1");
		
		if(EnumarationTextOnPage(driver, Enumarations.GeciciSistemHatasiTekrarDeneyinTextView)){	
			SpesificMobilElement.clickByText(driver, Enumarations.GeciciSistemHatasiTamam);
			return Enumarations.GeciciSistemHatasiTekrarDeneyinTextView.getText();
		}
		else if (EnumarationTextOnPage(driver, Enumarations.HataliSifreAciklamaTextView)){	
			SpesificMobilElement.clickByText(driver, Enumarations.HataliSifreTamamButonu);
			return Enumarations.HataliSifreAciklamaTextView.getText();
		}
		else if (EnumarationTextOnPage(driver, Enumarations.GirisYapTextView)){	
			return Enumarations.GirisYapTextView.getText();
		}
		else{	
			System.out.println("Login basarilidir.GeciciSistemHatasi,HataliSifre veya NoResponsefromServer kontrolleri gecilmistir.  ");
			return "Sucess Login";
		}
	 }
	
	public static boolean EnumarationTextOnPage (AndroidDriver<MobileElement> driver, Enumarations enumaration){
		boolean local_flag = false; 
		List<MobileElement> local_array= SpesificMobilElement.getLayouts(driver, enumaration);
		for(int i=0; i<local_array.size();i++)
		{	if ( local_array.get(i).getText().equals(enumaration.getText()))
				{	local_flag = true;
					System.out.println("Login olmaya calisirken alinan hata su sekildedir:"); 
					System.out.println(enumaration.getText()); 
					System.out.println("Login denemesi basarisiz olmustur.");
				}
		}
		return local_flag;
	}
}
