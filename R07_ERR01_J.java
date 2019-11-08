/*
Compilation: javac R07_ERR01_J.java
Execution: java R07_ERR01_J

 - Initial commit of non-compliant code
 - testing
 - 
 
 
*/

import java.io.*;

public class R07_ERR01_J {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("This program will attempt to open a file that doesnt exist. The non-compliant version will throw an exception that exposes sensitive information. The compliant version shall prevent exposing any sensitive information.");
		// Linux stores a user's home directory path in
		// the environment variable $HOME, Windows in %APPDATA%
		String test = "purposefully wrong file";
		FileInputStream fis = new FileInputStream(System.getenv("APPDATA") + test);
		
	}
	

	
}
