package com.model;

import java.io.Serializable;

public class Passwd implements Serializable{//check serialization
	private String passwdText;
	private int passwdStrength;
	
	public Passwd(String passwdText) {
		super();
		this.passwdText = passwdText;
	}
	
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
		int currStre=-1;
		
		if(passwdText.length()>8) {
			currStre++;
		}
	
//		use regex for uppercase and lowercase
		if(passwdText.contains(passwdText)) {
			
		}
		
//		use regex for nos
		
		setPasswdStrength(currStre);
	}
	
	public String showModBetterPasswd() {
//		should return the modified better version of this passwd
//		ex : noob => N00b,nOoB,nO0b,nOOB1
		return passwdText;
	}
	
}