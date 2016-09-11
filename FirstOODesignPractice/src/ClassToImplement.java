
public class ClassToImplement {

	private int myField;
	private boolean testThing;

	public ClassToImplement() {

	}

	public String returnProvidedString(String s) {
		return s;
	}

	private int addTwoNumbers(int a, int b) {
		this.myField=a+b;
		return this.myField;
	}

	private boolean returnTestThing() {
		this.testThing=false;
		return this.testThing;
	}

}
