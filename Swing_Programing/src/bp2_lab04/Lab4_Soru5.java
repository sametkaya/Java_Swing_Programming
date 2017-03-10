/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab04;

import java.util.ArrayList;

/**
 *
 * @author samet
 */

public class Lab4_Soru5 {

        
        public static void main(String[] args) {
            ArrayList<Personel> liste = new ArrayList();
            Personel p1= new Personel();
            p1.Adi="Halime";
            p1.Tarih="10.10.2010";
            liste.add(p1);
            Personel p2= new Personel();
            p2.Adi="Selim";
            p2.Tarih="10.10.2005";
            liste.add(p2);
            
            Listele(liste,2012 );
            
            
        }
        
        public static void Listele(ArrayList<Personel> liste,int gtarih)
        {
        
            for (Personel person : liste) {
                String tarih= person.Tarih.substring(person.Tarih.lastIndexOf(".")+1);
                int inttarih= Integer.parseInt(tarih);
                if (inttarih>gtarih) {
                    System.out.println(person.Adi+" " + person.Tarih);
                     
                }
            }
        }
}
