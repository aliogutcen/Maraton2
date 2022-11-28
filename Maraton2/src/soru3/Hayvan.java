package soru3;

import java.util.Objects;

public abstract class Hayvan {

	private String ad;
	private int kilo;
	private int uzunluk;
	protected boolean tehlikeliMi;
	

	//Hayvan const.
	public Hayvan(String ad, int kilo, int uzunluk) {
		
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		
	}

	//Getter-Setter
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getKilo() {
		return kilo;
	}


	public void setKilo(int kilo) {
		this.kilo = kilo;
	}


	public int getUzunluk() {
		return uzunluk;
	}


	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}


	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}


	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}


	//to-String
	
	
	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi + "]";
	}
	
	
	
	
	
	//Methodlar
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ad);
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hayvan other = (Hayvan) obj;
		return Objects.equals(ad, other.ad);
	}
	
	
	

	public abstract void sesCikar() ;
	
	
	
	
	
	
	
	
	
	
	
	
}
