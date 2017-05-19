/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders14lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samet
 */
public class Ornek7DosyaBulma {
    public static void main(String[] args) {
        try {
            Path start=Paths.get("C:\\Intel");
            Files.walkFileTree(start, new FWI());
        } catch (IOException ex) {
            Logger.getLogger(Ornek7DosyaBulma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
