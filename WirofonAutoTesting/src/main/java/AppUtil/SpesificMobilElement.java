package AppUtil;

import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class SpesificMobilElement {

	public static void clickByIndex(AndroidDriver<MobileElement> driver,Enumarations enumaration) {
		driver.findElementsByClassName(enumaration.getClas	()).get(enumaration.getIndex()).click();
	
	}
	public static void clickByText(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		driver.findElementByName(enumaration.getText()).click();

	}
	public static void continousclickByText(AndroidDriver<MobileElement> driver, String value) {
		driver.findElementByName(value).tap(1, 4000);

	}
	
	public static void clickRelativeLayoutByIndex(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		
		List<MobileElement> localmobile_elementlist = getLayouts(driver,enumaration);
		int j=0;
		for(int i=0; i < localmobile_elementlist.size(); i++){
			if(localmobile_elementlist.get(i).getAttribute("clickable").equals("true")){
				 if(j == enumaration.getIndex()){
					 localmobile_elementlist.get(i).click();
					 i=localmobile_elementlist.size();
				 }
				 else {
					 if(j<i){
						 j++;
					 }
					
				 } 
			}
		}
	}
	
	public static List<MobileElement> getLayouts(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementsByClassName(enumaration.getClas());
	}
	
	public static void sendKeys(AndroidDriver<MobileElement> driver, Enumarations enumaration, String value){
		driver.findElementsByClassName(enumaration.getClas()).get(enumaration.getIndex()).sendKeys(value);
	}
	public static void sendKeysbyClass(AndroidDriver<MobileElement> driver, Enumarations enumaration, String value){
		driver.findElementByClassName(enumaration.getClas()).sendKeys(value);
	}
	
	public static void sendKeysByText(AndroidDriver<MobileElement> driver, Enumarations enumaration, String value){
		List<MobileElement> localmobile_elementlist= driver.findElementsByClassName(enumaration.getClas());
		for(int i=0; i < localmobile_elementlist.size(); i++){
			if(localmobile_elementlist.get(i).getAttribute("text").equals(enumaration.getText())){		
				localmobile_elementlist.get(i).sendKeys(value);
			}
		}
	}
	
		
	public static void clickByContentDesc(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		List<MobileElement> LocalMobileElementList = getLayouts (driver,enumaration);
		for (int i=0; i< LocalMobileElementList.size(); i++)
		{	String local_content_desc =  LocalMobileElementList.get(i).getAttribute("name");
			
			if(local_content_desc.equals(enumaration.getContent_desc()))
			{	
				LocalMobileElementList.get(i).click();
			}
		}
	
	}	
	

	public static int size(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementsByClassName(enumaration.getClas()).size();
	}

	public static String  returnText(AndroidDriver<MobileElement> driver, Enumarations enumaration) {
		return driver.findElementByClassName(enumaration.getClas()).getText();
	}

	
}
