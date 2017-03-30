/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab7;

/**
 *
 * @author samet
 */
 public class SifirdanKucukException extends Exception {

        public SifirdanKucukException() {
            super("Sayi Sıfırdan Kücük");

        }
        
        public SifirdanKucukException(String message) {
            super(message);

        }

    }