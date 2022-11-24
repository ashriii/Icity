package database;



import javax.swing.*;

import java.sql.*;



public class DbConnection {

    public Connection connection;

    Statement statement;

    ResultSet resultSet;

    int value;



    public DbConnection(){

        try {

            String username = "sql12580135";

            String password = "iXijQSnNa5";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(

                    "jdbc:mysql://sql12.freesqldatabase.com/sql12580135",username,password);



                    if(connection!=null){

                        System.out.println("Connected to online database");

                    }else{

                        System.out.println("Error connecting to database");

                    }

            statement = connection.createStatement();

        }catch (Exception e){

            e.printStackTrace();

        }

    }



    // Via the use of sql query

    // insert, update and delete

    public int executeQuery(String query){

        try {

            value = statement.executeUpdate(query);

            connection.close();

        }catch (SQLIntegrityConstraintViolationException ex){

            JOptionPane.showMessageDialog(null, "These details already exist!");

        }catch (SQLException e){

            e.printStackTrace();

        }

        return value;

    }



    public ResultSet fetchData(String query){

        try {

            resultSet = statement.executeQuery(query);

        }catch (SQLException e){

            e.printStackTrace();

        }

        return resultSet;

    }



    public static void main(String[] args) {

        new DbConnection();

    }

}