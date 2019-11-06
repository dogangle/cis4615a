/*
Compilation: javac R00_IDS03_J.java
Execution: java R00_IDS03_J

This is the initial commit, of non-compliant java code
*/

import java.util.logging.*;

public class R00_IDS03_J {


    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        boolean loginSuccessful = true;
        String username = "test";
        
        if (loginSuccessful) {    
          logger.severe("User login succeeded for: " + username);
               } else {
          logger.severe("User login failed for: " + username);
                }
    }
	
	/*
	Rule 00. Input Validation and Data Sanitization (IDS)
    DS03-J. Do not log unsanitized user input
	*/
}
