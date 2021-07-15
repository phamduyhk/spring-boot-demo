package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
    @Id
    private long member_id;
    
    private String user_id;
    
    private String password;
    
    private String family_name;
    
    private String given_name;
    
    private String post_code;
    
    private String address;
    
    private String email;
    
    private String phone_number;
    
    private String reset_password_id;

	public long getMember_id() {
		return member_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getPassword() {
		return password;
	}

	public String getFamily_name() {
		return family_name;
	}

	public String getGiven_name() {
		return given_name;
	}

	public String getPost_code() {
		return post_code;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getReset_password_id() {
		return reset_password_id;
	}
   
}