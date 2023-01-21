package com.model;

import java.util.regex.Pattern;

//interface so that all common stuff at one place(ie, the patterns; mod=> can be changed here itself)
//all implementing should inherit these+the 2methods to be overridden
public interface PasswdInterface {
	static String nosRgx="\\d";
	static Pattern nosPattern=Pattern.compile(nosRgx);
	
//	[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-] -> og list
	static String specialRgx="[!@#$%&_/?]";
	static Pattern specialPattern=Pattern.compile(specialRgx);
	
	static String upperRgx="";
	static Pattern upperPattern=Pattern.compile(upperRgx);
	
	static String lowerRgx="";
	static Pattern lowerPattern=Pattern.compile(lowerRgx);
	
	public boolean containsNos();
	public boolean containsSpecials();
}
