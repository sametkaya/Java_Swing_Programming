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
public class Kare {
    
    public int kenar;
    private String Renk;
//    public Kare()
//    {
//        this.kenar=5;
//        this.Renk= "Sarı";
//    }
//     public Kare(int k, String r)
//    {
//        this.kenar=k;
//        this.Renk= r;
//    }
    
    
    public int Alan_Hesap()
    {
       int value= this.kenar*this.kenar;
        return value;
    }
    
    public Kare Topla(Kare k)
    {
        Kare yenikare= new Kare();
        yenikare.kenar=this.kenar+k.kenar;
        return yenikare;
    }
    
    public void Ciz()
    {
        System.out.println(this.Alan_Hesap()+" Alanında "+this.Renk+" renginde kare çizdim");
    }
    
    public void Renk_Degis(String r)
    {
        this.Renk=r;
    }
    
    public static void main(String[] args) {
        Kare k1= new Kare();
        //k1.kenar=5;
        int sonuc=k1.Alan_Hesap();
        k1.Ciz();
        System.out.println("Kenarı "+k1.kenar+" Olan Karenin alanı= "+sonuc);
//        Kare k2= new Kare();
//        k2.kenar=10;
//        System.out.println("Kenarı "+k2.kenar+" Olan Karenin alanı= "+k2.Alan_Hesap());
//        
//        Kare k3=k1.Topla(k2);
//           System.out.println("Kenarı "+k3.kenar+" Olan Karenin alanı= "+k3.Alan_Hesap());
        
    }
    
}
