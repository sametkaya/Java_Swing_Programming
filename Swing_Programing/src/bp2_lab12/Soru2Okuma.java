/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samet
 */
public class Soru2Okuma {
    public static void main(String[] args) throws IOException {
        try {
            ObjectInputStream oOS=new ObjectInputStream(new BufferedInputStream(new FileInputStream("Ayşe")));
            System.out.println(oOS.readUTF());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Soru2Okuma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
