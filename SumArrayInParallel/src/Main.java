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
		final Data data = new Data();
		// TODO 3 set data will need numThreads as a second argument Step 3
		data.setData(n, numThreads);
		long endTime = System.currentTimeMillis();

		System.out.println("Done creating array, took " + (endTime - startTime) + " ms");
		System.out.flush();

		startTime = System.currentTimeMillis();
		//long c = sumSerial(data);

		Thread[] allThreads = new Thread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			final int startIndex = i * (data.a.length / numThreads);
			final int endIndex = i < numThreads - 1 ? (i + 1) * (data.a.length / numThreads) : data.a.length;
			final int outputIndex = i;

			Thread currentThread = new Thread(new Runnable() {

				@Override
				public void run() {
					long result = sumParalell(data, startIndex, endIndex);
					data.b[outputIndex] = result;
				}

			});
			allThreads[i] = currentThread;
			currentThread.start();
		}

		for (int i = 0; i < numThreads; i++) {
			try {
				allThreads[i].join();
			} catch (InterruptedException e) {
				throw new RuntimeException("Never just print put an exception");
			}
		}
		
		long overallResult=0;
		for (int i=0;i<numThreads;i++) {
			overallResult+=data.b[i];
		}
		
		endTime = System.currentTimeMillis();

		System.out.println("Done summing array serially, took " + (endTime - startTime) + " ms");
		System.out.flush();
		
		// TODO 4F call sumParallel here, step 4(F)
	}

	public static long sumSerial(Data data) {
		long result = 0;
		for (int i = 0; i < data.a.length; i++)
			result += data.a[i];
		return result;
	}

	// TODO 4E method sumParallel(...) goes here, steps 4(E) and 6
	// TODO 6

	public static long sumParalell(Data data, int startIndex, int endIndex) {
		long result = 0;
		for (int i = startIndex; i < endIndex; i++)
			result += data.a[i];
		return result;
	}
}
