/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class Tourist_area {
    
    private int tourist_area_id;
    private String tourist_area_name;
    private String tourist_area_description;
    private String tourist_area_address;
    private String tourist_area_contact;

    // creation of public getter and setter --> for id
	public int getTourist_area_id() {              
		return this.tourist_area_id;
                
	}

	public void setTourist_area_id(int tourist_area_id) {
		this.tourist_area_id = tourist_area_id;
	}

    // creation of public getter and setter --> for name
	public String getTourist_area_name() {
		return this.tourist_area_name;
	}

	public void setTourist_area_name(String tourist_area_name) {
		this.tourist_area_name = tourist_area_name;
	}

    // creation of public getter and setter --> for description
	public String getTourist_area_description() {
		return this.tourist_area_description;
	}

	public void setTourist_area_description( String tourist_area_description) {
		this.tourist_area_description = tourist_area_description;
	}

    // creation of public getter and setter --> for address
	public String getTourist_area_address() {
		return this.tourist_area_address;
	}

	public void setTourist_area_address(String tourist_area_address) {
		this.tourist_area_address = tourist_area_address;
	}

    // creation of public getter and setter --> for contact
	public String getTourist_area_contact() {
		return this.tourist_area_contact;
	}

	public void setTourist_area_contact(String tourist_area_contact) {
		this.tourist_area_contact = tourist_area_contact;
	}
    
      public Tourist_area(int tourist_area_id, String tourist_area_name, String tourist_area_description, String tourist_area_address, String tourist_area_contact){
        this.tourist_area_id = tourist_area_id;
        this.tourist_area_name = tourist_area_name;
        this.tourist_area_description = tourist_area_description;
        this.tourist_area_address = tourist_area_address;
        this.tourist_area_contact = tourist_area_contact;
    }  
        
        
    
}
