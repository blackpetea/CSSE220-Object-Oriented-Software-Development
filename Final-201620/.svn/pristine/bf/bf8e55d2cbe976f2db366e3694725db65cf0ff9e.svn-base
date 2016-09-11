import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class HashMapProblemTest {
	
	HashMap<String, Double> weights;

	@Before
	public void setUp() throws Exception {
		this.weights = new HashMap<String, Double>();
		this.weights.put("H", 1.01);
		this.weights.put("O", 16.00);
		this.weights.put("S", 32.07);
		this.weights.put("Na", 22.99);
		this.weights.put("C", 12.01);
	}
	
	@Test
	public void testCalculateWeight(){
		HashMap<String, Integer> H2OFormula = new HashMap<String, Integer>();
		H2OFormula.put("H", 2);
		H2OFormula.put("O", 1);

		HashMap<String, Integer> H2SO4Formula = new HashMap<String, Integer>();
		H2SO4Formula.put("H", 2);
		H2SO4Formula.put("S", 1);
		H2SO4Formula.put("O", 4);
		
		HashMap<String, Integer> NaC2H3O2Formula = new HashMap<String, Integer>();
		NaC2H3O2Formula.put("Na", 1);
		NaC2H3O2Formula.put("C", 2);
		NaC2H3O2Formula.put("H", 3);
		NaC2H3O2Formula.put("O", 2);

		assertEquals(18.02, HashMapProblem.calculateMolecularWeight(weights, H2OFormula), 0.01);
		assertEquals(98.09, HashMapProblem.calculateMolecularWeight(weights, H2SO4Formula), 0.01);
		assertEquals(82.04, HashMapProblem.calculateMolecularWeight(weights, NaC2H3O2Formula), 0.01);
	}
	
	

}
