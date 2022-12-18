/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.Hospital;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Hp
 */
public class HospitalController {
       DbConnection dbConnection;

    
    public int insertHospital(Hospital hospital) {
    int id = hospital.getHospital_id();
    id++;
    String name = hospital.getHospital_name();
    String description = hospital.getHospital_description();
    String address = hospital.getHospital_address();
    String contact = hospital.getHospital_contact();
    String insertQuery = String.format(
            "insert into hospital(hospital_id, hospital_name, hospital_description, hospital_address, hospital_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}
    
    public int updateHospital(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update hospital set hospital_name='%s', hospital_description= '%s', hospital_address='%s', hospital_contact='%s' where hospital_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}
public int deleteHospital(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM hospital WHERE hospital_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}

public ResultSet fetchHospital(){
 
        String retrieveQuery = String.format(
                "SELECT * FROM hospital");
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(retrieveQuery);
        return result;
    }
    
}
