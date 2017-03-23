/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab6;

import java.util.Random;

/**
 *
 * @author samet
 */
public class Soru_2 {

    public static void main(String[] args) {
        String metin = "Fatih2 Sultan3";

        Random rnd = new Random();
        int chindex = rnd.nextInt(metin.length());

        Character ch = metin.charAt(chindex);
        System.out.println("Secinlen= " + ch);

        /*
        if('0'<=ch && ch<= '9')
        {
            System.out.println("Rakamdır");
        }
        else
        {
            System.out.println("Rakam Değil");
        }*/
      
        
        if (Character.isDigit(ch)) {
            System.out.println("Rakamdır");
        } else {
            System.out.println("Rakam Değil");
        }

    }
}
