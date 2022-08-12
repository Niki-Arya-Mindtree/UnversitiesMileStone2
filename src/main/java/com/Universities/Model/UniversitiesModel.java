package com.Universities.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Universities")
public class UniversitiesModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Uniid;
	@Column(name="Uniname")
	private String Uniname;
	@Column(name="Unipasspercentage")
	private int Unipasspercentage;
	@Column(name="Uniaddress")
	private String Uniaddress;
	
	
	public UniversitiesModel() {
		super();
	}


	public UniversitiesModel(Integer uniid, String uniname, int unipasspercentage, String uniaddress) {
		super();
		Uniid = uniid;
		Uniname = uniname;
		Unipasspercentage = unipasspercentage;
		Uniaddress = uniaddress;
	}


	public Integer getUniid() {
		return Uniid;
	}


	public void setUniid(Integer uniid) {
		Uniid = uniid;
	}


	public String getUniname() {
		return Uniname;
	}


	public void setUniname(String uniname) {
		Uniname = uniname;
	}


	public int getUnipasspercentage() {
		return Unipasspercentage;
	}


	public void setUnipasspercentage(int unipasspercentage) {
		Unipasspercentage = unipasspercentage;
	}


	public String getUniaddress() {
		return Uniaddress;
	}


	public void setUniaddress(String uniaddress) {
		Uniaddress = uniaddress;
	}

	@Override
	public String toString() {
		return "UniversitiesModel [Uniid=" + Uniid + ", Uniname=" + Uniname + ", Unipasspercentage=" + Unipasspercentage
				+ ", Uniaddress=" + Uniaddress + "]";
	}
	
	
}
