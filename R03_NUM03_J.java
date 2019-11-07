/*****************************************
	Compilation: javac R03_NUM03_J.java
	Execution: java R03_NUM03_J.java
	
	 - Initial commit of non-compliant code
	 - Testing
	
	Calls function getInteger(DataInputStream is) with an illegal value.
	
*/

import java.io.*;

public class R03_NUM03_J {
	
	public static void main(String[] args) throws IOException {
		
		long illegal = 0xFFFFFFFFL;
		System.out.println("Illegal integer value = " + illegal);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\file.txt"));
		dos.writeInt((int) illegal);
		dos.close();
		
		DataInputStream is = new DataInputStream(new FileInputStream("c:\\file.txt"));
		System.out.println("Illegal value = " + getInteger(is));
		is.close();
		
	}
	
	public static int getInteger(DataInputStream is) throws IOException {
		return is.readInt();
	}
	
}