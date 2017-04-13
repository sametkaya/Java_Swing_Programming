/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab8;


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
public class NewClass {

    public static void main(String[] args) {
        

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DATA", "sa", "as");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONEL");

            while (rs.next()) {
                int x = rs.getInt("ID");
                String s = rs.getString("AD");
         
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }

}

