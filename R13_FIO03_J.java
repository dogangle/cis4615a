/*
Compilation: javac R13_FIO03_J.java
Execution: java R13_FIO03_J

 - Initial commit of non-compliant code
 - testing
 
This program creates a temporary file and checks to see if it still exists after its purpose has been filled.
 
 
*/

import java.io.*;
import java.nio.*;

public class R13_FIO03_J {
	
  public static void main(String[] args) throws IOException{

	System.out.println("The non-compliant code will not delete the temp file after it is done.");
    Path tempFile = null;
    try {
      tempFile = Files.createTempFile("tempnam", ".tmp");
      try (BufferedWriter writer =
          Files.newBufferedWriter(tempFile, Charset.forName("UTF8"),
                                  StandardOpenOption.DELETE_ON_CLOSE)) {
        // Write to file
      }
      System.out.println("Temporary file write done, file erased");
    } catch (FileAlreadyExistsException x) {
      System.err.println("File exists: " + tempFile);
    } catch (IOException x) {
      // Some other sort of failure, such as permissions.
      System.err.println("Error creating temporary file: " + x);
    }
	
	if (tempFile.exists()) {
		System.out.println("The temporary file still exists.");
	}
	else {
		System.out.println("The temporary file does not exist.");
	}
  }
}