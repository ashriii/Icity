/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Market;
import database.DbConnection;
import java.sql.ResultSet;

/**
 *
 * @author Hp
 */
public class MarketController {
    DbConnection dbConnection;
           
    public int insertMarket(Market market) {
    int id = market.getMarket_id();
    id++;
    String name = market.getMarket_name();
    String description = market.getMarket_description();
    String address = market.getMarket_address();
    String contact = market.getMarket_contact();
    String insertQuery = String.format(
            "insert into market(market_id, market_name, market_description, market_address, market_contact) values(%d,'%s','%s','%s','%s')",
            id,
            name, description, address, contact);
    System.out.println(insertQuery);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(insertQuery);
    return result;
}



public int updateMarket(int id1, String name1, String description1,String address1, String contact1) {
    int id=id1;
    String name =name1;
    String description=description1;
    String address =address1;
    String contact=contact1;
    String updateQuery = String.format(
            "update market set market_name='%s', market_description= '%s', market_address='%s', market_contact='%s' where market_id=%d",name, description,address,contact,id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(updateQuery);
    return result;
}

public int deleteMarket(int id1){
    int id =id1;
    String deleteQuery = String.format(
        "DELETE FROM market WHERE market_id=%d",id);
    dbConnection = new DbConnection();
    int result = dbConnection.manipulate(deleteQuery);
    return result;

}

public ResultSet fetchMarket(){
 
    String retrieveQuery = String.format(
            "SELECT market_name, market_description, market_address, market_contact FROM market");
    dbConnection = new DbConnection();
    ResultSet result = dbConnection.retrieve(retrieveQuery);
    return result;
}



    
}
