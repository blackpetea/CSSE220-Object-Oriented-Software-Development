import java.util.Scanner;


public class FindFactors {

	
	public static void findFactors(long rangeStart, long rangeEnd, long numberToFindFactorsOf) {
		//System.out.println("Starting Thread");
		System.out.println("Starting Thread\n"+"Finding factors of " + numberToFindFactorsOf + " in range " + rangeStart + "-" + rangeEnd + " (range size " + (rangeEnd - rangeStart) + ")");
		for(long i = rangeStart; i <= rangeEnd; i++) {
			if(numberToFindFactorsOf % i == 0) {
				System.out.println(i + " is a factor");
			}

		}
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Welcome to factor search!  Enter your query in the form NUMBER_TO_FACTOR MIN_RANGE MAX_RANGE NUMBER_OF_THREADS");
		Scanner s = new Scanner(System.in);
		final long numberToFactor = s.nextLong();
		final long startRange = s.nextLong();
		final long endRange = s.nextLong();
		long numberOfThreads = s.nextLong();
		
		final long gap=numberToFactor/numberOfThreads;
		
		for (int i=0;i<numberOfThreads;i++) {
			//48106390 2 48106390 3
			final long newStart=i*gap+startRange;
			final long newEnd;
			if (i+1==numberOfThreads) {
				newEnd=endRange;
			} else {
				newEnd=gap+newStart;
			}
			
			Runnable myRun=new Runnable(){

				@Override
				public void run() {
					
					findFactors(newStart, newEnd, numberToFactor);
					System.out.println("Ending Thread");
				}
				
			};
			(new Thread(myRun)).start();
			
		}
		//System.out.println("Factor finding complete");		
		

	}

}
