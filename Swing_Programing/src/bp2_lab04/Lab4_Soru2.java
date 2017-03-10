/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab04;

/**
 *
 * @author samet
 */
public class Lab4_Soru2 {

    public static void main(String[] args) {

        String[] Kelimeler = {"Fatih", "Sultan", "Mehmet", "Vakıf", "Üniversitesi"};
        String Cumle = "";
//        for (String kelime : Kelimeler) {
//            Cumle+=kelime+" ";
//        }
//        System.out.println(Cumle);
//        for (String kelime : Kelimeler) {
//            Cumle = Cumle.concat(kelime + " ");
//        }
//         System.out.println(Cumle);
        for (int i = 0; i < Kelimeler.length; i++) {
            Cumle = Cumle.concat(Kelimeler[i] + " ");
        }
        System.out.println(Cumle);
    }
}
