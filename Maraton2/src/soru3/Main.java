package soru3;

public class Main {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();

		Aslan aslan1 = new Aslan("Simba", 150, 200);
		Yilan yilan1 = new Yilan("Terminatör",15,200);
		Kertenkele kertenkele1= new Kertenkele("Kermit",75,25);
		
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan1);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan1);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo",120,140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko",45,50));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra",35,200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit",2,35));
		
		
		
		hayvanatBahcesi.hayvanSesCikarsin(aslan1);
		hayvanatBahcesi.hayvanSesCikarsin(yilan1);
		hayvanatBahcesi.hayvanSesCikarsin(kertenkele1);
	
		System.out.println("\n-+-+-+-+-+");
	
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Tiger");
		
		
		System.out.println("\n---------");
		
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		
		System.out.println("\n * * * * *");

		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("Tomy");
		
		
	}

}
