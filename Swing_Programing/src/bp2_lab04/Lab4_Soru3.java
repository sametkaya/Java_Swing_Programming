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
public class Lab4_Soru3 {

    public static void main(String[] args) {
        String cumle = "Fatih SUltan Mehmet Vakif Üniversitesi";
//        char [] karakterler = new char[cumle.length()];
//        for (int i = 0; i < cumle.length(); i++) {
//            karakterler[i]=cumle.charAt(i);
//        }
//        
//          for (char c : karakterler) {
//            System.out.println(c);
//        }
//        
        char[] karakterler = cumle.toCharArray();
        for (char c : karakterler) {
            System.out.println(c);
        }

    }
}
