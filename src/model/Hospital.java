/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class Hospital {
    private int hospital_id;
    private String hospital_name;
    private String hospital_description;
    private String hospital_address;
    private String hospital_contact;

    // creation of public getter and setter --> for id
	public int getHospital_id() {              
		return this.hospital_id;
                
	}

	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}

    // creation of public getter and setter --> for name
	public String getHospital_name() {
		return this.hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

    // creation of public getter and setter --> for description
	public String getHospital_description() {
		return this.hospital_description;
	}

	public void setHospital_description( String hospital_description) {
		this.hospital_description = hospital_description;
	}

    // creation of public getter and setter --> for address
	public String getHospital_address() {
		return this.hospital_address;
	}

	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}

    // creation of public getter and setter --> for contact
	public String getHospital_contact() {
		return this.hospital_contact;
	}

	public void setHospital_contact(String hospital_contact) {
		this.hospital_contact = hospital_contact;
	}
    
      public Hospital(int hospital_id, String hospital_name, String hospital_description, String hospital_address, String hospital_contact){
        this.hospital_id = hospital_id;
        this.hospital_name = hospital_name;
        this.hospital_description = hospital_description;
        this.hospital_address = hospital_address;
        this.hospital_contact = hospital_contact;
    }  
        
        
        
}
