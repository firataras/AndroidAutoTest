package com.argela.apputil;

public enum AppiumCapabilities {
	
	Capability1(0,"","Android","4.2.2","CustomPhone4.2.2_API17",false,true,"tr.com.argela.client.android.phone.wirofon"),
	Capability2(1,"","Android","4.3","CustomPhone4.3_API_18",false,true,"tr.com.argela.client.android.phone.wirofon"),
	EndOfCapabilities(999999,null,null,null,null,false,true,null);
	
	

	private int index;
	private String browserName;
	private String platformName;
	private String platformVersion;
	private String deviceName;
	private boolean fullReset;
	private boolean unicodeKeyboard;
	private String appPackage;

	private AppiumCapabilities(int index,String browserName,String platformName,String platformVersion, String deviceName , boolean fullReset, boolean unicodeKeyboard, String appPackage) {

		this.index = index;
		this.browserName = browserName;
		this.platformName = platformName;
		this.platformVersion = platformVersion;
		this.deviceName = deviceName;
		this.fullReset = fullReset;
		this.unicodeKeyboard = unicodeKeyboard;
		this.appPackage = appPackage;
		
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getBrowserName() {
		return browserName;
	}
	public String getPlatformName() {
		return platformName;
	}
	public String getPlatformVersion() {
		return platformVersion;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public boolean getFullReset() {
		return fullReset;
	}
	public boolean getUnicodeKeyboard() {
		return unicodeKeyboard;
	}
	public String getAppPackage() {
		return appPackage;
	}

	

}
