package com.model;

import java.io.Serializable;

public class Passwd implements Serializable{//check serialization
	private String passwdText;
	private int passwdStrength;
	
	public String getPasswdText() {
		return passwdText;
	}
	public void setPasswdText(String passwdText) {
		this.passwdText = passwdText;
	}
	public int getPasswdStrength() {
		return passwdStrength;
	}
	public void setPasswdStrength(int passwdStrength) {
		this.passwdStrength = passwdStrength;
	}
	
	public void calcAndSetPasswdStrength() {
		//length>8,upper and lowercase,numbers,special characters
		int currStr=-1;
		
		setPasswdStrength(currStr);
	}
}