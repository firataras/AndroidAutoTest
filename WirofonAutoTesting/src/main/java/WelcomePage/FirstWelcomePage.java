package WelcomePage;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import AppUtil.*;


public class FirstWelcomePage{

	public static void checkAllButons(AndroidDriver<MobileElement> driver) {
		MobileElement mobileElement = (MobileElement) driver.findElement(By.name(Enumarations.WarnningMessage.getText()));
		if (mobileElement.isDisplayed()) {
			SpesificMobilElement.clickByText(driver, Enumarations.YesButtonOnWarnningMessage);
		}
	}

}



