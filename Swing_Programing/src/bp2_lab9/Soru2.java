/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab9;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samet
 */
public class Soru2 extends javax.swing.JFrame {

    /**
     * Creates new form Soru_2
     */
    DefaultTableModel dtm;

    public Soru2() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"ID", "ADI", "SOYADI", "BİRİM"});
        dtm.addRow(new Object[]{1, "AHMET", "AK", "MUHASEBE"});
        dtm.addRow(new Object[]{2, "HASAN", "MAVİ", "MÜDÜRLÜK"});
        dtm.addRow(new Object[]{3, "YAPRAK", "AĞAÇ", "YAZILIM"});
        dtm.addRow(new Object[]{4, "BEREN", "SAAT", "MÜDÜRLÜK"});
        tbl_personel.setModel(dtm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_personel = new javax.swing.JTable();
        btn_aktar = new javax.swing.JButton();
        btn_ozelaktar = new javax.swing.JButton();
        btn_birimaktar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_personel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_personel);

        btn_aktar.setText("AKTAR");
        btn_aktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aktarActionPerformed(evt);
            }
        });

        btn_ozelaktar.setText("OZEL AKTAR");
        btn_ozelaktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ozelaktarActionPerformed(evt);
            }
        });

        btn_birimaktar.setText("BİRİM AKTAR");
        btn_birimaktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_birimaktarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_aktar)
                .addGap(28, 28, 28)
                .addComponent(btn_ozelaktar)
                .addGap(40, 40, 40)
                .addComponent(btn_birimaktar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aktar)
                    .addComponent(btn_ozelaktar)
                    .addComponent(btn_birimaktar))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aktarActionPerformed
        try {
            // TODO add your handling code here:

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PERSONELDB2", "sa", "as");
            String query = "INSERT INTO PERSONEL (ID,ADI,SOYADI,IDBIRIM) VALUES (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(query);

            for (int i = 0; i < dtm.getRowCount(); i++) {
                stm.setInt(1, Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                stm.setString(2, dtm.getValueAt(i, 1).toString());
                stm.setString(3, dtm.getValueAt(i, 2).toString());
                String birim = dtm.getValueAt(i, 3).toString();
                switch (birim) {
                    case "MÜDÜRLÜK":
                        stm.setInt(4, 1);
                        break;
                    case "MUHASEBE":
                        stm.setInt(4, 2);
                        break;
                    case "YAZILIM":
                        stm.setInt(4, 3);
                        break;
                    default:
                        stm.setInt(4, 0);
                }
                stm.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Soru2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_aktarActionPerformed

    private void btn_ozelaktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ozelaktarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PERSONELDB2", "sa", "as");
            String query = "INSERT INTO PERSONEL (ID,ADI,SOYADI,IDBIRIM) VALUES (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(query);

            for (int i = 0; i < dtm.getRowCount(); i++) {
                if (dtm.getValueAt(i, 1).toString().toUpperCase().startsWith("A")) {
                    stm.setInt(1, Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                    stm.setString(2, dtm.getValueAt(i, 1).toString());
                    stm.setString(3, dtm.getValueAt(i, 2).toString());
                    String birim = dtm.getValueAt(i, 3).toString();
                    switch (birim) {
                        case "MÜDÜRLÜK":
                            stm.setInt(4, 1);
                            break;
                        case "MUHASEBE":
                            stm.setInt(4, 2);
                            break;
                        case "YAZILIM":
                            stm.setInt(4, 3);
                            break;
                        default:
                            stm.setInt(4, 0);
                    }
                    stm.executeUpdate();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Soru2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ozelaktarActionPerformed

    private void btn_birimaktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_birimaktarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PERSONELDB2", "sa", "as");
            String query = "INSERT INTO BIRIM (ID,ADI) VALUES (?,?)";
            PreparedStatement stm = con.prepareStatement(query);

            for (int i = 0; i < dtm.getRowCount(); i++) {

                try {

                    String birim = dtm.getValueAt(i, 3).toString();
                    switch (birim) {
                        case "MÜDÜRLÜK":
                            stm.setInt(1, 1);
                            stm.setString(2, "MÜDÜRLÜK");
                            break;
                        case "MUHASEBE":
                            stm.setInt(1, 2);
                            stm.setString(2, "MUHASEBE");
                            break;
                        case "YAZILIM":
                            stm.setInt(1, 3);
                            stm.setString(2, "YAZILIM");
                            break;
                        default:
                            stm.setInt(1, 0);
                            stm.setString(2, "PERSONEL");
                    }
                    stm.executeUpdate();
                } catch (Exception e) {

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Soru2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_birimaktarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aktar;
    private javax.swing.JButton btn_birimaktar;
    private javax.swing.JButton btn_ozelaktar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_personel;
    // End of variables declaration//GEN-END:variables
}
