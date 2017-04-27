package Ders_1;

public class Araba {
	
	private String marka; // özellik
	private String model; // özellik / Attribute
	private String renk; 
	private int hiz;
	int fiyat;
	public Araba(String marka, String model,String renk, int hiz){
		
		this.marka = marka;
		this.model = model;
		 this.renk = renk;
		 this.hiz = hiz;
	}
	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}



	

}
