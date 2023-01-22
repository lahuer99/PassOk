package com.persist;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PasswdPersist {
//	should get this as env var?
	static private Path path=Paths.get("/home/rahul/eclipse-workspace/PassOk/localDB/passwd.txt");
	
	static public boolean saveToFile(String passwdTxt) {
//		need to create dir and the file if not exists already after user confirmation
		try {
			Files.writeString(path, passwdTxt, StandardCharsets.UTF_8);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	static public boolean saveToDB(String passwdTxt) {
		return true;
	}
}
