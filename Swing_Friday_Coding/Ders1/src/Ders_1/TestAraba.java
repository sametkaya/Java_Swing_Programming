package Ders_1;

import java.util.Scanner;

public class TestAraba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Araba araba1 = new Araba("Ford", "Focus", "beyaz", 240);

        System.out.println("Araba1 i�in fiyat� girirniz:");

        int fiyat = input.nextInt();
        araba1.setFiyat(fiyat);
        System.out.println("Araba1 i�in fiyat: " + araba1.fiyat);

        ekranaBas(araba1);

        Araba araba2 = new Araba("BMW", "766", "siyah", 300);
        ekranaBas(araba2);

        Ford araba3 = new Ford("Ford", "Focus", "Beyaz", 240, 140);

        System.out.println("Araba3 i�in fiyat giriniz:");
        fiyat = input.nextInt();
        araba3.setFiyat(fiyat);
        System.out.println("Renk:" + araba3.getRenk());
        System.out.println("Fiyat indirim yap�ld�ktan sonra:" + araba3.getFiyat());
        ekranaBas(araba3);

        System.out.println("\nBeygirG�c�: " + araba3.getBeygirGucu());

    }

    public static void ekranaBas(Araba araba) {

        System.out.println("Marka: " + araba.getMarka() + "\nModel: " + araba.getModel()
                + "\nRenk: " + araba.getRenk() + "\nH�z: " + araba.getHiz());

    }
}
