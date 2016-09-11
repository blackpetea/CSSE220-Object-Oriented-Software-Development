package textCalculator;

public class Division implements Function{

	public Division() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public double evaluate(double[] inputs) {
		double res=inputs[0];
		for (int i=1;i<inputs.length;i++) {
			res=res/inputs[i];
		}
		return res;
	}

	@Override
	public String getFunctionName() {
		// TODO Auto-generated method stub.
		return "Division";
	}

}
