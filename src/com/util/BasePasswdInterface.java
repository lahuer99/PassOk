package com.util;

import java.util.regex.Pattern;

//interface so that all common stuff at one place(ie, the patterns; mod=> can be changed here itself)
//all implementing should inherit these+the 2methods to be overridden
public interface BasePasswdInterface {
	static String nosRgx="\\d";
	static Pattern nosPattern=Pattern.compile(nosRgx);
	
//	[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-] -> og list
	static String specialRgx="[!@#$%&_/?]";
	static Pattern specialPattern=Pattern.compile(specialRgx);
	
	static String upperRgx="[A-Z]+";
	static Pattern upperPattern=Pattern.compile(upperRgx);
	
	static String lowerRgx="[a-z]+";
	static Pattern lowerPattern=Pattern.compile(lowerRgx);
	
	public boolean containsNos();
	public boolean containsSpecials();
	public boolean containsUpper();
	public boolean containsLower();
}
