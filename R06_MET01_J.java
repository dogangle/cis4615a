/*****************************************
	Compilation: javac R06_MET01_J.java
	Execution: java R06_MET01_J.java
	
	 - Initial commit of non-compliant code
	 - Testing
	
	Calls function getAbsAdd with legal and illegal integer values..
	
*/

public class R06_MET01_J {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("a = " + a);
		int b = 20;
		System.out.println("b = " + b);
		int c = getAbsAdd(a, b);
		System.out.println("c = " + c);
		
		a = Integer.MIN_VALUE;
		System.out.println("a = " + a);
		b = Integer.MAX_VALUE;
		System.out.println("b = " + b);
		c = getAbsAdd(a, b);
		System.out.println("c = " + c);
		
	}
	
	public static int getAbsAdd(int x, int y) {
		
		return Math.abs(x) + Math.abs(y);
	}
	
}