package soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static HashMap<Kisi, Long> rehberBakma = new HashMap<>();
    static Set<Kisi> kisiler = new HashSet<>();

    public static void main(String[] args) {

    	HashMap<Kisi, Long> rehberBakma = new HashMap<>();
    	
    	
        try (Scanner scan = new Scanner(new FileReader("rehber.txt"))) {
            while (scan.hasNextLine()) {
                String okunanSatir = scan.nextLine();
                System.out.println(okunanSatir);
                String[] arr = okunanSatir.split(";");
                Kisi kisi = new Kisi(arr[0], arr[1], Long.parseLong(arr[2].trim()));
                rehberBakma.put(kisi,3123334455L);
          
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı hatası...");
        }
        System.out.println(kisiler);

        
        search();
        
    }

    public static void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen telefonunu aradğınız kişinin adını giriniz:");
        String isim = scan.nextLine();

        System.out.println("Lütfen telefonunu aradğınız kişinin soyadını giriniz:");
        String soyad = scan.nextLine();

        String adSoyad = isim + " " + soyad;
        
        if(rehberBakma.containsKey(adSoyad)) {
        	System.out.println("3123334455");
        }
        else
        	System.out.println("Listede yok");
        
        
        }
    
    
    public static void ekle(HashMap<Kisi, Integer> m ) {
    	
    	
    	
        

    }

}