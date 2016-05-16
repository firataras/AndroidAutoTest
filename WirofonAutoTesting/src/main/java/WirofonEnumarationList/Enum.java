package WirofonEnumarationList;

public enum Enum {
	
		First(1, "text", "class", "package","content"),
		Second(2, "text", "class", "package","content");
		
		
		private int index;
		private String text;
		private String clas;
		private String paket;
		private String content_desc;

		private Enum(int index, String text,String clas,String paket, String content_desc) {
			
			System.setProperty("file.encoding", "ISO-8859-1");
			this.index = index;
			this.text = text;
			this.clas = clas;
			this.paket = paket;
			this.content_desc = content_desc;
		}
		public int getIndex() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return index;
		}
		public String getText() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return text;
		}
		public String getClas() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return clas;
		}
		public String getPackage() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return paket;
		}
		public String getContent_desc() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return content_desc;
		}

}
