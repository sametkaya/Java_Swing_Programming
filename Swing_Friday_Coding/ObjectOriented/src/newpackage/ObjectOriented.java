/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import objectoriented.*;

/**
 *
 * @author samet
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kopek k1= new Kopek();
        System.out.println(""+k1.AyakSayisi);
        k1.SesCikar();
        System.out.println(""+k1.Tur);
        
        Tavuk t1 = new Tavuk();
        t1.SesCikar();
        
        Insan i1= new Insan("melike");
        i1.SesCikar("konuşuyorum");
        System.out.println(""+i1.Tur);
        System.out.println(""+i1.Ad);
        i1.yas=5;
        
    }
    
}
