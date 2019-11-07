/*
Compilation: javac R02_XP00_J.java
Execution: java R02_XP00_J

- Initial commit of non-compliant code with testing

Attempts to delete the file while it is currently being written to (impossible), then attempts to delete the file normally.
Non-compliant code will not differentiate between the two, while the compliant code will check if the method successfully deleted the file.
*/

import java.io.*;

public class R02_XP00_J {
	
 	public static void main(String[] args) {
		
		try {
		BufferedWriter out = new BufferedWriter(new FileWriter("someFileName.txt"));
		out.write("blah");
		deleteFile();
		out.close();
		deleteFile();
		} catch (IOException e) { }
	} 
	
	public static void deleteFile() {
		
		File someFile = new File("someFileName.txt");
		// Do something with someFile
		someFile.delete();
	}
	
}