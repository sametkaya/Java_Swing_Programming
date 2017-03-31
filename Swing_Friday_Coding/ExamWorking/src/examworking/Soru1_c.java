/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examworking;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samet
 */
public class Soru1_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cumle= "Fatih 123 Sultan2 Mehmet3 vakıf4 Üniversitesi5 ";
        Random rnd = new Random();
        String rasgele="";
        for (int i = 0; i < 3; i++) {
              int c1=rnd.nextInt(cumle.length());
              rasgele+=cumle.charAt(c1);
        }
        //System.out.println(rasgele);
     
        String desen = "[0-9]{3}";
        Pattern pattern=Pattern.compile(desen);
        Matcher m = pattern.matcher(rasgele);
        while(m.find())
        {
            System.out.println(m.group());
            
        }
        
    }
    
}
