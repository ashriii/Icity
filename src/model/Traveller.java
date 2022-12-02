package model;

public class Traveller{
    // creation of instance variable
    private int tr_id;
    private String tr_name;
    private String tr_email;
    private String tr_number;
    private String tr_pass;
    private String tr_pass1;

    // creation of public getter and setter --> for student ID
	public int getTr_id() {
		return this.tr_id;
	}

	public void setTr_id(int tr_id) {
		this.tr_id = tr_id;
	}

    // creation of public getter and setter --> for student Name
	public String getTr_name() {
		return this.tr_name;
	}

	public void setTr_name(String tr_name) {
		this.tr_name = tr_name;
	}

    // creation of public getter and setter --> for student Age
	public String getTr_email() {
		return this.tr_email;
	}

	public void setTr_email( String tr_email) {
		this.tr_email = tr_email;
	}

    // creation of public getter and setter --> for student Address
	public String getTr_number() {
		return this.tr_number;
	}

	public void setTr_number(String tr_number) {
		this.tr_number = tr_number;
	}

    // creation of public getter and setter --> for student Contact
	public String getTr_pass() {
		return this.tr_pass;
	}

	public void setTr_pass(String tr_pass) {
		this.tr_pass = tr_pass;
	}
        
        public String getTr_pass1() {
		return this.tr_pass1;
	}

	public void setTr_pass1(String tr_pass1) {
		this.tr_pass1 = tr_pass1;
	}



    // creation of public constructor
    public Traveller(int tr_id, String tr_name, String tr_email, String tr_number, String tr_pass, String tr_pass1){
        this.tr_id = tr_id;
        this.tr_name = tr_name;
        this.tr_email = tr_email;
        this.tr_number = tr_number;
        this.tr_pass = tr_pass;
        this.tr_pass1 = tr_pass1;
    }


}