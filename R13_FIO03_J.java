/*
Compilation: javac R13_FIO03_J.java
Execution: java R13_FIO03_J

 - Initial commit of non-compliant code
 - testing
 
This program creates a temporary file and checks to see if it still exists after its purpose has been filled.
 
 
*/
import java.io.*;

public class R13_FIO03_J {
	
  public static void main(String[] args) throws IOException{
    File f = new File("tempnam.tmp");
	System.out.println("The non-compliant code will not delete the temp file after it is done.");
    if (f.exists()) {
      System.out.println("This file already exists");
      return;
    }
 
    FileOutputStream fop = null;
    try {
      fop = new FileOutputStream(f);
      String str = "Data";
      fop.write(str.getBytes());
    } finally {
      if (fop != null) {
        try {
          fop.close();
        } catch (IOException x) {
          // Handle error
        }
      }
    }
	
	if (f.exists()) {
		System.out.println("The temporary file still exists.");
	}
	else {
		System.out.println("The temporary file does not exist.");
	}
  }
}