/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examworking;

/**
 *
 * @author samet
 */
public class Personel {
    public static int staticNo=0;
    public int No;
    public String Adi;
    public String Soyadi;
    public String Birim;
    public int Maas;
    public Personel(String a, String s, String b, int m) 
    {
        staticNo++;
        this.No=staticNo;
        this.Adi=a;
        this.Soyadi=s;
        this.Birim=b;
        this.Maas=m;
    }
    
}
