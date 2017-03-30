/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab7;

import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author samet
 */
public class Soru_2 {

    public static void main(String[] args) {
        String[] dizi = {"1", "2", "10d", "5", "4", "rt"};
        for (String item : dizi) {
            try {
                
                  int sayi= Integer.parseInt(item);
                  System.out.println("Sayi: "+ item);
                  
            } catch (RuntimeException e) {
                System.out.println("Hata: " + item);
            }
          
            
            
        }

//        try {
//            int y = 1 / 1;
//
//        } catch (ArithmeticException e) {
//            System.out.println("Aritmetik Hata:" + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Format Hata:" + e.getMessage());
//        }
////
//        try {
//    
//            int x = Integer.parseInt("yt");
//        } catch (ArithmeticException e) {
//            System.out.println("Aritmetik Hata:" + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Format Hata:" + e.getMessage());
//        }
//        Scanner sc= new Scanner(System.in);
//        int s1= sc.nextInt();
//        int s2= sc.nextInt();
//        try {
//            if(s1>s2)
//            throw new HatasızKulOlmazException("s1>s2");
//            else if(s2>s1)
//            throw new ArithmeticException("s2>s1");
//                  
//        } catch (HatasızKulOlmazException e) {
//            System.out.println(e.getClass()+" Hata: "+ e.getMessage());
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getClass()+"Hata: "+ e.getMessage());
//        }
        

    }
}
