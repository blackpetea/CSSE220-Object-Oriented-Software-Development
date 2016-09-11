
/**
 * TODO Put here a description of what this class does.
 *
 * @author TODO <Muqing Zheng>.
 *         Created Dec 15, 2013.
 */
public class Two2DArrayProblems {
	
	/**
	 * 
	 * Count the number of times 4 occurs in the array.  So
	 * the array
	 * 
	 * 		int[][] intArray2 = 
     *       {{0,0,0},
     *       {4,4,0}};
     *
     *       returns 2
	 * @param data 
	 * @return the number of times 4 occurs in the array.
	 */
	public static int count4s(int[][] data) {
		int count=0;
		for (int i=0;i<data.length;i++) {
			for (int j=0;j<data[i].length;j++) {
				if (data[i][j]==4) {
					count++;
				}
			}
		}

		return count;
	}
	
	/**
	 * Takes an array of strings, all of which have equal length.
	 * 
	 * Returns a 2D array of characters, where the characters
	 * correspond to the strings.  
	 * 
	 * {"abc",
	 *  "def"} yields {{'a','b','c'},
     *                 {'d','e','f'}};
	 * @param input 
	 * @return a 2D array of characters, where the characters
	 * correspond to the strings. 
	 *  
	 */
	public static char[][] stringsToCharArrays(String[] input) {
		char[][] res=new char[input.length][input[0].length()];
		for (int i=0;i<input.length;i++) {
			for (int j=0;j<input[i].length();j++) {
				res[i][j]=input[i].charAt(j);
			}
		}

		return res;
	}
	
	/**
	 * Takes a square array of integers.
	 * 
	 * Returns true of the array is symmetric.  That is if
	 * the array[i,j] == array[j,i] for all i and j
	 * 
	 * So {{1,0,0},
	 *     {0,1,0},
	 *     {0,0,1}} returns true
     *
     *    {{1,0,3},
	 *     {0,1,0},
	 *     {0,0,1}} returns false because [0,2] != [2,0]
	 * @param input 
	 * @return true of the array is symmetric, false otherwise.
	 */
	public static boolean isSymmetric(int[][] input) {
		int count=0;
		for (int i=0;i<input.length;i++) {
			for (int j=0;j<input[i].length;j++) {
				if (input[i][j]==input[j][i]) {
					count++;
				}
			}
		}
		return count==input.length*input[0].length;
	}
	
	/**
	 * Takes an array of integers representing a map.
	 * 
	 * On the map there is one square representing the person: '@'
	 * At least one and maybe more squares representing an exit: 'X'
	 * And empty squares: '.'
	 * 
	 * The function returns the shortest distance from the person to 
	 * an exit.  Note the person can't move diagonally so it is the
	 * Manhattan distance. 
	 * 
	 * If you're not sure what "Manhattan distance" is, be sure to 
	 * look it up! Having that definition makes things much easier.
	 * 
	 *  For example, in the map
	 * @param input 
	 * @return the shortest Manhattan distance from the person to 
	 * an exit. 
	 *  
	 *  @...
	 *  .X.X
	 *  
	 *  The function returns 2 (east, south)
	 *  
	 *  X.XX
	 *  ....
	 *  .@.. returns 3
	 */
	public static int distanceToExit(char[][] input) {
		int shortdis=input.length+input[0].length;
		int perrow=0;
		int percol=0;
		for (int i=0;i<input.length;i++) {
			for (int j=0;j<input[i].length;j++) {
				if (input[i][j]=='@') {
					perrow=i;
					percol=j;
				}
			}
		}
		for (int i=0;i<input.length;i++) {
			for (int j=0;j<input[i].length;j++) {
				if (input[i][j]=='X') {
					if (shortdis>Math.abs(i-perrow)+Math.abs(j-percol)) {
						shortdis=Math.abs(i-perrow)+Math.abs(j-percol);						
					}
				}
			}
		}
		return shortdis;
	}
}
