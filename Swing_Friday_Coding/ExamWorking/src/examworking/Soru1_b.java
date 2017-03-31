/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examworking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samet
 */
public class Soru1_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cumle= "Fatih 123 Sultan2 Mehmet3 vakıf4 Üniversitesi5 ";
        String desen = "\\s[0-9]*\\s";
        Pattern pattern=Pattern.compile(desen);
        Matcher m = pattern.matcher(cumle);
        while(m.find())
        {
            System.out.println(m.group());
        }
        
    }
    
}
