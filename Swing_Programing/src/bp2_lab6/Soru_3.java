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
public class Soru_3 {

    public static void main(String[] args) {
        String metin = "Fat4ih2 Sul7t8an3";

        Random rnd = new Random();
        char [] str= new char[3];
        int say = 0;
        int tahminsayisi=0;
        while (say<3) {
            int chindex = rnd.nextInt(metin.length());
            char ch = metin.charAt(chindex);
            System.out.println(""+ch);
            if (Character.isLetter(ch)) {
                str[say]=ch;
                say++;
            }else
            {
                say=0;
            }
            tahminsayisi++;
            
        }
        System.out.println(tahminsayisi+". Defada Buldu "+ new String(str));
        

        /*
        int tur = 0;
        int say = 0;
        while (say < 3) {

            int chindex = rnd.nextInt(metin.length());

            Character ch = metin.charAt(chindex);
            if (Character.isLetter(ch)) {
                say++;
            } else {
                say = 0;
            }
            tur++;
        }
        System.out.println(tur+". turda budu");*/
    }
}
