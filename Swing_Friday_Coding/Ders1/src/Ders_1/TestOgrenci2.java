package Ders_1;


import java.util.Scanner;

public class TestOgrenci2 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
         Ogrenci ogrenci = new Ogrenci(12345, "Gülþen", "Doðan", 50, 60, 80);
        ekranaBas(ogrenci);
        
        Ogrenci ogrenci2 = new Ogrenci(7890, "Ayþegül", "Taþ", 70, 90, 89);
        ekranaBas(ogrenci2);
        
	}
	
	public   static void ekranaBas(Ogrenci ogrenci ){
		   
		   System.out.println("-------------------");
		   System.out.println("Ad:" + ogrenci.ad + "\nSoyad: " + ogrenci.soyad +
	        		"\nOgrenciNo: " + ogrenci.ogrenciNo + "\nVizeNotu: " + ogrenci.vizeNotu 
	        		+ "\nProjeNotu: " + ogrenci.projeNotu + "\nFinalNotu: " + ogrenci.finalNotu
	        		+"\n HarfNotu:" + ogrenci.harfNotuHesapla(ogrenci.notHesapla()));  
		   
	   }

}
