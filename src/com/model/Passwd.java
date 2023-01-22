package com.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Passwd{//check serialization -bytestream,ciphers??
	private String passwdText;
	private int passwdStrength;
	private LocalDateTime dateAdded;
	private LocalDateTime dateLastModified;
	private int[] passwdStrengthBar=new int[]{-1,-1,-1,-1,-1};

	public Passwd(String passwdText,LocalDateTime currDT) {
		super();
		this.passwdText = passwdText;
		this.dateAdded=currDT.truncatedTo(ChronoUnit.SECONDS);
		this.dateLastModified=currDT.truncatedTo(ChronoUnit.SECONDS);
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

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public LocalDateTime getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(LocalDateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	public String showModBetterPasswd() {
//		should return the modified better version of this passwd
//		ex : noob => N00b,nOoB,nO0b,nOOB1
		return passwdText;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.passwdText+", "+this.passwdStrength+", "+this.dateAdded+", "+this.dateLastModified;
		}
	
}