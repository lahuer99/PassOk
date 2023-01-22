package com.util;

import com.model.Passwd;

public class PasswdUtil{	
	public void displayStrengthBar(Passwd passwd) {
		String barIcon="=";
		int amount=passwd.getPasswdStrength();
		String padding=new String(new char[5-amount]).replace("\0", " ");
		String finalBar=new String(new char[amount]).replace("\0", barIcon);
		System.out.println("["+finalBar+">"+padding+"]");
	}
	
	public String showModBetterPasswd(Passwd passwd) {
//		should return the modified better version of this passwd
//		ex : noob => N00b,nOoB,nO0b,nOOB1
		
		return "";
	}
	
		
}
