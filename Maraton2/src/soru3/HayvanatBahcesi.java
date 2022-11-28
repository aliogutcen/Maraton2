package soru3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HayvanatBahcesi {

	private Aslan aslan;
	private Yilan yilan;
	private Maymun maymun;
	private Kertenkele kertenkele;
	private MemeliHayvan m;
	private Surungen s;
	private Hayvan h;

	public static List<Hayvan> hayvanlar = new ArrayList<>();
	public static List<Surungen> surungen = new ArrayList<>();
	public static List<MemeliHayvan> memeli = new ArrayList<>();
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd() == m.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}
		hayvanlar.add(m);
		memeli.add(m);
		

	}

	public void bahceyeSurungenEkle(Surungen s) {

		
		
		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd() == s.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}
		hayvanlar.add(s);
		surungen.add(s);
		

	}

	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String isim) {

//				for(int j=0; j<surungen.size(); j++) {
//					if(surungen.get(j).getAd().equalsIgnoreCase(isim)) {
//						System.out.println(isim+" bir Memeli Hayvan");
//						
//					}
//					else
//					{
//						
//					}
//				}
//			
//				
//				
//				
//				for(int k=0; k<memeli.size(); k++) {
//					if(memeli.get(k).getAd().equalsIgnoreCase(isim)) {
//						System.out.println(isim+" bir Sürüngen");
//						
//					}
//		
//					}


		
		for(int i =0 ; i<hayvanlar.size(); i++) {
			if(hayvanlar.get(i).getAd().equalsIgnoreCase(isim)) {
				 for(int j=0; j<surungen.size(); j++) {
					 if(surungen.get(j).getAd().equalsIgnoreCase(isim)) {
						 System.out.println(isim+" Sürüngendir");
						 return;
					 } 
				 }
				 for(int k=0; k<memeli.size(); k++) {
					 if(memeli.get(k).getAd().equalsIgnoreCase(isim)) {
						 System.out.println(isim+"  Memelidir");
						 return;
					 }
				 }
				
			}
			
			
		
		}
				
			System.out.println(isim+" isimli hayvan bu Hayvanat Bahçesinde yok.");	

	
	}
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		
		
		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				System.out.println(hayvanlar.get(i).toString());
				return;
			}
		}
		System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");

	}

	public void hayvaniHareketEttir(String hayvanAdi) {

		for(int i =0 ; i<surungen.size();i++) {
			if(surungen.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				surungen.get(i).surun();
			}
		}
		
		for(int i=0; i<memeli.size(); i++) {
			if(memeli.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				memeli.get(i).yuru();
			}
		}
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
