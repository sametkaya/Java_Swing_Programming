/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author samet
 */
public class Circles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Xl: ");
        double Xl = keyboard.nextDouble();
        if (!(0 <= Xl && Xl <= 1000000)) {
            System.out.println("HATA!");
            return;
        }
        System.out.print("Xr: ");
        double Xr = keyboard.nextDouble();
        if (!(Xl <= Xr && Xr <= 1000000)) {
            System.out.println("HATA!");
            return;
        }
        System.out.print("R: ");
        double R = keyboard.nextDouble();
        if (!(1 <= R && R <= 1000000)) {
            System.out.println("HATA!");
            return;
        }
        System.out.print("N: ");
        int N = keyboard.nextInt();
        if (!(0 <= R && R <= 200)) {
            System.out.println("HATA!");
            return;
        }
        Circle[] halkalar = new Circle[N];
        for (int i = 0; i < N; i++) {
            System.out.print("X+" + i + ": ");
            double Xj = keyboard.nextDouble();
            if (!(1 < Xj && Xj < 1000000)) {
                System.out.println("HATA!");
                return;
            }
            System.out.print("Y+" + i + ": ");
            double Yj = keyboard.nextDouble();
            if (!(1 < Yj && Yj < 1000000)) {
                System.out.println("HATA!");
                return;
            }
            System.out.println("");
            halkalar[i] = new Circle(Xj, Yj, R);
        }
        double maxdistance = 0;
        Circle farthestcircle = halkalar[0];
        double farthestY = 0;
        for (int i = 0; i < halkalar.length; i++) {
            double distance = 0;
            for (int j = 0; j < halkalar.length; j++) {

                distance = Math.sqrt(Math.pow((double) (Math.abs(halkalar[i].X - halkalar[j].X)), 2) + Math.pow((double) (Math.abs(halkalar[i].Y - halkalar[j].Y)), 2));
                if (distance > maxdistance) {
                    maxdistance = distance;
                    farthestcircle = halkalar[i];
                }

            }
            distance = Math.sqrt(Math.pow((double) (Math.abs(halkalar[i].X - Xl)), 2) + Math.pow((double) (halkalar[i].Y - 0), 2));
            if (distance > maxdistance) {
                maxdistance = distance;
                farthestcircle = halkalar[i];
            }
            distance = Math.sqrt(Math.pow((double) (Math.abs(halkalar[i].X - Xr)), 2) + Math.pow((double) (halkalar[i].Y - 0), 2));
            if (distance > maxdistance) {
                maxdistance = distance;
                farthestcircle = halkalar[i];
            }

        }
        System.out.println("" + maxdistance);

//        double mindistance2 = 100000;
//        Circle farthestcircle2 = halkalar[0];
//
//        for (int i = 0; i < halkalar.length; i++) {
//            double distance2 = Math.sqrt(Math.pow((double) (Xr-halkalar[i].X), 2) + Math.pow((double) (farthestY-halkalar[i].Y), 2));
//            if (distance2 < mindistance2) {
//                mindistance2 = distance2;
//                farthestcircle2 = halkalar[i];
//            }
//
//        }
//        double Rn = Xr - farthestcircle2.X - (farthestcircle2.R / 2);
//        if (Rn
//                <= 0) {
//            System.out.println("0");
//            return;
//        }
//
//        double X = farthestcircle2.X + (Rn / 2);
//        double Y = farthestcircle2.Y + (Rn / 2);
//
//        System.out.println(
//                "" + Rn + " " + X + " " + Y);
    }

}
