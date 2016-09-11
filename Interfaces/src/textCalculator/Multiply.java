package textCalculator;

public class Multiply implements Function{

	public Multiply() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public double evaluate(double[] inputs) {
		double res=1;
		for (double num:inputs) {
			res=res*num;
		}
		return res;
	}

	@Override
	public String getFunctionName() {
		// TODO Auto-generated method stub.
		return "Multiply";
	}

}
