/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.TravellerController;
import javax.swing.JOptionPane;
import database.DbConnection;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Traveller;
/**
 *
 * @author ASUS
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */int a=0;
     int b=0;
    public loginpage() {
        initComponents();
         getContentPane().requestFocusInWindow();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Sign_In_Email_ = new javax.swing.JTextField();
        jButton_SignUp_ = new javax.swing.JButton();
        jButton_LogIn = new javax.swing.JButton();
        jCheckBox_Remember_ = new javax.swing.JCheckBox();
        jButton_Forget_Password_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_Sign_In_Password_ = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 204));
        jLabel2.setText("         Sign In");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setText("Sign in to find new solution for destination ");

        jTextField_Sign_In_Email_.setBackground(new java.awt.Color(204, 0, 255));
        jTextField_Sign_In_Email_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_Sign_In_Email_.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Sign_In_Email_.setFocusCycleRoot(true);
        jTextField_Sign_In_Email_.setHighlighter(null);
        jTextField_Sign_In_Email_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_Sign_In_Email_FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_Sign_In_Email_FocusLost(evt);
            }
        });
        jTextField_Sign_In_Email_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Sign_In_Email_ActionPerformed(evt);
            }
        });

        jButton_SignUp_.setBackground(new java.awt.Color(153, 0, 204));
        jButton_SignUp_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_SignUp_.setText("Sign Up");
        jButton_SignUp_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SignUp_ActionPerformed(evt);
            }
        });

        jButton_LogIn.setBackground(new java.awt.Color(153, 0, 204));
        jButton_LogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_LogIn.setText("Log In");
        jButton_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogInActionPerformed(evt);
            }
        });

        jCheckBox_Remember_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_Remember_.setForeground(new java.awt.Color(102, 0, 204));
        jCheckBox_Remember_.setText("Remember me");
        jCheckBox_Remember_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 1, true));
        jCheckBox_Remember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Remember_ActionPerformed(evt);
            }
        });

        jButton_Forget_Password_.setBackground(new java.awt.Color(242, 242, 242));
        jButton_Forget_Password_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Forget_Password_.setForeground(new java.awt.Color(102, 0, 204));
        jButton_Forget_Password_.setText("Forget Password ?");
        jButton_Forget_Password_.setBorder(null);
        jButton_Forget_Password_.setBorderPainted(false);
        jButton_Forget_Password_.setContentAreaFilled(false);
        jButton_Forget_Password_.setDefaultCapable(false);
        jButton_Forget_Password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Forget_Password_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 204));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 204));
        jLabel7.setText("Email");

        jPasswordField_Sign_In_Password_.setBackground(new java.awt.Color(204, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Remember_))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton_Forget_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jButton_SignUp_))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Sign_In_Email_)
                            .addComponent(jPasswordField_Sign_In_Password_, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Sign_In_Email_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_Sign_In_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_Remember_)
                    .addComponent(jButton_Forget_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_SignUp_, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 470, 340));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo 1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/315528616_2761970403936886_6157968893734964065_n.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 530));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Sign_In_Email_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Sign_In_Email_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Sign_In_Email_ActionPerformed

    private void jButton_Forget_Password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Forget_Password_ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "oops!! you forgot your password");
    }//GEN-LAST:event_jButton_Forget_Password_ActionPerformed

    private void jTextField_Sign_In_Email_FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_Sign_In_Email_FocusGained
        // TODO add your handling code here:
        
        if (a==0){
        jTextField_Sign_In_Email_.setText(" ");
        a+=1;
        }
    }//GEN-LAST:event_jTextField_Sign_In_Email_FocusGained

    private void jTextField_Sign_In_Email_FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_Sign_In_Email_FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_Sign_In_Email_FocusLost

    private void jCheckBox_Remember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Remember_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Remember_ActionPerformed

    private void jButton_SignUp_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SignUp_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        RegistrationScreen reg = new RegistrationScreen();
        reg.setVisible(true);
    }//GEN-LAST:event_jButton_SignUp_ActionPerformed

    private void jButton_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogInActionPerformed
//        DbConnection db1 =new DbConnection();
//        DbConnection conn1 = null;
//        Statement stmt =null;
//        ResultSet rs =null;
//          
        
        String email1 = jTextField_Sign_In_Email_.getText();
        String password1=String.valueOf(jPasswordField_Sign_In_Password_.getPassword());
        
        TravellerController tc = new TravellerController();
        ResultSet retrievedTraveller = tc.retrieveTraveller(email1,password1);

         try {
             while(retrievedTraveller.next()){
                 String hel=retrievedTraveller.getString("tr_email");
                 System.out.println(hel);
                 
                 
             }
         } catch (Exception ex) {
             Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE, null, ex);
         }
             



        
        
        
    }//GEN-LAST:event_jButton_LogInActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new loginpage().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Forget_Password_;
    private javax.swing.JButton jButton_LogIn;
    private javax.swing.JButton jButton_SignUp_;
    private javax.swing.JCheckBox jCheckBox_Remember_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Sign_In_Password_;
    private javax.swing.JTextField jTextField_Sign_In_Email_;
    // End of variables declaration//GEN-END:variables
}
