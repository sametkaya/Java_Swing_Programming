package Ders_1;
import java.util.Scanner;

public class TestOgrenci {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
        Ogrenci ogrenci = new Ogrenci(12345, "Gülþen", "Doðan", 50, 60, 80);
        
        double not = ogrenci.notHesapla();
        
       String harfNotu =  ogrenci.harfNotuHesapla(not);
        
        
        System.out.println("Ad:" + ogrenci.ad + "\nSoyad: " + ogrenci.soyad +
        		"\nOgrenciNo: " + ogrenci.ogrenciNo + "\nVizeNotu: " + ogrenci.vizeNotu 
        		+ "\nProjeNotu: " + ogrenci.projeNotu + "\nFinalNotu: " + ogrenci.finalNotu
        		+"\n HarfNotu:" + harfNotu);

        System.out.println("------------------------");
        System.out.println("Ogrencinin adýný giriniz:");
        String ad = input.nextLine();
        
        System.out.println("Ogrencinin soyadýný giriniz:");
        String soyad = input.nextLine();
        
        System.out.println("Ogrencinin numarasýný giriniz:");
       int ogrNo = input.nextInt();
       
       
       
       System.out.println("Ogrencinin vize giriniz:");
       int vize = input.nextInt();
       
       System.out.println("Ogrencinin proje notunu giriniz:");
       int proje = input.nextInt();
       
       System.out.println("Ogrencinin final notunu giriniz:");
       int finalNot = input.nextInt();
       
        Ogrenci ogrenci2 = new Ogrenci(ogrNo, ad, soyad, vize, proje, finalNot);
        
        not = ogrenci.notHesapla();
        
         harfNotu =  ogrenci.harfNotuHesapla(not);
         
         
         System.out.println("Ad:" + ogrenci2.ad + "\nSoyad: " + ogrenci2.soyad +
         		"\nOgrenciNo: " + ogrenci2.ogrenciNo + "\nVizeNotu: " + ogrenci2.vizeNotu 
         		+ "\nProjeNotu: " + ogrenci2.projeNotu + "\nFinalNotu: " + ogrenci2.finalNotu
         		+"\n HarfNotu:" + harfNotu);

        
        
	}
	
	   

}




