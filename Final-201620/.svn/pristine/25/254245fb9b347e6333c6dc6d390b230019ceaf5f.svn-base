import java.util.HashMap;

public class HashMapProblem {
	/**
	 * Given a map of element abbreviations to their weight, calculate the
	 * weight of the given formula.
	 * 
	 * The formula is represented as a HashMap of element abbreviations to the
	 * number of atoms of that element in the formula. H2O would be represented
	 * as:
	 * 
	 * { "H" -> 2, "O" -> 1 }
	 * 
	 * The map of weights would contain items such as:
	 * 
	 * weights = {"H" -> 1.01, "O" -> 16.00 }
	 * 
	 * The result of the call:
	 * 
	 * calculateMolecularWeight(weights, formula) -> 18.02
	 * 
	 * You can assume that the weights map given will contain all of the element
	 * abbreviations needed for the given formula.
	 * 
	 * @param weights
	 *            - map of the elemental weights
	 * @param formula
	 *            - the formula to calculate the weight of
	 * @return the molecular weight of the given formula
	 */
	public static double calculateMolecularWeight(HashMap<String, Double> weights, HashMap<String, Integer> formula) {

		double total = 0.0;
		for (String key : formula.keySet()) {
			total += weights.get(key) * formula.get(key);
		}

		return total;
	}

}
