/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab3;

import java.util.ArrayList;

/**
 *
 * @author samet
 */
public class Hasta {
    // hastaları bir statik listede sınıf ismi üzerinden erişilebilir yapıyoruz
    public static ArrayList<Hasta> Hastalar= new ArrayList<Hasta>();
    //nesne özellikleri
    public String Id;
    public String Adi;
    public String Soyadi;
    public String Doktor;
}
