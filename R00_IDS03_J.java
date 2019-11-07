/*
Compilation: javac R00_IDS03_J.java
Execution: java R00_IDS03_J

- Added testing
- Fixed code to be compliant
Calls function test(username) with legal and illegal usernames
*/

import java.util.logging.*;
import java.util.regex.Pattern;

public class R00_IDS03_J {


    public static void main(String[] args) {
        
		String legalUsername = "username";
		System.out.println("Legal Username = " + legalUsername);
		String illegalUsername = "#$%@#$!$";
		System.out.println("Illegal Username = " + illegalUsername);
        R00_IDS03_J login = new R00_IDS03_J();
		login.test(legalUsername);
		login.test(illegalUsername);

    }
	
	public void test(String username) {
		
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        boolean loginSuccessful = true;
        
        if (loginSuccessful) {    
          logger.severe("User login succeeded for: " + sanitizeUser(username));
               } else {
          logger.severe("User login failed for: " + sanitizeUser(username));
                }
	}
	
	private String sanitizeUser(String username) {
		return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
		}
	/*
	Rule 00. Input Validation and Data Sanitization (IDS)
	DS03-J. Do not log unsanitized user input
	*/
}