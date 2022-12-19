public ResultSet fetchMarket(){
 
    String retrieveQuery = String.format(
            "SELECT market_name, market_description, market_address, market_contact FROM market");
    dbConnection = new DbConnection();
    ResultSet result = dbConnection.retrieve(retrieveQuery);
    return result;
}

