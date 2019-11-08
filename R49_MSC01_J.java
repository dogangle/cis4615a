/*
Compilation: javac R49_MSC01_J.java
Execution: java R49_MSC01_J

 - Initial commit of non-compliant code
 - testing
 
This code is non-compliant because it performs an infinite empty loop.
 
*/


public class R49_MSC01_J {
	
	
	public static void main(String[] args) {
		
		R49_MSC01_J test = new  R49_MSC01_J();
		test.nop();
	}
	
	public void nop() {
		while(true) {
		}
	}
	
}