package soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Map<String,Long> kisilerListesi = new HashMap<>();
	public static void main(String[] args) {
		
		
		try(Scanner scan = new Scanner(new FileReader("rehber.txt"))){
			while(scan.hasNextLine()) {
				String okunanSatir = scan.nextLine();
				System.out.println(okunanSatir);
				String [] arr= okunanSatir.split(";");
				kisilerListesi.put(arr[0],Long.parseLong(arr[2].trim()));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı hatası ...");
		}
		System.out.println(kisilerListesi);
		
		search();
		
	}
	public static void search() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen telefonunu aradığınız kişinin adını giriniz:");
		String isim= scan.nextLine();
		
		System.out.println("Lütfen telefonunu aradığınız kişinin soyadını giriniz:");
		String soyad= scan.nextLine();
		
		String adSoyad = isim+" "+soyad;
		System.out.println(adSoyad);
		
		if(kisilerListesi.containsKey(adSoyad)) {
			System.out.println(adSoyad+"  isimli kişinin  telefon numarası=  "+kisilerListesi.get(adSoyad));
		} else {
			System.out.println("Böyle bir kişi listede yoktur..");
		}
		
		
		
	}
	
	
}