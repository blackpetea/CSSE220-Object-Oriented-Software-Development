
public class Son extends Father {

	public Son() {
		super();
	}
	
	private int son=1;
	
	public void setSon(int num) {
		this.son=num;
	}
	
	public int getSon() {
		return this.son;
	}
	
	public void testfunction(int speed,int testnum) {
		System.out.println("Speed:"+speed+"Direction:"+this.directions[this.testObj]);
	}

}
