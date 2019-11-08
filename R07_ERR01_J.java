/*
Compilation: javac R07_ERR01_J.java
Execution: java R07_ERR01_J

 - Initial commit of non-compliant code
 - testing
 - fixed code to be compliant
 
 
*/

import java.io.*;

public class R07_ERR01_J {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("This program will attempt to open a file that doesnt exist. The non-compliant version will throw an exception that exposes sensitive information. The compliant version shall prevent exposing any sensitive information.");
		String test = "purposefully wrong file";
		File file = null;
		try {
			file = new File(System.getenv("APPDATA") +
             test).getCanonicalFile();
		if (!file.getPath().startsWith("c:\\homepath")) {
			System.out.println("Invalid file");
			return;
		}
			} catch (IOException x) {
		System.out.println("Invalid file");
		return;
		}
 
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException x) {
		System.out.println("Invalid file");
		return;
		}
		
	}
	

	
}
