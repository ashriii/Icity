/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.Park;

/**
 *
 * @author Hp
 */
public class ParkController {
    
    DbConnection dbConnection;
           
    public int insertPark(Park park) {
    int id = park.getPark_id();
    id++;
    String name = park.getPark_name();
    String description = park.getPark_description();
    String address = park.getPark_address();
    String contact = park.getPark_contact();
    String insertQuery = String.format(
            "insert into park(park_id, park_name, park_description, park_address, park_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}



public int updatePark(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update park set park_name='%s', park_description= '%s', park_address='%s', park_contact='%s' where park_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}

public int deletePark(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM park WHERE park_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}


    
}
