/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab2;

import java.awt.Color;
import javafx.scene.control.RadioButton;

/**
 *
 * @author samet
 */
public class Soru_3 extends javax.swing.JFrame {

    /**
     * Creates new form Soru_3
     */
    public Soru_3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbtn_mavi = new javax.swing.JRadioButton();
        tbtn_kirmizi = new javax.swing.JRadioButton();
        rbtn_sari = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbtn_mavi);
        rbtn_mavi.setText("Mavi");
        rbtn_mavi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtn_maviItemStateChanged(evt);
            }
        });

        buttonGroup1.add(tbtn_kirmizi);
        tbtn_kirmizi.setText("Kırmızı");
        tbtn_kirmizi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tbtn_kirmiziItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtn_sari);
        rbtn_sari.setText("Sarı");
        rbtn_sari.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tbtn_kirmiziItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbtn_mavi)
                        .addComponent(tbtn_kirmizi)
                        .addComponent(rbtn_sari)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(rbtn_mavi)
                .addGap(35, 35, 35)
                .addComponent(tbtn_kirmizi)
                .addGap(18, 18, 18)
                .addComponent(rbtn_sari)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_maviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtn_maviItemStateChanged
        // TODO add your handling code here:
        this.getContentPane().setBackground( Color.BLUE );
        this.setTitle("BLUE");
    }//GEN-LAST:event_rbtn_maviItemStateChanged

    private void tbtn_kirmiziItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tbtn_kirmiziItemStateChanged
        // TODO add your handling code here:
         switch (((javax.swing.JRadioButton) evt.getSource()).getText()) {
            case "Kırmızı":
                this.getContentPane().setBackground(Color.red);
                this.setTitle("KIRMIZI");
                break;
            case "Sarı":
                this.getContentPane().setBackground(new Color(128, 128, 128));
                this.setTitle("SARI");
                break;
            
        }
          
    }//GEN-LAST:event_tbtn_kirmiziItemStateChanged

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
            java.util.logging.Logger.getLogger(Soru_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton rbtn_mavi;
    private javax.swing.JRadioButton rbtn_sari;
    private javax.swing.JRadioButton tbtn_kirmizi;
    // End of variables declaration//GEN-END:variables
}
