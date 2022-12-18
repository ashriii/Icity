/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Office;

import database.DbConnection;
import java.sql.ResultSet;

/**
 *
 * @author Hp
 */
public class OfficeController {
    DbConnection dbConnection;
           
    public int insertOffice(Office office) {
    int id = office.getOffice_id();
    id++;
    String name = office.getOffice_name();
    String description = office.getOffice_description();
    String address = office.getOffice_address();
    String contact = office.getOffice_contact();
    String insertQuery = String.format(
            "insert into office(office_id, office_name, office_description, office_address, office_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}



public int updateOffice(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update office set office_name='%s', office_description= '%s', office_address='%s', office_contact='%s' where office_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}

public int deleteOffice(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM office WHERE office_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}

public ResultSet fetchOffice(){
 
        String retrieveQuery = String.format(
                "SELECT * FROM office");
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(retrieveQuery);
        return result;
    }


    
}
