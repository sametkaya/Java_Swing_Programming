/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examworking;

/**
 *
 * @author samet
 */
public class Soru1_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cumle= "Fatih 123 Sultan2 Mehmet3 vakıf4 Üniversitesi5";
        String kesilen=cumle.substring(cumle.indexOf("a"), cumle.lastIndexOf("a"));
        System.out.println(kesilen);
        int count=0;
        for (int i = 0; i < kesilen.length(); i++) {
            if(kesilen.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("boşluk sayısı= "+count);
    }
    
}
