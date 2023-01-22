package com.main;

import java.util.Scanner;

import com.model.Passwd;
import com.persist.PasswdPersist;
import com.util.PasswdUtil;

public class Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="777aSdjkh#gbf7";//sc.next();
		
		System.out.println(str);
		
		Passwd pwd=new Passwd(str);
		PasswdUtil pwdUtil=new PasswdUtil();
//		how to set strength on initialization of object itself??
//		calling methods from constr is bad practice
		pwdUtil.calcAndSetPasswdStrength(pwd);
		System.out.println(pwd.getPasswdStrength());
		System.out.println(pwd.getPasswdStrengthBar());
//		currently have strength and strengthBar to show bar and green/red over text in UI
		if(pwd.getPasswdStrength()>1) {//get strength
			//suggest modified passwd for same
			PasswdPersist.saveToFile(pwd.getPasswdText());
			System.out.println("gu");
		}else {
//			accept passwd
			System.out.println("nu");
		}
		
	}

}