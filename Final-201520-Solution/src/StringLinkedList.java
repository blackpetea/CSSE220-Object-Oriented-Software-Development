
/*
 * A linked list class for storing Strings
 */
public class StringLinkedList {

	private class Node {
		
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public String data;
		public Node next;
		
	}
	
	private Node first;
	
	public StringLinkedList()
	{
		first = null;
	}
	
	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData)
	{
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}
	
	/**
	 * Removes the last element of this list
	 * Returns the data of the element that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public String removeLast()
	{
		//zero element list
		if(first == null) return null;
		
		//one element list
		if(first.next == null) {
			String data = first.data;
			first = null;
			return data;
		}
		
		//the rest
		Node current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		String data = current.next.data;
		current.next = null;
		return data;
	}
	
	/**
	 * (PROBLEM 1)
	 * 
	 * Adds a separator node between all the nodes in the list
	 * 
	 * Does not add the separator before the first or after the last
	 * 
	 * For example, for this list and the separator "SEP":
	 * "A"->"B"->"C"
	 * becomes
	 * "A"->"SEP"->"B"->"SEP"->"C"
	 * 
	 * @param separator string to use as separator
	 * 
	 */
	public void addSeparator(String separator) {

		Node current = this.first;
		if(current == null)
			return;
		while(current.next != null) {
			Node newNode = new Node(separator,current.next);
			current.next = newNode;
			current = newNode.next;
		}
	}
	

	/**
	 * 
	 * (PROBLEM 2)
	 * 
	 * Takes a list that has elements that are left parens and right parens
	 * and removes all elements between the parens and the parens themselves.  
	 * 
	 * You can assume parens will not be nested and all lists a well formed
	 * (that is every left paren has a matching right paren, no right parens
	 * before left parens, etc.)
	 * 
	 * You can assume that the string will never begin with a left paren
	 * 
	 * For example:
	 * "A"->"("->"B"->"C"->")"->"D"
	 * becomes
	 * "A"->"D"
	 * 
	 */
	public void removeBetweenParens() {
		Node current = first;
		boolean inParen = false;
		
		if(current == null)
			return;
		
		while(current.next != null) {
			String data = current.next.data;
			if(data.equals("(")) {
				inParen = true;
			}
			if(inParen) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
			if(data.equals(")")) {
				inParen = false;
			}
		}
	}
	
	
	
	/**
	 * 
	 * (PROBLEM 3)
	 * 
	 * Returns true if the data in the array is the same as the list, false otherwise
	 * 
	 * For example
	 * the list "A"->"B"->"C" and the array {"A","B","C"} returns true
	 * the list "A"->"B"->"C" and the array {"A","Z","C"} returns false
	 * 
	 * The list and the array might be different lengths.  In that case they are not equal.
	 *  
	 */
	public boolean equalsArray(String[] array) {
		Node current = first;
		for(String s : array) {
			if(current == null) return false;
			if(!s.equals(current.data)) return false;
			current = current.next;
		}
		if(current != null) return false;
		return true;
	}
	
	/**
	 * 
	 * (PROBLEM 4)
	 * 
	 * Moves N elements from the front to the back of the array
	 * 
	 * For example
	 * the list "A"->"B"->"C"->"D" and N=1 becomes "B"->"C"->"D"->"A"
	 * the list "A"->"B"->"C"->"D" and N=2 becomes "C"->"D"->"A"->"B"
	 * the list "A"->"B"->"C"->"D" and N=0 becomes "A"->"B"->"C"->"D"
	 * 
	 * You can assume that the given N will be strictly less than the length of the list
	 * 
	 * You can use an additional data structure like an ArrayList if you want, but the
	 * problem is solvable without that.
	 */
	public void moveNToBack(int n) {
		if(n == 0) return;
		Node current = first;
		Node oldHead = first;
		for(int i = 0; i < n - 1; i++) {
			current = current.next;
		}
		
		first = current.next;
		current.next = null;
		current = first;
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = oldHead;

	}

}

