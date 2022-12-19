public ResultSet fetchHospital(){
 
    String retrieveQuery = String.format(
            "SELECT hospital_name, hospital_description, hospital_address, hospital_contact FROM hospital");
    dbConnection = new DbConnection();
    ResultSet result = dbConnection.retrieve(retrieveQuery);
    return result;
}

