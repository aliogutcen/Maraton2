package soru3;

public class Kertenkele extends Surungen{

	public Kertenkele(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(false);
	}

	@Override
	public void surun() {
		System.out.println(getAd()+" isimli kertenkele sürünerek gidiyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" garip sesler çıkarıyor");
		
	}
	
	

}
