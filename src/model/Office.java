/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hp
 */
public class Office {
    private int office_id;
    private String office_name;
    private String office_description;
    private String office_address;
    private String office_contact;

    // creation of public getter and setter --> for id
	public int getOffice_id() {              
		return this.office_id;
                
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

    // creation of public getter and setter --> for name
	public String getOffice_name() {
		return this.office_name;
	}

	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

    // creation of public getter and setter --> for description
	public String getOffice_description() {
		return this.office_description;
	}

	public void setOffice_description( String office_description) {
		this.office_description = office_description;
	}

    // creation of public getter and setter --> for address
	public String getOffice_address() {
		return this.office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

    // creation of public getter and setter --> for contact
	public String getOffice_contact() {
		return this.office_contact;
	}

	public void setOffice_contact(String office_contact) {
		this.office_contact = office_contact;
	}
    
      public Office(int office_id, String office_name, String office_description, String office_address, String office_contact){
        this.office_id = office_id;
        this.office_name = office_name;
        this.office_description = office_description;
        this.office_address = office_address;
        this.office_contact = office_contact;
    }  
        
        
    
}
