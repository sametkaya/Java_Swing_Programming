/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samet
 */
public class Soru_1 {

    public static void main(String[] args) {
/*
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);
        sayilar.add(10);

        Random rnd = new Random();
        int tahminsayisi=0;
        while (!sayilar.isEmpty()) {
            int tahmin = rnd.nextInt(10) + 1;
            
            sayilar.remove((Object)tahmin);
            tahminsayisi++;

        }
        System.out.println(tahminsayisi+ " Kere Cekildi");*/
      
 
        boolean[] sayilar = new boolean[10];
        Random rnd = new Random();
        int kurasayisi = 0;
        int bulunan = 0;

        while (bulunan < 10) {
            int sayi = rnd.nextInt(10);
            if (!sayilar[sayi]) {
                sayilar[sayi] = true;
                bulunan++;
            }

            kurasayisi++;

        }

        System.out.println(kurasayisi + " Defada Bitti");
        
    }
}
