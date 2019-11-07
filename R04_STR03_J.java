/*****************************************
	Compilation: javac R04_STR03_J.java
	Execution: java R04_STR03_J.java
	
	 - Initial commit of non-compliant code
	 - Testing
	
	Prints BigInteger x before and after it has been encoded as a String and then converted
	back to BigInteger.
	
*/

import java.math.*;

public class R04_STR03_J {
	
	
	public static void main(String[] args) {
	
	BigInteger x = new BigInteger("530500452766");
	System.out.println("Big Integer = " + x);
	String s = x.toString();  // Valid character data
	byte[] byteArray = s.getBytes();
	String ns = new String(byteArray); 
	x = new BigInteger(ns);
	System.out.println("Big Integer = " + x);
	
	}
	
}