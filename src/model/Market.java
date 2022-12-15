/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class Market {
    
    private int market_id;
    private String market_name;
    private String market_description;
    private String market_address;
    private String market_contact;

    // creation of public getter and setter --> for id
	public int getMarket_id() {              
		return this.market_id;
                
	}

	public void setMarket_id(int market_id) {
		this.market_id = market_id;
	}

    // creation of public getter and setter --> for name
	public String getMarket_name() {
		return this.market_name;
	}

	public void setMarket_name(String market_name) {
		this.market_name = market_name;
	}

    // creation of public getter and setter --> for description
	public String getMarket_description() {
		return this.market_description;
	}

	public void setMarket_description( String market_description) {
		this.market_description = market_description;
	}

    // creation of public getter and setter --> for address
	public String getMarket_address() {
		return this.market_address;
	}

	public void setMarket_address(String market_address) {
		this.market_address = market_address;
	}

    // creation of public getter and setter --> for contact
	public String getTourist_area_contact() {
		return this.market_contact;
	}

	public void setMarket_contact(String market_contact) {
		this.market_contact = market_contact;
	}
    
      public Market(int market_id, String market_name, String market_description, String market_address, String market_contact){
        this.market_id = market_id;
        this.market_name = market_name;
        this.market_description = market_description;
        this.market_address = market_address;
        this.market_contact = market_contact;
    }  
        
        
    
}
