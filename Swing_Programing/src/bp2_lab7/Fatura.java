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
public class Fatura {
    private int fiyat;

    /**
     * @return the fiyat
     */
    public int getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(int fiyat) throws SifirdanKucukException {
        if(fiyat<0)
        {
            throw  new SifirdanKucukException();
        }
        this.fiyat = fiyat;
    }
}
