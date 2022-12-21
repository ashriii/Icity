/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.TravellerController;

import controller.HospitalController;
import controller.OfficeController;
import controller.TouristAreaController;
import controller.ParkController;
import controller.MarketController;
import java.sql.*;

import javax.swing.JOptionPane;
import controller.SchoolController;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class UserDashBoard extends javax.swing.JFrame {
    int id ;
    int idUser;
    int[] arrayId={1};
    /**
     * Creates new form UserDashBoard
     */
    public UserDashBoard(int id1) {
        this.id =id1;
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

        jButton_Profile_ = new javax.swing.JButton();
        jLabel_Welcome_ = new java.awt.Label();
        jButton_Hospital_ = new javax.swing.JButton();
        jButton_Profile_1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_LogOut_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_Market_ = new javax.swing.JButton();
        jButton_Office_ = new javax.swing.JButton();
        jButton_TouristArea_ = new javax.swing.JButton();
        jButton_Park_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Data_ = new javax.swing.JTable();
        jButton_School_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusTraversalPolicyProvider(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Profile_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Profile_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton_Profile_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Profile_.setText("Profile");
        jButton_Profile_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Profile_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Profile_, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 110, 30));

        jLabel_Welcome_.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Welcome_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_Welcome_.setText("Welcome User");
        jLabel_Welcome_.setAlignment(1);
        TravellerController t1 = new TravellerController();
        ResultSet rs=t1.fetchTraveller(id);
        try{
            while(rs.next()){
                jLabel_Welcome_.setText("Welcome "+ rs.getString("tr_name"));
            }}
            catch(Exception e){
                e.printStackTrace();
            }
            getContentPane().add(jLabel_Welcome_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 250, 40));

            jButton_Hospital_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Hospital_.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
            jButton_Hospital_.setText("Hospital");
            jButton_Hospital_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Hospital_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 30));
            if(id==arrayId[0]){
            jButton_Profile_1.setBackground(new java.awt.Color(0, 102, 102));
            jButton_Profile_1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jButton_Profile_1.setForeground(new java.awt.Color(255, 255, 255));
            jButton_Profile_1.setText("Admin");
            jButton_Profile_1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_Profile_1ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Profile_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 110, 30));
        }
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo 5.png"))); // NOI18N
            jLabel2.setText("jLabel2");
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 70));

            jButton_LogOut_.setBackground(new java.awt.Color(0, 102, 102));
            jButton_LogOut_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jButton_LogOut_.setForeground(new java.awt.Color(255, 255, 255));
            jButton_LogOut_.setText("Log Out");
            jButton_LogOut_.setActionCommand("");
            jButton_LogOut_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_LogOut_ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_LogOut_, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 110, 30));

            jLabel1.setBackground(new java.awt.Color(102, 255, 255));
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/315528616_2761970403936886_6157968893734964065_n.jpg"))); // NOI18N
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 260));

            jButton_Market_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Market_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_Market_.setText("Markets");
            jButton_Market_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Market_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 120, 30));

            jButton_Office_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Office_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_Office_.setText("Offices");
            jButton_Office_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Office_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

            jButton_TouristArea_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_TouristArea_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_TouristArea_.setText("Tourist Area");
            jButton_TouristArea_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton8ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_TouristArea_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 30));

            jButton_Park_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_Park_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_Park_.setText("Parks");
            jButton_Park_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_Park_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 120, 30));

            jTable_Data_.setBackground(new java.awt.Color(0, 153, 102));
            jTable_Data_.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            jScrollPane2.setViewportView(jTable_Data_);

            getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 800, 300));

            jButton_School_.setBackground(new java.awt.Color(153, 153, 153));
            jButton_School_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jButton_School_.setText("School");
            jButton_School_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_School_ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_School_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 30));

            jPanel2.setBackground(new java.awt.Color(0, 102, 102));
            getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1270, 310));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton_Profile_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Profile_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Profilescreen(id).setVisible(true);
        
        
    }//GEN-LAST:event_jButton_Profile_ActionPerformed

    private void jButton_LogOut_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogOut_ActionPerformed
        this.dispose();
        new loginpage().setVisible(true);
    }//GEN-LAST:event_jButton_LogOut_ActionPerformed

    private void jButton_Profile_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Profile_1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new adminboard().setVisible(true);
    }//GEN-LAST:event_jButton_Profile_1ActionPerformed

    private void jButton_School_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_School_ActionPerformed
        SchoolController sc =new SchoolController();
        ResultSet rs = sc.fetchSchool();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton_School_ActionPerformed


    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      HospitalController hc =new HospitalController();
        ResultSet rs = hc.fetchHospital();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){    //using for loop for showing the data on userdashboard
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){  //using while loop for showing the data of different data on userdashboard
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {  //handeling the error
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        OfficeController oc =new OfficeController(); //controller from the office to update the code
        ResultSet rs = oc.fetchOffice();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {  //find the error and throwing the exception handeling 
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       TouristAreaController tc =new TouristAreaController();
        ResultSet rs = tc.fetchTouristArea();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       ParkController pc =new ParkController();
        ResultSet rs = pc.fetchPark();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();  //adding model defult model 
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {  //handling the exception 
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MarketController mc =new MarketController();
        ResultSet rs = mc.fetchMarket();
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable_Data_.getModel();
            int colm=rsmd.getColumnCount();
            String[] colmnName=new String[colm];
            for(int i=0;i<colm;i++){   //using for loop for entering the data 
                colmnName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colmnName);
            }
            
            while(rs.next()){
                   String name,description,address,contact;            
                   name=rs.getString(1);
                   description=rs.getString(2);
                   address=rs.getString(3);
                   contact=rs.getString(4);
                   String[] row={name,description,address,contact};
                   model.addRow(row);
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed



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
            java.util.logging.Logger.getLogger(UserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashBoard(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Hospital_;
    private javax.swing.JButton jButton_LogOut_;
    private javax.swing.JButton jButton_Market_;
    private javax.swing.JButton jButton_Office_;
    private javax.swing.JButton jButton_Park_;
    private javax.swing.JButton jButton_Profile_;
    private javax.swing.JButton jButton_Profile_1;
    private javax.swing.JButton jButton_School_;
    private javax.swing.JButton jButton_TouristArea_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label jLabel_Welcome_;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Data_;
    // End of variables declaration//GEN-END:variables
}
