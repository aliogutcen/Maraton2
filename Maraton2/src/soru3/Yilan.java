package soru3;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(true);
	}

	@Override
	public void surun() {
		System.out.println(getAd()+" isimli yılan sürünüyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " tıslama sesi çıkarıyor...");
		
	}

}
