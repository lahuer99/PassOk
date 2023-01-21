package com.main;

import java.util.Scanner;

import com.model.Passwd;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="6asdjkh#gbf7";//sc.next();
		
		System.out.println(str);
		
		Passwd pwd=new Passwd(str);
		
//		how to set strength on initialization of object itself??
//		calling methods from constr is bad practice
		pwd.calcAndSetPasswdStrength();
				
		if(pwd.getPasswdStrength()>1) {//get strength
			//suggest modified passwd for same
			System.out.println("gu");
		}else {
//			accept passwd
			System.out.println("nu");
		}
		
	}

}