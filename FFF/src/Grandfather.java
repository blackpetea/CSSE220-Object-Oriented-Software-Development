
public class Grandfather implements TestInterface{
	
	private int grandfather=3;
	
	public void setGrandfather(int num) {
		this.grandfather=num;
	}
	
	public int getGradfather() {
		return this.grandfather;
	}

	public Grandfather() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public void interfaceFunction() {
		System.out.println("Grandfather's interface function");
		
	}

}
