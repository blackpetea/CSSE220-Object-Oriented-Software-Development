/**
 * This class runs the SumArrayInParallel application.
 * 
 * @author wilkin. Updated by defoe on Nov 9, 2015 
 *
 */
public class Main {
	public static void main(String[] args) {
		int n = 200000000;
		int numThreads = 4;
		long startTime = System.currentTimeMillis();
		Data data = new Data();
		//TODO 3 set data will need numThreads as a second argument Step 3
		data.setData(n, numThreads);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Done creating array, took " + 
		                    (endTime-startTime)  + " ms");
		System.out.flush();
		
		
		startTime = System.currentTimeMillis();
		long c = sumSerial(data);
		endTime = System.currentTimeMillis();
		
		System.out.println("Done summing array serially, took "+ 
                (endTime-startTime) + " ms");
		
		//TODO 4F call sumParallel here, step 4(F)
		startTime = System.currentTimeMillis();
		long d = sumParallel(data, numThreads);
		endTime = System.currentTimeMillis();
		
		System.out.println("Done summing array in parallel, took "+ 
                (endTime-startTime) + " ms");
		
		
		System.out.println("The two sums are " + (d==c?"":"not ") + "equal " + d + " " + c);
	}
	
	public static long sumSerial(Data data) {
		long result = 0;
		for(int i = 0; i < data.a.length; i++)
			result += data.a[i];
		return result;
	}
	
	//TODO 4E method sumParallel(...) goes here, steps 4(E) and 6
	//TODO 6
	public static long sumParallel(Data data, int numThreads) {
		int size = data.a.length;
		int divider = size / numThreads;
		Thread[] threads = new Thread[numThreads];
		for(int i = 0; i < numThreads; i++) {
			int start = i*divider;
			int stop = (i+1)*divider;
			Runnable r = new SumThread(data, start, stop, i);
			threads[i] = new Thread(r);
			threads[i].start();
		}
		//TODO now just wait for them to finish...
		for(int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//TODO now just sum up the sums from the individual threads and done
		long sum = 0;
		for(int i = 0; i < data.b.length; i++)
			sum += data.b[i];
		return sum;
	}
}
