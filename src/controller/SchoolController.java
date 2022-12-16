/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.School;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Hp
 */
public class SchoolController {
       DbConnection dbConnection;
       
       public int insertSchool(School school) {
    int id = school.getSchool_id();
    id++;
    String name = school.getSchool_name();
    String description = school.getSchool_description();
    String address = school.getSchool_address();
    String contact = school.getSchool_contact();
    String insertQuery = String.format(
            "insert into school(school_id, school_name, school_description, school_address, school_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}



public int updateSchool(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update school set school_name='%s', school_description= '%s', school_address='%s', school_contact='%s' where school_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}

public int deleteSchool(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM school WHERE school_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}



    
    
    
}
