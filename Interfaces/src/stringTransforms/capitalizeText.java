package stringTransforms;

public class capitalizeText implements TransformInterface {

	public capitalizeText() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public String transform(String text) {
		return text.toUpperCase();
	}

}
