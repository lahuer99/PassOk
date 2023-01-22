package com.util;

import java.time.LocalDateTime;
import java.util.regex.Matcher;

import com.model.Passwd;

public class PasswdUtil implements BasePasswdInterface{
	private String passwdText;
	public void calcAndSetPasswdStrength(Passwd passwd) {
		passwdText=passwd.getPasswdText();
		int[] passwdStrengthBar=new int[] {-1,-1,-1,-1,-1};
		//length>8,upper and lowercase,numbers,special characters
		int currStre=0;
		
//		passwd length>8
		if(passwdText.length()>8) {
			currStre++;
			passwdStrengthBar[0]=1;
		}
	
//		use regex for uppercase and lowercase
		if(containsUpper()) {
			System.out.println("1up");
			passwdStrengthBar[1]=1;
			currStre++;
		}
		if(containsLower()) {
			System.out.println("1lw");
			passwdStrengthBar[2]=1;
			currStre++;
		}
		
//		use regex for nos
		if(containsNos()) {
			System.out.println("1nos");
			passwdStrengthBar[3]=1;
			currStre++;
		}
		
//		use regex for spec
		if(containsSpecials()) {
			System.out.println("1spec");
			passwdStrengthBar[4]=1;
			currStre++;
		}
		
		passwd.setPasswdStrength(currStre);
		passwd.setPasswdStrengthBar(passwdStrengthBar);
//		should happen if new passwd != old passwd
		//		passwd.setDateLastModified(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
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

	@Override
	public boolean containsUpper() {
		Matcher specialMatcher=upperPattern.matcher(passwdText);
		if(specialMatcher.find()) {
			System.out.println("up");
			return true;
		}
		return false;
	}

	@Override
	public boolean containsLower() {
		Matcher specialMatcher=lowerPattern.matcher(passwdText);
		if(specialMatcher.find()) {
			System.out.println("lw");
			return true;
		}
		return false;
	}

	
}
