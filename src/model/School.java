/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class School {
    
    private int school_id;
    private String school_name;
    private String school_description;
    private String school_address;
    private String school_contact;

    // creation of public getter and setter --> for id
	public int getSchool_id() {              
		return this.school_id;
                
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

    // creation of public getter and setter --> for name
	public String getSchool_name() {
		return this.school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

    // creation of public getter and setter --> for description
	public String getSchool_description() {
		return this.school_description;
	}

	public void setSchool_description( String school_description) {
		this.school_description = school_description;
	}

    // creation of public getter and setter --> for address
	public String getSchool_address() {
		return this.school_address;
	}

	public void setSchool_address(String school_address) {
		this.school_address = school_address;
	}

    // creation of public getter and setter --> for contact
	public String getSchool_contact() {
		return this.school_contact;
	}

	public void setSchool_contact(String school_contact) {
		this.school_contact = school_contact;
	}
    
      public School(int school_id, String school_name, String school_description, String school_address, String school_contact){
        this.school_id = school_id;
        this.school_name = school_name;
        this.school_description = school_description;
        this.school_address = school_address;
        this.school_contact = school_contact;
    }  
        
        
    
}
