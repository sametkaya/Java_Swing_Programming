package Ders_1;

public class Ogrenci {
	
	int ogrenciNo;
	String ad;
	String soyad;
	int vizeNotu;
	int projeNotu;
	int finalNotu;
	
	
	public Ogrenci(int ogrenciNo,String ad,String soyad,int vizeNotu, int projeNotu,int finalNotu ){
		
		
		this.ogrenciNo = ogrenciNo;
		this.ad = ad;
		this.soyad = soyad;
		this.vizeNotu = vizeNotu;
		this.finalNotu = finalNotu;
		this.projeNotu = projeNotu;
		
	}
	
	
	
	public  double notHesapla(){
		
		
		return (vizeNotu *0.25 + projeNotu * 0.25 + finalNotu * 0.50);
		
	}
	
	
	
	public String harfNotuHesapla(double not){
		
		if( not >= 95)
			
		return "A";
		
		if (not >= 80)
			
			return "B";
		
		if (not >= 70)
			
			return "C";
		
		if (not >= 40)
			
			return "D";
		
		else return "F";
		
		
	}



	
	
	
	
	
	
	
	
	
	
	

}
