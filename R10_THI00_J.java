/*
Compilation: javac R07_ERR01_J.java
Execution: java R07_ERR01_J

 - Initial commit of non-compliant code
 - testing
 
 The non-compliant code explicitly invokes run() in the context of the current thread, thus the newly created thread
 is never started because of the incorrect assumption that run() starts the new thread.
 
 
*/


public final class R10_THI00_J implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
	  
	System.out.println("The non-compliant code explicitly invokes run() in the context of the current thread, thus the newly created thread is never started because of the incorrect assumption that run() starts the new thread.");
    R10_THI00_J foo = new R10_THI00_J();
    new Thread(foo).run();
	
  }
}