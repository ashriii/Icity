public ResultSet fetchOffice(){
 
    String retrieveQuery = String.format(
            "SELECT office_name, office_description, office_address, office_contact FROM office");
    dbConnection = new DbConnection();
    ResultSet result = dbConnection.retrieve(retrieveQuery);
    return result;
}

