/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.ui;

import adbo.SoundCaller;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Kelas ini digunakan sebagai Tampilan Main menu pada permainan.
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    SoundCaller sc;
    Option op;
    Controller c;
    
    public MainMenuFrame(Controller c) {
        this.c = c;
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(768,480);
        setLocationRelativeTo(null);
        setTitle("Setan Kredit");
        setResizable(false);
        background.setIcon(new ImageIcon(this.getClass().getResource("/adbo/image/electronic_circuit.jpg")));
        judul.setIcon(new ImageIcon(this.getClass().getResource("/adbo/image/setankredit1.jpg")));
        buttonMulai.setIcon(new ImageIcon(this.getClass().getResource("/adbo/image/start.jpg")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        buttonMulai = new javax.swing.JButton();
        optionBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(judul);
        judul.setBounds(150, 20, 620, 190);

        buttonMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMulai);
        buttonMulai.setBounds(230, 270, 293, 61);

        optionBtn.setText("Option");
        optionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(optionBtn);
        optionBtn.setBounds(230, 340, 140, 50);

        aboutBtn.setText("About");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(380, 340, 140, 50);
        getContentPane().add(background);
        background.setBounds(0, 0, 768, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMulaiActionPerformed
        // TODO add your handling code here:
        
        this.c.mainMenuFrame.setVisible(false);
        this.c.mainFrame.setVisible(true);
        
    }//GEN-LAST:event_buttonMulaiActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
       this.c.mainMenuFrame.setVisible(false);
       this.c.about.setVisible(true);

    }//GEN-LAST:event_aboutBtnActionPerformed

    private void optionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBtnActionPerformed
        this.c.mainMenuFrame.setVisible(false);
        this.c.option.setVisible(true);

    }//GEN-LAST:event_optionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonMulai;
    private javax.swing.JLabel judul;
    private javax.swing.JButton optionBtn;
    // End of variables declaration//GEN-END:variables
}
