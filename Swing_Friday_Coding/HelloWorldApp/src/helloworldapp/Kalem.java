/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author samet
 */
public class Kalem {
    
    public String Marka;
    public String Renk;
    
    public void Yaz()
    {
        System.out.println(Marka+" Kalemle "+ Renk+" Yazıyorum");
    }
     public void Yaz(String yazi)
    {
        System.out.println(Marka+" Kalemle "+ Renk+" "+ yazi+" Yazıyorum");
    }
    
     
    
    
    public static void main(String[] args) {
        Kalem k1=new Kalem();
        k1.Marka="Faber";
        k1.Renk="Kırmızı";
        k1.Yaz();
        
        Kalem k2=new Kalem();
        k2.Marka="Aygolek";
        k2.Renk="Mavi";
        k2.Yaz();
        k2.Yaz("Fatih Sultan Mehmet");
        
        Kare k4= new Kare();
        k4.kenar=6;
        k4.Ciz();
        k4.Renk_Degis("Mavi");
        k4.Ciz();
    }
}
