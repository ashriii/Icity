package controller;

import database.DbConnection;
import model.Traveller;

public class TravellerController{
    DbConnection dbConnection;

    public int insertTraveller(Traveller traveller) {
        int id = traveller.getTr_id();
        String name = traveller.getTr_name();
        String email = traveller.getTr_email();
        String number = traveller.getTr_number();
        String pass = traveller.getTr_pass();
        String pass1 = traveller.getTr_pass1();
        String insertQuery = String.format(
                "insert into tbl_student(tr_id,tr_name,tr_email,tr_number,tr_pass, tr_pass1) values(%d,'%s',%s,'%s',%s, %s)",
                id,
                name, email, number, pass, pass1);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public int updateTraveller(Traveller traveller) {
        int id = traveller.getTr_id();
        String name = traveller.getTr_name();
        String updateQuery = String.format(
                "update Registration_ set tr_name='%s' where tr_id = %d", name, id);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

}