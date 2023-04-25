package com.infoway.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	 private int cid;        
	 private String cname;      
	 private String cphone;     
	 private String cemail;     
	 private String cpassword;  
	 private String citypincode;
	 
	 public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(int cid, String cname, String cphone, String cemail, String cpassword, String citypincode) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.cemail = cemail;
		this.cpassword = cpassword;
		this.citypincode = citypincode;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getCitypincode() {
		return citypincode;
	}

	public void setCitypincode(String citypincode) {
		this.citypincode = citypincode;
	}

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", cemail=" + cemail
				+ ", cpassword=" + cpassword + ", citypincode=" + citypincode + "]";
	}
	 
	 

}
