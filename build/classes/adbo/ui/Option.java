/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.ui;

/**
 *
 * @author Acer
 */
import adbo.SoundCaller;

public class Option extends javax.swing.JFrame {

    int sound = 1;
    SoundCaller sc;
    Controller c;
    /**
     * Creates new form Option
     */
    public Option(Controller c) {
        this.c = c;
        initComponents();
        sc = new SoundCaller();
        sound();
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
    
    

    public void sound()
    {
        if(sound == 1)
        {
            SoundOn.setVisible(true);
            SoundOff.setVisible(false);
            sc.playSoundBG();
        }
        
        else if(sound == 0)
        {
            SoundOn.setVisible(false);
            SoundOff.setVisible(true);
            sc.stopSoundBG();
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SoundOn = new javax.swing.JLabel();
        SoundOff = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        OnOff = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(280, 100, 700, 575));
        setMaximumSize(new java.awt.Dimension(700, 575));
        setMinimumSize(new java.awt.Dimension(700, 575));
        setPreferredSize(new java.awt.Dimension(700, 575));
        setResizable(false);
        getContentPane().setLayout(null);

        SoundOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adbo/image/VolumeOn.jpg"))); // NOI18N
        getContentPane().add(SoundOn);
        SoundOn.setBounds(460, 70, 100, 80);

        SoundOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adbo/image/VolumeOff.jpg"))); // NOI18N
        getContentPane().add(SoundOff);
        SoundOff.setBounds(570, 80, 100, 70);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(570, 480, 90, 50);

        OnOff.setText("Sound Off");
        OnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffActionPerformed(evt);
            }
        });
        getContentPane().add(OnOff);
        OnOff.setBounds(520, 180, 110, 40);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adbo/image/OptionBG.jpg"))); // NOI18N
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 700, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffActionPerformed
       
       if(sound == 1)
       {
            sound = 0;
            OnOff.setText("Sound - On");
            sound();
       }
       
       else if(sound == 0)
       {
            sound = 1;
            OnOff.setText("Sound - Off");
            sound();
       }
    }//GEN-LAST:event_OnOffActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        this.c.mainMenuFrame.setVisible(true);
        
    }//GEN-LAST:event_BackActionPerformed

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
//            java.util.logging.Logger.getLogger(Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Option().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton OnOff;
    private javax.swing.JLabel SoundOff;
    private javax.swing.JLabel SoundOn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
