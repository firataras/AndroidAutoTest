package WirofonEnumarationList;

public enum GirisYapPage {
	
	//GirisYap Sayfasi 
	GirisYapTextView(2, "Giriş Yap","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapExitIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","exit"),
	GirisYapOKIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","ok"),
	GirisYapKullaniciAdinizEditText(0, "Kullanıcı Adınız","android.widget.EditText", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapSifrenizEditText(1, null,"android.widget.EditText", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapSifremiUnuttumTextView(0, "Şifremi unuttum","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapHesapOlusturmakIstiyorumTextView(1, "Hesap oluşturmak istiyorum","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	
	//Baglaniyor Sayfasi
	BaglaniyorProgressBar(0, null,"android.widget.ProgressBar", "tr.com.argela.client.android.phone.wirofon",null),
	BaglaniyorKullaniciAdiTextView(1,"username","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	BaglaniyorIcon(2, "Bağlanıyor...","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	
	//Gecici Sistem Hatasi 
	GeciciSistemHatasiWirofonIcon(0, "Wirofon","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GeciciSistemHatasiTekrarDeneyinTextView(0, "Geçici sistem hatası. Sonra tekrar deneyin","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GeciciSistemHatasiTamam(0, "Tamam","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	GeciciSistemHatasiYardim(1, "Yardım","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	
	//Kullanici Bloke, Hatali Sifre Girilmesi  
	HataliSifreWirofonIcon(0, "Wirofon","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	HataliSifreAciklamaTextView(0, "3 defa arka arkaya yanlış şifre girdiğiniz için hesabınız 15 dakika boyunca bloke edilmiştir. 15 dakika sonra tekrar deneyiniz ya da şifrenizi www.wirofon.com üzerinden güncelleyiniz","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	HataliSifreTamamButonu(0, "Tamam","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	HataliSifreYardimButonu(1, "Yardım","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null);			
			
			private int index;
			private String text;
			private String clas;
			private String paket;
			private String content_desc;

			private GirisYapPage(int index, String text,String clas,String paket, String content_desc) {
				
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



