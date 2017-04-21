/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalmedyaapp;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author samet
 */
public class USER {
    public static ArrayList<USER> Kullanicilar= new ArrayList();
    public int Id;
    public String KullaniciAdi;
    public String Adi;
    public String Soyadi;
    public String Sifre;
    public boolean Cinsiyet;
    public ArrayList<USER> ArkadasListesi = new ArrayList<>();
    public ArrayList<USER> ArkadaslikIstekleri = new ArrayList<>();
    
    
}
