package database;



import javax.swing.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnection {

    


    public static Connection getConnection(){
        Connection conn =null;

        try {

            

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(

                    "jdbc:mysql://sql12.freesqldatabase.com/","sql12580135","iXijQSnNa5");



            return conn;

        }catch (Exception ex){

            System.out.println("There were errors connection to db.");
            return null;

        }

    }



    // Via the use of sql query

    // insert, update and delete




    public static void main(String[] args) {

        new DbConnection();

    }

}