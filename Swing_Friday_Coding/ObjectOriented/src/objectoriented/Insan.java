/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author samet
 */
public class Insan extends Canli {

    private String sifre;
    private String kimlikno;

    /**
     * @return the kimlikno
     */
    public String getKimlikno() {
        return kimlikno;
    }

    /**
     * @param kimlikno the kimlikno to set
     */
//    public void setKimlikno(String kimlikno) {
//        if (!kimlikno.startsWith("TR")) {
//            System.out.println("Kimlik numarası TR ile başlamalıdır");
//            return;
//        }
//
//        this.kimlikno = kimlikno;
//    }

    public Insan(String isim, String kimlikno) {
        super(isim);
        if (!kimlikno.startsWith("TR")) {
            System.out.println("Kimlik numarası TR ile başlamalıdır");
            return;
        }

        this.Tur = "Insan";
        this.kimlikno = kimlikno;
    }

    @Override
    public void SesCikar() {
        System.out.println("");
    }

    public void SesCikar(String cumle) {
        System.out.println("" + cumle);
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        
        
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        
        sifre=sifre.replace("A", "J");
        this.sifre = sifre;
    }

}
