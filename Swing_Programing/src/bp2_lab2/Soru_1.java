/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab2;

/**
 *
 * @author samet
 */
public class Soru_1 extends javax.swing.JFrame {

    /**
     * Creates new form Soru_1
     */
    public Soru_1() {
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

        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        txt_yazi = new javax.swing.JTextField();
        cmb_liste = new javax.swing.JComboBox<>();
        btn_sil2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ekle.setText("EKLE");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, 40));

        btn_sil.setText("SİL");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 40));
        getContentPane().add(txt_yazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 134, 32));

        getContentPane().add(cmb_liste, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 40));

        btn_sil2.setText("SİL2");
        btn_sil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sil2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        // TODO add your handling code here:
        cmb_liste.addItem(txt_yazi.getText());
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        // TODO add your handling code here:
        cmb_liste.removeItem(txt_yazi.getText());
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_sil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sil2ActionPerformed
        // TODO add your handling code here:
        if (cmb_liste.getSelectedIndex()>=0) {
             cmb_liste.removeItemAt(cmb_liste.getSelectedIndex());
             
        }
        
        
       
    }//GEN-LAST:event_btn_sil2ActionPerformed

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
            java.util.logging.Logger.getLogger(Soru_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_sil2;
    private javax.swing.JComboBox<String> cmb_liste;
    private javax.swing.JTextField txt_yazi;
    // End of variables declaration//GEN-END:variables
}
