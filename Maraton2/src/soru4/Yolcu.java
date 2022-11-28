package soru4;

import java.util.Random;

public abstract class Yolcu {
	static Random r= new Random();
	private int id;
	private String adSoyad;
	private int koltukNo;
	private boolean checkin;
	private final int BASEFIYAT=100;
	private FirmaAdi firmaAdi;





	public Yolcu(int id, String adSoyad,boolean checkin) {
		super();
		this.id = id;
		this.adSoyad = adSoyad;
		this.koltukNo = r.nextInt(0,100);
		this.checkin = checkin;
		
	}


	
	

	public FirmaAdi getFirmaAdi() {
		return firmaAdi;
	}





	public void setFirmaAdi(FirmaAdi firmaAdi) {
		this.firmaAdi = firmaAdi;
	}





	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAdSoyad() {
		return adSoyad;
	}



	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}



	public int getKoltukNo() {
		return koltukNo;
	}



	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}



	



	public boolean isCheckin() {
		return checkin;
	}



	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}



	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	
	
	
	
	public abstract void yolcuBilgileriniGetir();
	
	public abstract void biletAl(FirmaAdi firmaAdi);
	
	public abstract void  checkInYap();
	
	public abstract void ucagaBin();
	
	
}
