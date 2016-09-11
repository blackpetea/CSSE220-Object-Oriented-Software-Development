package stringTransforms;

public class removeLettersFromText implements TransformInterface {
	private String letter;

	public removeLettersFromText(String let) {
		this.letter = let;
	}

	@Override
	public String transform(String text) {
		return text.replace(this.letter, "");
	}

}
