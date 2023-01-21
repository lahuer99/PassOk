package com.model;

import java.util.regex.Matcher;

public class Passwd implements PasswdInterface{//check serialization -bytestream,ciphers??
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
		
		
//		use regex for nos
		if(containsNos()) {
			System.out.println("1nos");
			currStre++;
		}
		
//		use regex for spec
		if(containsSpecials()) {
			System.out.println("1spec");
			currStre++;
		}
		
		setPasswdStrength(currStre);
	}
	
	public String showModBetterPasswd() {
//		should return the modified better version of this passwd
//		ex : noob => N00b,nOoB,nO0b,nOOB1
		return passwdText;
	}

	@Override
	public boolean containsNos() {
		// TODO Auto-generated method stub
		Matcher nosMatcher=nosPattern.matcher(passwdText);
		if(nosMatcher.find()) {
			System.out.println("nos");
			return true;
		}
		return false;
	}

	@Override
	public boolean containsSpecials() {
		Matcher specialMatcher=specialPattern.matcher(passwdText);
		if(specialMatcher.find()) {
			System.out.println("spec");
			return true;
		}
		return false;
	}
	
}