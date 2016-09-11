
public class Father extends Grandfather {
	int testObj;
	public static final String[] directions=new String[]{"A","B","C"};
	
	public Father() {
		super();
	}
	
	private int father=2;
	
	public void setFather(int num) {
		this.father=num;
	}
	
	
	public int getFather() {
		return this.father;
	}

}
