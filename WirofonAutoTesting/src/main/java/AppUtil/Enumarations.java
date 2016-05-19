package AppUtil;


public enum Enumarations {

	//First Welcome Page Warning Page Enumarations
	WarnningMessage(0, "Kullanmakta olduğunuz cihazın yazılımı değiştirilmiştir. Bu durum cihazınızı, iletişim mahremiyetinize zarar verebilecek saldırılara açık hale getirmektedir. Devam etmek istiyor musunuz?", "android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null),
	YesButtonOnWarnningMessage(0, "Evet", "android.widget.Button","tr.com.argela.client.android.phone.wirofon",null),
	NoButtonOnWarnningMessage(1, "Hayır", "android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	
	//GirisYapButon ve Hesap Olustur Buton Sayfasi  
	GirisYapButton(0, "Giriş Yap","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturButton(0, "Hesap Oluştur", "android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null), 
	
	//GirisYap Sayfasi 
	GirisYapTextView(2, "Giriş Yap","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapExitIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","exit"),
	GirisYapOKIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","ok"),
	GirisYapKullaniciAdinizEditText(0, "Kullanıcı Adınız","android.widget.EditText", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapSifrenizEditText(1, null,"android.widget.EditText", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapSifremiUnuttumTextView(0, "Şifremi unuttum","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	GirisYapHesapOlusturmakIstiyorumTextView(1, "Hesap oluşturmak istiyorum","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	
	//Hesap Olustur Sayfasi 
	HesapOlusturBackIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","back"),
	HesapOlusturTikIcon(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","continue"),
	HesapOlusturTextView(2, "Hesap Oluştur","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturKullaniciTipi(0, "Kullanıcı Tipi","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturHatSahibiClickButton(0, "","android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturHatSahibiYakiniClickButton(0, "","android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturHatSahibiTextView(1, "Hat Sahibi","android.widget.TextVieww", "tr.com.argela.client.android.phone.wirofon",null),
	HesapOlusturHatSahibiYakiniTextView(1, "Hat Sahibi Yakını","android.widget.TextView", "tr.com.argela.client.android.phone.wirofon",null),
		
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
	HataliSifreYardimButonu(1, "Yardım","android.widget.Button", "tr.com.argela.client.android.phone.wirofon",null),
	
	//Login olduktan sonra gelen sayfanin üst mavi menüsünde bulunan Kişi ekleme artı sembol, Kişi arama search button, kişiler, mesajlar, çağrılar, tuş takımı ve daha fazla sembolerinin tanımlamaları
	KisilerAnaSayfaKisilerRelativeLayout(0, null,"android.widget.RelativeLayout", "tr.com.argela.client.android.phone.wirofon",null),
	KisilerAnaSayfaMesajlarRelativeLayout(1, null,"android.widget.RelativeLayout", "tr.com.argela.client.android.phone.wirofon",null),
	KisilerAnaSayfaCagrilarRelativeLayout(2, null,"android.widget.RelativeLayout", "tr.com.argela.client.android.phone.wirofon",null),
	KisilerAnaSayfaTustakimiRelativeLayout(3, null,"android.widget.RelativeLayout", "tr.com.argela.client.android.phone.wirofon",null),
	KisilerAnaSayfaDahafazlaRelativeLayout(4, null,"android.widget.RelativeLayout", "tr.com.argela.client.android.phone.wirofon",null),
	KisilerAnaSayfaArtiSembolKisiEkleme(0, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","add"),
	KisilerAnaSayfaSearchSembolKisiArama(1, null,"android.widget.ImageButton", "tr.com.argela.client.android.phone.wirofon","add"),
	
	//Kisi Ekleme Ekranı
	KisiEklemeEkraniBitirTiklemeButonu(0, "","android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null),
	KisiEklemeEkraniBitirDoneButonu(1, "Done","android.widget.TextView", "com.android.contacts",null),
	KisiEklemeEkraniMoreOptionsButonu(0, null,"android.widget.ImageButton", "com.android.contacts","More options"),
	KisiEklemeIsimGirisKutucugu(0, "Name","android.widget.EditText", "com.android.contacts",null),
	KisiEklemeNumaraGirisKutucugu(0, "Phone","android.widget.EditText", "com.android.contacts",null),
	
	//Kisi Arama Satırı
	KisiAramaIsimGirisKutucugu(1, "Arama","android.widget.EditText", "tr.com.argela.client.android.phone.wirofon",null),
	KisiAramaGeriButonu(0, null,"android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null),
	
	
	
	
	EndOfEnumarations(0, null, "android.widget.ImageView", "tr.com.argela.client.android.phone.wirofon",null);
	
	
	private int index;
	private String text;
	private String clas;
	private String paket;
	private String content_desc;

	private Enumarations(int index, String text,String clas,String paket, String content_desc) {
		
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
	

