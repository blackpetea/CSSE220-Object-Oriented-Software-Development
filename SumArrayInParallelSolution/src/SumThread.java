//TODO 4A SumThread class goes here step 4(A)
class SumThread implements Runnable {
	private Data data;
	private int start;
	private int stop;
	private int threadID;
	
	public SumThread(Data data, int start, int stop, int threadID){
		this.data = data;
		this.start = start;
		this.stop = stop;
		this.threadID = threadID;
	}

	@Override
	public void run() {
		for(int i = this.start; i < this.stop; i++) {
			data.b[this.threadID] += data.a[i];
		}
	}
	
}