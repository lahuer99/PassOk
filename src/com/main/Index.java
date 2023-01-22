package com.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.model.Passwd;
import com.persist.PasswdPersist;
import com.util.PasswdUtil;
import com.util.strength.PasswdStrength;

public class Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PasswdUtil pwdUtil=new PasswdUtil();
		PasswdStrength pwdStr=new PasswdStrength();
		
		String str="777aSdjkhgbf7";//sc.next();		
		Passwd pwd=new Passwd(str,LocalDateTime.now());
		
//		how to set strength on initialization of object itself??
//		calling methods from constr is bad practice
		pwdStr.calcAndSetPasswdStrength(pwd);
		
		//		currently have strength and strengthBar to show bar and green/red over text in UI
		if(pwd.getPasswdStrength()>1) {//get strength
			//suggest modified passwd for same
			PasswdPersist.saveToFile(pwd.toString()+'\n');
			pwdUtil.displayStrengthBar(pwd);
			System.out.println("gu");
		}else {
//			accept passwd
			System.out.println("nu");
		}
		
	}

}