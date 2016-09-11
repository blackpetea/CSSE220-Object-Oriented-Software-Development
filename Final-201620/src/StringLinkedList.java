import java.util.ArrayList;

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

	public StringLinkedList() {
		first = null;
	}

	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}

	/**
	 * Removes the last element of this list Returns the data of the element
	 * that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public String removeLast() {
		// zero element list
		if (first == null)
			return null;

		// one element list
		if (first.next == null) {
			String data = first.data;
			first = null;
			return data;
		}

		// the rest
		Node current = first;
		while (current.next.next != null) {
			current = current.next;
		}
		String data = current.next.data;
		current.next = null;
		return data;
	}

	/**
	 * Returns true if there is a piece of data in two or more places in a list.
	 * 
	 * Otherwise, returns false.
	 * 
	 * For example: hasDuplicates({"a"->"b"->"c"->"d"}) -> false
	 * hasDuplicates({"a"->"b"->"c"->"b"}) -> true
	 * hasDuplicates({"x"->"y"->"z"->"q"}) -> false hasDuplicates({}) -> false
	 * hasDuplicates({"y"}) -> false
	 * 
	 * 
	 */
	public boolean hasDuplicates() {
		if (this.first == null || this.first.next == null) {
			return false;
		}
		Node current = this.first;
		ArrayList<String> datas = new ArrayList<String>();
		while (current != null) {
			if (datas.contains(current.data)) {
				return true;
			} else {
				datas.add(current.data);
			}
			current = current.next;
		}

		return false;
	}

	/**
	 * Appends the data from the next item with that of the current item if the
	 * current element matches the given string.
	 * 
	 * joinWithNextIfMatch({"a"->"b"->"c"->"d"}, "b"}) results in
	 * {"a"->"bc"->"d"} joinWithNextIfMatch({"a"->"b"->"c"->"b"}, "b"}) results
	 * in {"a"->"bc"->"b"} joinWithNextIfMatch({"x"->"y"->"z"->"q"}, "x"})
	 * results in {"xy"->"z"->"q"} joinWithNextIfMatch({}, "b"}) results in {}
	 * joinWithNextIfMatch({"y"}, "y"}) results in {"y"}
	 * joinWithNextIfMatch({"a"->"b"->"c"->"a"->"e"->"f"}, "a"}) results in
	 * {"ab"->"c"->"ae"->"f"}
	 * 
	 * @param toMatch
	 *            - The value to find to cause a join
	 */
	public void joinWithNextIfMatch(String toMatch) {
		if (this.first == null || this.first.next == null) {
			return;
		}
		Node ite = this.first;
		while (ite != null) {
			if (ite.data.equals(toMatch)) {
				if (ite.next != null) {
					ite.data = ite.data + ite.next.data;
					ite.next = ite.next.next;
				}
			}

			ite = ite.next;
		}

	}
	/*
	 * Node current=this.first; if (current.data.equals(toMatch)) {
	 * this.first=new Node(current.data+current.next.data,current.next.next);
	 * return; } if (current.next.data!=null) { while
	 * (!current.next.data.equals(toMatch)) { current=current.next; } } String
	 * myData=current.next.data+current.next.next.data; Node
	 * myNext=current.next.next.next; current.next=new Node(myData,myNext);
	 * ite=ite.next;
	 */

	/**
	 * Truncate the list after the given value.
	 * 
	 * truncateList({"a"->"b"->"c"->"d"}, "b"}) results in {"a"->"b"}
	 * truncateList({"a"->"b"->"c"->"b"}, "b"}) results in {"a"->"b"}
	 * truncateList({"x"->"y"->"z"->"q"}, "x"}) results in {"x"}
	 * truncateList({}, "b"}) results in {} truncateList({"y"}, "y"}) results in
	 * {"y"} truncateList({"a"->"b"->"c"->"a"->"e"->"f"}, "a"}) results in {"a"}
	 * 
	 * @param truncateAfter
	 *            - remove items after the first instance of the given value
	 * 
	 */
	public void truncateList(String truncateAfter) {
		if (this.first == null || this.first.next == null) {
			return;
		}
		Node current = this.first;
		while (!current.data.equals(truncateAfter)) {
			current = current.next;
		}
		current.next = null;
	}
}
