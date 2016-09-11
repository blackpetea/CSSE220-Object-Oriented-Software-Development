package stringTransforms;

public class repeatText implements TransformInterface {

	public repeatText() {
		// TODO Auto-generated constructor stub.
	}

	@Override
	public String transform(String text) {
		return text + text;
	}

}
