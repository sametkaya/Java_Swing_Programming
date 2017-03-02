/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab2_1;

/**
 *
 * @author samet
 */
public class Selam {
    String merhaba_metni,dil;
   
    Selam(String merhaba_metni,String dil){
    this.merhaba_metni=merhaba_metni;
    this.dil=dil;
    
    }

    @Override
    public String toString() {
      return dil;
    }
    
    
}
