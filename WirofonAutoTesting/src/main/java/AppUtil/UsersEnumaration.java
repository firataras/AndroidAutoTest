package AppUtil;

public enum UsersEnumaration {
	ismailfirataras("ismailfirataras", "/Users/ismailfirataras/Documents/ARGELA_PROJECT/TestAutomation/"),
	gurkanca("gurkanca", "C:\\Users\\gurkanca\\Documents\\workspace\\Wirofon_Apk\\"),
	tulayuy("tulayuy", "C:\\Users\\tulayuy\\Downloads\\"),
	emirhanuz("emirhanuz", "C:\\Users\\tulayuy\\Documents\\workspace\\Wirofon_Apk\\"),
	EndOfUsersEnumaration("", "");
	
	private String username;
	private String filepath;

	private UsersEnumaration(String username,String filepath) {
		this.username = username;
		this.filepath = filepath;
		
	}
	public String getUsername() {
		System.setProperty("file.encoding", "ISO-8859-1");
		return username;
	}
	public String getFilepath() {
		System.setProperty("file.encoding", "ISO-8859-1");
		return filepath;
	}
	
}
