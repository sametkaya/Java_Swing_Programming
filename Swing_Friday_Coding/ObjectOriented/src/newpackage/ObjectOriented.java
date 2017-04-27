/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;
import objectoriented.*;

/**
 *
 * @author samet
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Kopek k1= new Kopek();
//        System.out.println(""+k1.AyakSayisi);
//        k1.SesCikar();
//        System.out.println(""+k1.Tur);
//        
//        Tavuk t1 = new Tavuk();
//        t1.SesCikar();
//        
//        Insan i1= new Insan("melike","TR4423432");
//        i1.SesCikar("konuşuyorum");
//        System.out.println(""+i1.Tur);
//        System.out.println(""+i1.Ad);
//        //i1.setKimlikno("TR235456");
        try {
            Scanner keyb = new Scanner(System.in);

            System.out.println("1. Sayı: ");
            int say1 = keyb.nextInt();
            System.out.println("2. Sayı: ");
            int say2 = keyb.nextInt();
            int sonuc = say1 / say2;
            System.out.println("" + sonuc);
            throw new ArrayIndexOutOfBoundsException();

        }
        catch (ArithmeticException ex) {
            System.out.println("Hiç bir sayı 0 a bölünmez");
        }
        catch(InputMismatchException Ex)
        {
        System.out.println("Yanlış bir giriş yaptınız");
        }
        catch (Exception ex)
        {
            System.out.println("Beklenmedik bir hata oluştu");
        }

    }

}
