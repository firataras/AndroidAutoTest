package AppUtil;

public enum TestingApp {
	
	targetapplication("Wirofon", "Wirofon-Client-2.0.0-rc05.apk"),

	EndOfTestingApp("", "");
	
	private String name;
	private String version;

	private TestingApp(String name,String version) {
		this.name = name;
		this.version = version;
		
	}
	public String getName() {
		System.setProperty("file.encoding", "ISO-8859-1");
		return name;
	}
	public String getVersion() {
		System.setProperty("file.encoding", "ISO-8859-1");
		return version;
	}

}
