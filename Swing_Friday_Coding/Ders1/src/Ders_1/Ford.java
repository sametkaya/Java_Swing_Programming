package Ders_1;

public class Ford extends Araba{
	
	private int beygirGucu;
	
	public Ford (String marka, String model,String renk, int hiz, int beygirGucu){
		
		super(marka, model, renk, hiz);
		this.beygirGucu = beygirGucu;
	}
	
	public int getFiyat(){
		 
		//int fiyat = super.getFiyat();
		int fiyat = super.fiyat;
		if (beygirGucu >= 120 || beygirGucu <= 150){
			fiyat = (int)(fiyat - fiyat * 0.20);
			setFiyat(fiyat);
		}
		return fiyat;
	}
	public String getRenk(){
		
		String renk = super.getRenk();
		
		if ( renk.equals("Beyaz")){ 
			
			renk = "Kýrmýzý";
			
		setRenk(renk);}
	
	    return renk;
	}

	public int getBeygirGucu() {
		return beygirGucu;
	}

	public void setBeygirGucu(int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}

}
