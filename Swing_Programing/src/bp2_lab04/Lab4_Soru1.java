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
public class Lab4_Soru1 {

    public static void main(String[] args) {
        String cumle = "Fatih SUltan Mehmet Vakif Üniversitesi ";

//         for (int i = 0; i < cumle.length(); i++) {
//             if (cumle.charAt(i)!=' ') {
//                 System.out.print(cumle.charAt(i));
//             }
//             else
//             {
//                 System.out.println("");
//             }
//             
//         }
//            String Kelime="";
//        for (int i = 0; i < cumle.length(); i++) {
//          
//            if (cumle.charAt(i) != ' ') {
//                Kelime=Kelime.concat(cumle.charAt(i)+"");
//            } else {
//                System.out.println(Kelime);
//                Kelime="";
//            }
//
//        }
//        System.out.println(Kelime);
        while (cumle.contains(" ")) {
            String kelime = cumle.substring(0, cumle.indexOf(" "));
            System.out.println(kelime);
            cumle = cumle.substring(cumle.indexOf(" ") + 1);
            //System.out.println(cumle);
        }
        //System.out.println(cumle);

    }
}
