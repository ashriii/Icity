 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.TravellerController;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author sansk
 */
public class Resetpassword extends javax.swing.JFrame {


    /**
     * Creates ne w form Resetpassword
     */
    public Resetpassword() {
        initComponents();
    }
    
    public String email ="";
    public String number="";
    
    public Resetpassword(String email,String number){//calling the method
            this.email=email;
            this.number=number;
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

        jPanel1 = new javax.swing.JPanel();
        jButton_Back_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_New_Password_ = new javax.swing.JTextField();
        jButton_Submit_ = new javax.swing.JButton();
        jTextField_Confirm_Password_ = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        BGphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Back_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Back_.setFont(new java.awt.Font("Roboto", 1, 12));
        jButton_Back_.setText("Back");
        jButton_Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18));
        jLabel1.setText("Reset Password");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14));
        jLabel2.setText("Enter New Password");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14));
        jLabel3.setText("Confirm Password");

        jButton_Submit_.setBackground(new java.awt.Color(30, 101, 166));
        jButton_Submit_.setFont(new java.awt.Font("Roboto", 1, 18));
        jButton_Submit_.setText("Submit");
        jButton_Submit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Submit_ActionPerformed(evt);
            }
        });

        jTextField_Confirm_Password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Confirm_Password_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_New_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Confirm_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton_Submit_, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_New_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Confirm_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_Submit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 370, 340));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo 5.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        BGphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Central-i-city-1-1280x720222.jpg"))); // NOI18N
        jPanel1.add(BGphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 870, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Confirm_Password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Confirm_Password_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Confirm_Password_ActionPerformed

    private void jButton_Submit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Submit_ActionPerformed
        // TODO add your handling code here:
        String newPassword =jTextField_New_Password_.getText();
        String newConfirmPassword =jTextField_Confirm_Password_.getText();
        
        if(newPassword==newConfirmPassword){
            TravellerController ut= new TravellerController();//connecting the data in travellercontroller
            ut.updateTraveller(email, number, newPassword );
            JOptionPane.showMessageDialog(null,"Password Updated");

        
        }
        else{
             JOptionPane.showMessageDialog(null,"Password doesn't match.");
        
        }

    }//GEN-LAST:event_jButton_Submit_ActionPerformed

    private void jButton_Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_ActionPerformed
        this.dispose();
        new forgetpassword().setVisible(true);
    }//GEN-LAST:event_jButton_Back_ActionPerformed

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
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resetpassword().setVisible(true);
                
//                Resetpassword res = new Resetpassword();
//                res.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGphoto;
    private javax.swing.JButton jButton_Back_;
    private javax.swing.JButton jButton_Submit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Confirm_Password_;
    private javax.swing.JTextField jTextField_New_Password_;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
