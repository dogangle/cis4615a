/*
Compilation: javac R49_MSC01_J.java
Execution: java R49_MSC01_J

 - Initial commit of non-compliant code
 - testing
 - fixed code to be compliant
 
This code is non-compliant because it performs an infinite empty loop.
 
*/


public class R49_MSC01_J {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		R49_MSC01_J test = new  R49_MSC01_J();
		System.out.println("This compliant code utilizes an empty infinite loop by properly invoking Thread.sleep() within the loop");
		test.nop();
	}
	
	public void nop() throws InterruptedException {
		int duration = 10000;
		while(true) {
			Thread.sleep(duration);
		}
	}
	
}