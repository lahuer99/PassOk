package com.model;

import java.util.regex.Matcher;

public class Passwd{//check serialization -bytestream,ciphers??
	private String passwdText;
	private int passwdStrength;
	private int dateAdded;
	private int dateLastModified;
	private int[] passwdStrengthBar=new int[]{-1,-1,-1,-1,-1};

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
	public int[] getPasswdStrengthBar() {
		return passwdStrengthBar;
	}

	public void setPasswdStrengthBar(int[] passwdStrengthBar) {
		this.passwdStrengthBar = passwdStrengthBar;
	}

	public String showModBetterPasswd() {
//		should return the modified better version of this passwd
//		ex : noob => N00b,nOoB,nO0b,nOOB1
		return passwdText;
	}
	
}