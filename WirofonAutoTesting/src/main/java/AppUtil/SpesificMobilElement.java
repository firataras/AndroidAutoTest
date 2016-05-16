package AppUtil;

import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SpesificMobilElement {

	public static void clickByIndex(AndroidDriver<MobileElement> driver,Enumarations enumaration) {
		driver.findElementsByClassName(enumaration.getClas	()).get(enumaration.getIndex()).click();
		System.out.println("This " + enumaration + " button and the " + enumaration.getClas().toString()
				+ " of class was found and " + enumaration.getIndex() + " id index was clicked.");
	}
	public static void clickByText(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		driver.findElementByName(enumaration.getText()).click();
		System.out.println("This " + enumaration + " button and the " + enumaration.getClas().toString()
				+ " of class was found and " + enumaration.getText() + "  was clicked.");
	}
	public static void sendKeys(AndroidDriver<MobileElement> driver, Enumarations enumaration, String value){
		driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).sendKeys(value);
		System.out.println("This " + enumaration + " text box  and the " + enumaration.getClas().toString()
				+ " of class was found and " + enumaration.getText() + " text was inserted.");
	}
	
	public static void print(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		System.setProperty("file.encoding", "ISO-8859-1");
		System.out.println(driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).toString()
				+ " || " + driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).getTagName()
				+ " || " + driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).getText()
				+ " || " + driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).getCoordinates()
				+ " || " + driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).getId());
	}
	
	public static void clickByContentDesc(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		List<MobileElement> LocalMobileElementList = getLayouts (driver,enumaration);
		for (int i=0; i< LocalMobileElementList.size(); i++)
		{	String local_content_desc =  LocalMobileElementList.get(i).getAttribute("name");
			
			System.out.println(local_content_desc);
			System.out.println(enumaration.getContent_desc());
			if(local_content_desc.equals(enumaration.getContent_desc()))
			{	
				System.out.println("Sisteme giris butonuna tiklayacagim.");
				LocalMobileElementList.get(i).click();
			}
		}
	
	}	
	public static List<MobileElement> getLayouts(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementsByClassName(enumaration.getClas());
	}	

	public static int size(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementsByClassName(enumaration.getClas()).size();
	}

	public static String  returnText(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementByClassName(enumaration.getClas()).getText();
	}

	
}
