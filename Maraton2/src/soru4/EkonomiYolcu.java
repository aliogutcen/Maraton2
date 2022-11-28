package soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu{
	
	private final int EKONOMIFIYAT=100;
	private int sayac;
	private HashMap<String, Integer> biletlerEkonomi = new HashMap<>() ;
	private int toplam=0;

	public EkonomiYolcu(int id, String adSoyad,boolean checkin) {
		super(id, adSoyad,checkin);
		
	}
	
	
	
	

	public int getToplam() {
		return toplam;
	}





	public void setToplam(int toplam) {
		this.toplam = toplam;
	}





	public HashMap<String, Integer> getBiletlerEkonomi() {
		return biletlerEkonomi;
	}





	public void setBiletlerEkonomi(HashMap<String, Integer> biletlerEkonomi) {
		this.biletlerEkonomi = biletlerEkonomi;
	}





	public int getEKONOMIFIYAT() {
		return EKONOMIFIYAT;
	}





	public int getSayac() {
		return sayac;
	}





	public void setSayac(int sayac) {
		this.sayac = sayac;
	}





	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu bilgileri---> Ekonomi Yolcusu  " +getAdSoyad()+ " Biletleri= "+biletlerEkonomi);
		
	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		
			if(biletlerEkonomi.containsKey(firmaAdi.name())) {
				setToplam(getToplam()+getBASEFIYAT()+getEKONOMIFIYAT());
				biletlerEkonomi.replace(firmaAdi.name(), getToplam());
				System.out.println(getAdSoyad()+" isimli yolcu "+firmaAdi.name()+" için Ekonomi bilet almıştır."+biletlerEkonomi);
				
				
			}
			else
			{
				setToplam(getToplam()+getBASEFIYAT()+getEKONOMIFIYAT());
				biletlerEkonomi.put(firmaAdi.name(), getToplam() );
				System.out.println(getAdSoyad()+" isimli yolcu "+firmaAdi.name()+" için Ekonomi bilet almıştır."+biletlerEkonomi);
				
				
			}
		
		
	}

	@Override
	public void checkInYap() {
		if(isCheckin()==true) {
			System.out.println("Daha önceden Check-In işlemi yapılmış. İyi yolculuklar dileriz");
		}
		else {
			setCheckin(true);
			System.out.println("Check-In işleminiz yapılmıştır.");
		}
		
	}

	@Override
	public void ucagaBin() {
		
		if(getSayac()==0) {
		
		if(isCheckin()==true) {
			System.out.println(getAdSoyad()+" "+getKoltukNo()+" Numaralı koltukta uçağa binebilirsiniz..");
			setSayac(getSayac()+1);
	
		}else
			System.out.println("İlk önce check-in yaptırınız");
		
	}else
		System.out.println("Zaten uçaktasınız.");
	}
	
	




}
