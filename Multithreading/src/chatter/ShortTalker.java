package chatter;

/**
 * This runnable class should print:
 * 
 * Message 1 of 3
 * 
 * wait 2 seconds
 * 
 * Message 2 of 3
 * 
 * wait 2 seconds
 * 
 * Message 3 of 3....I'm exiting forever
 * 
 * and then it should exit
 * 
 */
public class ShortTalker implements Runnable {
	private String message1="This is Message 1!";
	private String message2="This is Message 2!";
	private String message3="This is Message 3!";
	
	
	
	
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(this.message1);
				Thread.sleep(2000);
				System.out.println(this.message2);
				Thread.sleep(2000);
				System.out.println(this.message3);
			}
			
		} catch (InterruptedException ex) {
			
		}
		
	}
}
