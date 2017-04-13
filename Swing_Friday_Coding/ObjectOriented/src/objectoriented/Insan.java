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
public class Insan extends Canli{
    
    private String kimlikno;
    public Insan(String isim)
    {
        super(isim);
        this.Tur="Insan";
   
    }
    
    @Override
    public void SesCikar()
    {
        System.out.println("");
    }
    
    public void SesCikar(String cumle)
    {
        System.out.println(""+cumle);
    }

    
}
