/*
Compilation: javac R16_ENV02_J.java
Execution: java R16_ENV02_J

 - Initial commit of non-compliant code
 - testing
 
 This noncompliant code example determines the username from an environmental variable. This is a vulnerability, as an attacker can alter the environmental variable.


 
*/

public class R16_ENV02_J {
	
	public static void main(String[] args) {
		String username = System.getenv("USER");
		System.out.println("The user name is " + username);
	}
	
}