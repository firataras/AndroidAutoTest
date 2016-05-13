package MessagePage;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ButtonSelection {

	public static void selection(AndroidDriver<MobileElement> driver, String caption) {
		MobileElement button = (MobileElement) driver.findElement(By.name(caption));
		button.click();

	}

}
