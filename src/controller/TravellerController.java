package controller;

import database.DbConnection;
import model.Traveller;
import java.sql.*;
import javax.swing.*;



public class TravellerController{
    DbConnection dbConnection;

    public int insertTraveller(Traveller traveller) {
        int id = traveller.getTr_id();
        id++;
        String name = traveller.getTr_name();
        String email = traveller.getTr_email();
        String number = traveller.getTr_number();
        String pass = traveller.getTr_pass();
//        String pass1 = traveller.getTr_pass1();
        String insertQuery = String.format(
                "insert into registration_table(tr_id,tr_name,tr_email,tr_number,tr_pass) values(%d,'%s','%s','%s','%s')",
                id,
                name, email, number, pass);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public int updateTraveller(String email1, String number1,String password1) {
        String password=password1;
        String email =email1;
        String number=number1;
        String updateQuery = String.format(
                "update registration_table set tr_pass='%s' where tr_email= '%s' and tr_number='%s'",password ,email, number);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }
    
    public ResultSet retrieveTraveller(String email, String password){
 
        String retrieveQuery = String.format(
                "SELECT * FROM registration_table WHERE tr_email='%s' AND tr_pass='%s'",email,password);
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(retrieveQuery);
        return result;

    }
    public ResultSet validTraveller(String email, String number){
 
        String validQuery = String.format(
                "SELECT * FROM registration_table WHERE tr_email='%s' AND tr_number='%s'",email,number);
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(validQuery);
        return result;

    }
    
    
    
}