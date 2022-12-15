/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class Park {
    
    private int park_id;
    private String park_name;
    private String park_description;
    private String park_address;
    private String park_contact;

    // creation of public getter and setter --> for id
	public int getPark_id() {              
		return this.park_id;
                
	}

	public void setPark_id(int park_id) {
		this.park_id = park_id;
	}

    // creation of public getter and setter --> for name
	public String getPark_name() {
		return this.park_name;
	}

	public void setPark_name(String park_name) {
		this.park_name = park_name;
	}

    // creation of public getter and setter --> for description
	public String getPark_description() {
		return this.park_description;
	}

	public void setPark_description( String park_description) {
		this.park_description = park_description;
	}

    // creation of public getter and setter --> for address
	public String getPark_address() {
		return this.park_address;
	}

	public void setPark_address(String park_address) {
		this.park_address = park_address;
	}

    // creation of public getter and setter --> for contact
	public String getPark_contact() {
		return this.park_contact;
	}

	public void setPark_contact(String park_contact) {
		this.park_contact = park_contact;
	}
    
      public Park(int park_id, String park_name, String park_description, String park_address, String park_contact){
        this.park_id = park_id;
        this.park_name = park_name;
        this.park_description = park_description;
        this.park_address = park_address;
        this.park_contact = park_contact;
    }  
        
        
}
