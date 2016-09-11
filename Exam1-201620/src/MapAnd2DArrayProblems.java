import java.util.HashMap;

public class MapAnd2DArrayProblems {
	
	/**
	 * Given array of positive integers, returns the sum of the largest column.
	 * 
	 * For example:
	 * {{1,2,3},	
	 *  {4,1,1}} returns 5
	 * 
	 * @param data
	 * @return
	 */
	public static int largestColumn(int[][] data) {
		int sum=0;
		int max=0;
		for (int i=0;i<data[0].length;i++) {
			for (int j=0;j<data.length;j++) {
				sum+=data[j][i];
			}
			if (sum>max) {
				max=sum;
			}
			sum=0;
		}
		return max;
	}
	
	/**
	 * Given a hash map which may contain a duplicate value, returns the duplicate value.
	 * If there is no duplicate value, returns null.
	 * 
	 * For example:
	 * {"a"="1", "b"="2", "c"="2", "d"="3"} returns "2"
	 * {"a"="1", "b"="2","d"="3"} returns null
	 * 
	 * @param values
	 * @return
	 */
	public static String duplicateValue(HashMap<String,String> keysToValues) {
		String cont1="";
		String cont2="";
		int fre=0;
		for (String keys1:keysToValues.keySet()) {
			cont1=keysToValues.get(keys1);
			for (String keys2:keysToValues.keySet()) {
				cont2=keysToValues.get(keys2);
				if (cont1.equals(cont2)) {
					if (fre>0) {
						return cont1;
					} else {
						fre++;
					}
				}
			}
			fre=0;
		}
		return null;
		
	}
}
