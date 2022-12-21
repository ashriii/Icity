/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.TravellerController;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
/**
 *
 * @author HP
 */
public class Profilescreen extends javax.swing.JFrame {
    int userId;
    String name;
    String number;
    String email;
    ResultSet data;
    JFileChooser file;
    /**
     * Creates new form Profile
     */
    public Profilescreen(int userI) {
        this.userId=userI; //bringing nad connection the data from user id 
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

        jPanel_BackButton_ = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel_ProfileName_ = new javax.swing.JLabel();
        jLabel_Name_ = new javax.swing.JLabel();
        jLabel_Number_ = new javax.swing.JLabel();
        jLabel_Email_ = new javax.swing.JLabel();
        jButton_Edit_1 = new javax.swing.JButton();
        jButton_Edit_2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_Back_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_BackButton_.setBackground(new java.awt.Color(0, 102, 102));
        jPanel_BackButton_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label1.setText("Username:");
        jPanel_BackButton_.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label2.setText("About");
        jPanel_BackButton_.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        label3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label3.setText("Phone:");
        jPanel_BackButton_.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 60, 20));

        label4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label4.setText("E-Mail:");
        jPanel_BackButton_.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));
        //Image of profile added by user
        
        // NOI18N
        jPanel_BackButton_.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 100));

        jLabel_ProfileName_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ProfileName_.setText("Alex Thapa");
        jPanel_BackButton_.add(jLabel_ProfileName_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 20));
        

        jLabel_Name_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TravellerController t1 = new TravellerController();
        ResultSet rs=t1.fetchTraveller(userId);
        try{
            while(rs.next()){
                jLabel_Name_.setText(rs.getString("tr_name"));
                // jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rs.getString("tr_image"))));
                // System.out.println(rs.getString("tr_image"));
            }}
            catch(Exception e){
                e.printStackTrace();
            }
            jPanel_BackButton_.add(jLabel_Name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, 20));

            jLabel_Number_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel_Number_.setText("9825631478");
            jPanel_BackButton_.add(jLabel_Number_, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, 20));

            jLabel_Email_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel_Email_.setText("alex123@gmail.com");
            jPanel_BackButton_.add(jLabel_Email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, 20));

            jButton_Edit_1.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Edit_1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jButton_Edit_1.setText("Add Image");
            jButton_Edit_1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_Edit_1ActionPerformed(evt);
                }
            });
            jPanel_BackButton_.add(jButton_Edit_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

            jButton_Edit_2.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Edit_2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jButton_Edit_2.setText("Edit Profile");
            jButton_Edit_2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_Edit_2ActionPerformed(evt);
                }
            });
            jPanel_BackButton_.add(jButton_Edit_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

            getContentPane().add(jPanel_BackButton_, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 470, 330));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo 5.png"))); // NOI18N
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));

            jButton_Back_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Back_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_Back_.setText("Back");
            jButton_Back_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_Back_ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Back_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 30));

            jLabel2.setBackground(new java.awt.Color(0, 102, 102));
           
        
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/315528616_2761970403936886_6157968893734964065_n.jpg"))); // NOI18N
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -20, -1, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton_Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new UserDashBoard(userId).setVisible(true); //display the frame from the user dash board
    }//GEN-LAST:event_jButton_Back_ActionPerformed

    private void jButton_Edit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_1ActionPerformed
    file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r = file.showOpenDialog(null);
        
        
     if (r == JFileChooser.APPROVE_OPTION) {
    
    File selectedFile = file.getSelectedFile();
    String image=String.valueOf(selectedFile);
    String[] arr=new String[image.length()];
    String updatedImage="";
        for(int i=0;i<=image.length()-1;i++){
            if(image.charAt(i)=='\b'){
                arr[i]="/";
            }else{
              arr[i]=String.valueOf(image.charAt(i));
            }
            updatedImage+=arr[i];
        }
         System.out.println(updatedImage);
        

    int id=userId;
    
    TravellerController tc = new TravellerController();
    int updateImage=tc.insertImage(id, updatedImage);
    if(updateImage>0){
        JOptionPane.showMessageDialog(null,"Image Updated");
    }
    else{
        JOptionPane.showMessageDialog(null,"Error, please try again.");

    }
    
    
}
    }//GEN-LAST:event_jButton_Edit_1ActionPerformed

    private void jButton_Edit_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_2ActionPerformed
        this.dispose();
        new Edit_Profile(userId).setVisible(true);
    }//GEN-LAST:event_jButton_Edit_2ActionPerformed
 
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
            java.util.logging.Logger.getLogger(Profilescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profilescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profilescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profilescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profilescreen(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back_;
    private javax.swing.JButton jButton_Edit_1;
    private javax.swing.JButton jButton_Edit_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Email_;
    private javax.swing.JLabel jLabel_Name_;
    private javax.swing.JLabel jLabel_Number_;
    private javax.swing.JLabel jLabel_ProfileName_;
    private javax.swing.JPanel jPanel_BackButton_;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
