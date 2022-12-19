/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TravellerController;
import model.Hospital;
import model.School;
import model.Office;
import model.Market;
import model.Tourist_area;
import model.Park;
import controller.SchoolController;
import controller.HospitalController;
import controller.OfficeController;
import controller.MarketController;
import controller.TouristAreaController;
import controller.ParkController;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class adminboard extends javax.swing.JFrame {
    
    /**
     * Creates new form adminboard
     */
    public adminboard() {
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

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Id_ = new javax.swing.JTextField();
        jTextField_Name_ = new javax.swing.JTextField();
        jTextField_Address_ = new javax.swing.JTextField();
        jTextField_Contact_ = new javax.swing.JTextField();
        jTextField_Description_ = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Update_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Category_ = new javax.swing.JTextField();
        jButton_Back_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo 1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 190, 70);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("ADMIN PANEL");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("NAME:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("ADDRESS:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("CONTACT:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("DESCRIPTION:");

        jTextField_Id_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jTextField_Name_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTextField_Name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Name_ActionPerformed(evt);
            }
        });

        jTextField_Address_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jTextField_Contact_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jTextField_Description_.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jButton_Add_.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Add_.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton_Add_.setText("ADD");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Update_.setBackground(new java.awt.Color(51, 51, 255));
        jButton_Update_.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton_Update_.setText("UPDATE");
        jButton_Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Delete_.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton_Delete_.setText("DELETE");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18));
        jLabel8.setText("Category:");

        jButton_Back_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Back_.setFont(new java.awt.Font("Roboto", 1, 14));
        jButton_Back_.setText("Back");
        jButton_Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Back_, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton_Update_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(jButton_Delete_)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Category_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Id_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(jTextField_Name_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Address_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Contact_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Description_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Back_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField_Category_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Id_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Address_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Contact_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Description_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_)
                    .addComponent(jButton_Update_)
                    .addComponent(jButton_Delete_))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(296, 30, 786, 507);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/315528616_2761970403936886_6157968893734964065_n.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, 0, 1290, 543);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Name_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Name_ActionPerformed

    private void jButton_Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_ActionPerformed
        //Update in data
        String category=jTextField_Category_.getText();
        String name =jTextField_Name_.getText();
        int id =Integer.parseInt(jTextField_Id_.getText());
        String contact=jTextField_Contact_.getText();
        String description=jTextField_Description_.getText();
        String address =jTextField_Address_.getText();
        
        switch (category) {
            //Update Hospital info
            case "Hospital":
                HospitalController hc = new HospitalController();
                int updatedHospital=hc.updateHospital(id,name,description,address,contact);
                if (updatedHospital>0){
                    JOptionPane.showMessageDialog(null,"Hospital updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            //Update School info
            case "School":
                
                SchoolController sc = new SchoolController();
                int updatedSchool = sc.updateSchool(id, name, description, address, contact);
                if (updatedSchool>0){
                    JOptionPane.showMessageDialog(null,"School updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            //Update Office info
            case "Office":
                
                OfficeController oc = new OfficeController();
                int updatedOffice = oc.updateOffice(id, name, description, address, contact);
                if (updatedOffice>0){
                    JOptionPane.showMessageDialog(null,"Office updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            //Update market info
            case "Market":
                MarketController mc = new MarketController();
                int updatedMarket = mc.updateMarket(id, name, description, address, contact);
                if (updatedMarket>0){
                    JOptionPane.showMessageDialog(null,"Market updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            //Update tourist area info
            case "Tourist Area":
                
                TouristAreaController tc = new TouristAreaController();
                int updatedTouristArea = tc.updateTouristArea(id, name, description, address, contact);
                if (updatedTouristArea>0){
                    JOptionPane.showMessageDialog(null,"Tourist area updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            //Update Park info
            case "Park":
                
                ParkController pc = new ParkController();
                int updatedPark = pc.updatePark(id, name, description, address, contact);
                if (updatedPark>0){
                    JOptionPane.showMessageDialog(null,"Park updated successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in updation.");
                    
                }   break;
            default:
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
                break;
        }
        
        
        
        
    }//GEN-LAST:event_jButton_Update_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        int id = Integer.parseInt(jTextField_Id_.getText());
        String category=jTextField_Category_.getText();

        switch (category) {
            case "Hospital":
                HospitalController hc = new HospitalController();
                int deletedHospital =hc.deleteHospital(id);
                
                if (deletedHospital>0){
                    JOptionPane.showMessageDialog(null,"Hospital deleted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
                    
                }   break;
                
                
                case "School":
                    SchoolController sc = new SchoolController();
                    int deletedSchool =sc.deleteSchool(id);
        
                if (deletedSchool>0){
                    JOptionPane.showMessageDialog(null,"School deleted successfully.");
            
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
            
                }   break;
                
                
                case "Office":
                    OfficeController oc = new OfficeController();
                    int deletedOffice =oc.deleteOffice(id);
        
                if (deletedOffice>0){
                    JOptionPane.showMessageDialog(null,"Office deleted successfully.");
            
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
            
                }   break;
                
                
                case "Tourist Area":
                    TouristAreaController tc = new TouristAreaController();
                    int deletedTouristArea =tc.deleteTouristArea(id);
        
                if (deletedTouristArea>0){
                    JOptionPane.showMessageDialog(null,"Tourist area deleted successfully.");
            
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
            
                }   break;
                
                
                case "Market":
                    MarketController mc = new MarketController();
                    int deletedMarket =mc.deleteMarket(id);
        
                if (deletedMarket>0){
                    JOptionPane.showMessageDialog(null,"Market deleted successfully.");
            
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
            
                }   break;
                
            case "Park":
                ParkController pc = new ParkController();
                int deletedPark =pc.deletePark(id);
        
                if (deletedPark>0){
                    JOptionPane.showMessageDialog(null,"Park deleted successfully.");
            
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in deletion.");
            
                }   break;
                
            default:
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
                break;

                        
        }
        
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_ActionPerformed
        this.dispose();
        new UserDashBoard(1).setVisible(true);
        
    }//GEN-LAST:event_jButton_Back_ActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String category=jTextField_Category_.getText();
        String name =jTextField_Name_.getText();
        int id =Integer.parseInt(jTextField_Id_.getText());
        String contact=jTextField_Contact_.getText();
        String description=jTextField_Description_.getText();
        String address =jTextField_Address_.getText();
        
        //Hospital Data insertion
        switch (category) {
            case "Hospital":
                Hospital h1 = new Hospital(id, name, description, address, contact);
                HospitalController hc = new HospitalController();
                int insertedHospital = hc.insertHospital(h1);
                if (insertedHospital>0){
                    JOptionPane.showMessageDialog(null,"Hospital inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            case "School":
                School s1 = new School(id, name, description, address, contact);
                SchoolController sc = new SchoolController();
                int insertedSchool = sc.insertSchool(s1);
                if (insertedSchool>0){
                    JOptionPane.showMessageDialog(null,"School inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            case "Office":
                Office o1 = new Office(id, name, description, address, contact);
                OfficeController oc = new OfficeController();
                int insertedOffice = oc.insertOffice(o1);
                if (insertedOffice>0){
                    JOptionPane.showMessageDialog(null,"Office inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            case "Market":
                Market m1 = new Market(id, name, description, address, contact);
                MarketController mc = new MarketController();
                int insertedMarket = mc.insertMarket(m1);
                if (insertedMarket>0){
                    JOptionPane.showMessageDialog(null,"Market inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            case "Tourist Area":
                Tourist_area t1 = new Tourist_area(id, name, description, address, contact);
                TouristAreaController tc = new TouristAreaController();
                int insertedTouristArea = tc.insertTouristArea(t1);
                if (insertedTouristArea>0){
                    JOptionPane.showMessageDialog(null,"Tourist area inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            case "Park":
                Park p1 = new Park(id, name, description, address, contact);
                ParkController pc = new ParkController();
                int insertedPark = pc.insertPark(p1);
                if (insertedPark>0){
                    JOptionPane.showMessageDialog(null,"Park inserted successfully.");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error in insertion.");
                    
                }   break;
            default:
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
                break;
        }
        
        
    }                                            

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
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Back_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Update_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Address_;
    private javax.swing.JTextField jTextField_Category_;
    private javax.swing.JTextField jTextField_Contact_;
    private javax.swing.JTextField jTextField_Description_;
    private javax.swing.JTextField jTextField_Id_;
    private javax.swing.JTextField jTextField_Name_;
    // End of variables declaration//GEN-END:variables
}
