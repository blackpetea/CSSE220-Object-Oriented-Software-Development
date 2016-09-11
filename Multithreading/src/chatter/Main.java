package chatter;

/**
 * This is the main starting point for the Chatter example.
 *
 * @author Curt Clifton.
 *         Created Nov 9, 2009.
 */
public class Main {

	/**
	 * Starts the chatter.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
/*		Runnable r1 = new Chatter("foo", 60);
		Runnable r2 = new Chatter("bar", 120);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		Runnable r3 =new Ranter("Ranter");
		
		Thread t3=new Thread(r3);
		
		t3.start();*/
		
		Runnable r4 =new ShortTalker();
		
		Thread t4=new Thread(r4);
		
		t4.start();
		
		// TODO 2: Write the class ShortTalker, then add it as
		// a class as well.  (A description of how ShortTalker
		// should work is in the class itself)
		
		System.out.println("***Main function finished!***");
	}

}
