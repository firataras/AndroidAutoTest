package com.argela.pages.welcome;

import org.openqa.selenium.By;

import com.argela.enumarations.Enumarations;
import com.argela.functions.SpesificMobilElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class FirstWelcomePage{

	public static void checkAllButons(AndroidDriver<MobileElement> driver) {

		if(driver.findElementByClassName(Enumarations.WarnningMessage.getClas()).getText().equals(Enumarations.WarnningMessage.getText())){
			System.out.println("Warning Message is correct");
			driver.findElementByClassName(Enumarations.YesButtonOnWarnningMessage.getClas()).click();
		} else{
			driver.findElementByClassName(Enumarations.NoButtonOnWarnningMessage.getClas()).click();
			System.out.println("Warning Message is wrong");
		}
		
	
	}
}



