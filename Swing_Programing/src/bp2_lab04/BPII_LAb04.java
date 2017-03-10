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
public class BPII_LAb04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="Fatih SUltan Mehmet Vakif Üniversitesi";
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)==' ') 
//                System.out.println("");
//            else
//                System.out.print(s.charAt(i));
//        }

//        String kelime1 = s.substring(0, s.indexOf(" "));
//        System.out.println(kelime1);
//        String kelime2 = s.substring(s.indexOf(" ")+1,s.lastIndexOf(" "));
//        System.out.println(kelime2);

         while (s.contains(" ")) {            
             String kelime1 = s.substring(0, s.indexOf(" "));
             System.out.println(kelime1);
             s= s.substring(s.indexOf(" ")+1);
             //System.out.println(s);
        }
         System.out.println(s);
         
         
        
    }
    
}
