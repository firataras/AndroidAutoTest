package AppUtil;

public enum KisiBilgisi {

		Contact1(0, "Emirhan", "Uzaktas", "08502380033",null),
		EndOfEnumarations(9999, null, "android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null);
		
		private int index;
		private String name;
		private String surname;
		private String number;
		private String address;

		private KisiBilgisi(int index, String name,String surname,String number, String address) {
			
			System.setProperty("file.encoding", "ISO-8859-1");
			this.index = index;
			this.name = name;
			this.surname = surname;
			this.number = number;
			this.address = address;
		}
		public int getIndex() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return index;
		}
		public String getName() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return name;
		}
		public String getSurname() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return surname;
		}
		public String getNumber() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return number;
		}
		public String getAddress() {
			System.setProperty("file.encoding", "ISO-8859-1");
			return address;
		}

}

		
