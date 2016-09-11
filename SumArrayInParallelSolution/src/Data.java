class Data {
	public int[] a;
	//TODO Some changes were necessary in this class
	public long[] b;
	
	public void setData(int n, int numThreads) {
		this.a = new int[n];
		this.b = new long[numThreads];
		for(int i = 0; i < n; i++) {
			double randSign = Math.random();
			double randVal = Math.random();
			int sign = (randSign < 0.5) ? -1 : 1;
			a[i] = (int)(randVal * n) * sign;
		}
		// Changes were made here
		for(int i = 0; i < numThreads; i++)
			b[i] = 0;
	}
}
