/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab11;

import bp2_lab8.NewClass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samet
 */
public class Soru2 {

    public static void main(String[] args) {

        try {
            // bağlantı için
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PERSONELDB", "sa", "as");
            // iletişimi acıyor
            Statement stmt = con.createStatement();
            // veritabanında sorgu çalıştırıp bize geri tablo döndürüyor.
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONEL");
            BufferedWriter output = new BufferedWriter(new FileWriter("dosya2.txt"));
            int idenbuyuk = 0;
            while (rs.next()) {
                int id = rs.getInt("ID");
                if (id > idenbuyuk) {
                    idenbuyuk = id;
                }
                String adi = rs.getString("ADI");
                String soyadi = rs.getString("SOYADI");
                int maas = rs.getInt("MAAS");
                output.write(adi + " " + soyadi + " " + id + "\n");
            }
            output.close();

            BufferedReader input = new BufferedReader(new FileReader("dosya2.txt"));
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println("" + line);
                String[] values = line.split(" ");
                idenbuyuk++;
                String inserString = "INSERT INTO PERSONEL (ID,ADI,SOYADI,MAAS) VALUES (" +idenbuyuk + ",'" + values[0] + "','"
                        + values[1] + "',"
                        + 0 + ")";
                //       System.out.println("" + inserString);
                stmt.executeUpdate(inserString);

            }

            input.close();

        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Soru2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
