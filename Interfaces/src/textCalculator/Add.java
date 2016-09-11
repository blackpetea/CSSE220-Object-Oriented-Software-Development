package textCalculator;

public class Add implements Function{

	public Add() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public double evaluate(double[] inputs) {
		double sum=0;
		for (double num:inputs) {
			sum+=num;
		}
		return sum;
	}

	@Override
	public String getFunctionName() {
		// TODO Auto-generated method stub.
		return "Add";
	}

}
