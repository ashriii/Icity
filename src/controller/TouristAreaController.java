/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import java.sql.ResultSet;
import model.Tourist_area;


/**
 *
 * @author Hp
 */
public class TouristAreaController {
     DbConnection dbConnection;

    
    public int insertTouristArea(Tourist_area tourist_area) {
    int id = tourist_area.getTourist_area_id();
    id++;
    String name = tourist_area.getTourist_area_name();
    String description = tourist_area.getTourist_area_description();
    String address = tourist_area.getTourist_area_address();
    String contact = tourist_area.getTourist_area_contact();
    String insertQuery = String.format(
            "insert into tourist_area(tourist_area_id, tourist_area_name, tourist_area_description, tourist_area_address, tourist_area_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}
    
    



public int updateTouristArea(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update tourist_area set tourist_area_name='%s', tourist_area_description= '%s', tourist_area_address='%s', tourist_area_contact='%s' where tourist_area_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}

public int deleteTouristArea(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM tourist_area WHERE tourist_area_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}

public ResultSet fetchTouristArea(){
 
        String retrieveQuery = String.format(
                "SELECT * FROM tourist_area");
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(retrieveQuery);
        return result;
    }


    
}
