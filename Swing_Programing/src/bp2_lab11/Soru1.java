/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author samet
 */
public class Soru1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter output = new PrintWriter(new FileWriter("dosya.txt",false));

        output.println(2);
        output.println(5);
        output.println(8);

        output.close();

        BufferedReader input = new BufferedReader(new FileReader("dosya.txt"));
        // BufferedWriter o = new BufferedWriter(new FileWriter("dosya.txt"));
         
//        FileOutputStream x= new FileOutputStream(new File("dosya.txt"));
  
        String line;
        
        int [] sayilar= new int[3];
        int sayac=0;
        while ((line = input.readLine()) != null) {
            sayilar[sayac]=Integer.parseInt(line);
            sayac++;
        }
        
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+= sayilar[i];
        }
        
        System.out.println(""+toplam);
       

    }
}
