package sll;

import java.util.NoSuchElementException;

/**
 * This class provides a basic implementation of a singly linked list. It's
 * motivated by the implementation in Big Java, 5e, ch. 16.1.
 * 
 * @author <Muqing Zheng> on <2/5/2016>.
 * @param <T>
 *            The type of elements in the list
 */
public class LinkedList<T> implements List<T>, Iterable<T> {

	private ListNode<T> first;
	// Note that in addition to a head (first) pointer
	// this list contains a last pointer. Be sure to
	// BOTH first and last up to date in all your code.
	private ListNode<T> last;

	/**
	 * Constructs a new, empty linked list.
	 */
	public LinkedList() {
		this.first = null;
		this.last = null;
	}

	public ListNode<T> getFirst() {
		return this.first;
	}

	public ListNode<T> getLast() {
		return this.last;
	}

	@Override
	public String toString() {
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		ListNode<T> current = this.first;
		while (current != this.last) {
			result += (current.getElement() + ", ");
			current = current.getNext();
		}
		return result + current.getElement() + "]";
	}

	@Override
	public boolean add(T x) {
		if (this.first == null) {
			this.first = new ListNode<T>(x);
			this.last = this.first;
		} else {
			this.last.setNext(new ListNode<T>(x));
			this.last = this.last.getNext();
		}
		return true;
	}

	@Override
	public int size() {
		int count = 0;
		ListNode current = this.first;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	@Override
	public void add(int i, T x) throws IndexOutOfBoundsException {
		if (i < 0 || i > this.size()) {
			throw new IndexOutOfBoundsException();
		}
		ListNode current = this.first;
		if (current == null) {
			add(x);
		} else if (i == 0) {
			this.first = new ListNode<T>(x, this.first);
		} else if (i == 1) {
			current.setNext(new ListNode<T>(x, current.getNext()));
		} else if (i == this.size()) {
			this.last.setNext(new ListNode<T>(x));
			this.last = this.last.getNext();
		} else {
			for (int j = 0; j < i - 2; j++) {
				current = current.getNext();
				current.setNext(new ListNode<T>(x, current.getNext()));
			}
		}

	}

	@Override
	public boolean contains(T x) {
		ListNode newNode = this.first;
		while (newNode != null) {
			if (newNode.getElement().equals(x)) {
				return true;
			}
			newNode = newNode.getNext();
		}
		return false;
	}

	@Override
	public boolean remove(T x) {
		if (this.contains(x)) {
			ListNode current = this.first;
			if (current.getElement().equals(x)) {
				this.first = current.getNext();
				return true;
			}
			int num = 1;
			while (!current.getNext().getElement().equals(x)) {
				num++;
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());

			if (num == this.size()) {
				this.last = current.getNext();
			}
			return true;
		}
		return false;

	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index <= 0 || index > this.size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<T> newNode = this.first;
		for (int i = 0; i < index; i++) {
			newNode = newNode.getNext();
		}
		return newNode.getElement();
	}

	@Override
	public int indexOf(T x) {
		int count = 0;
		ListNode newNode = this.first;
		if (this.contains(x)) {
			while (!newNode.getElement().equals(x)) {
				count++;
				newNode = newNode.getNext();
			}
			return count;
		}
		return -1;
	}

	@Override
	public T set(int index, T element) throws IndexOutOfBoundsException {
		if (index > this.size() || index <= 0) {
			throw new IndexOutOfBoundsException();
		}
		T myT = this.get(index);
		ListNode<T> newNode = this.first;
		for (int i = 0; i < index; i++) {
			newNode = newNode.getNext();
		}
		newNode.setElement(element);
		if (index == 0) {
			this.first = newNode;
		} else if (index == this.size() - 1) {
			this.last = newNode;
		}
		return myT;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator(this);
	}

	/**
	 * This is an iterator over this list.
	 * 
	 * @author <Muqing Zheng> on <2/5/2015>.
	 */
	private class LinkedListIterator implements Iterator<T> {

		private ListNode<T> current, previous,early;
		private LinkedList<T> list;

		private LinkedListIterator(LinkedList<T> e) {
			this.list = e;
			this.current = this.list.getFirst();
			this.previous = null;
			this.early=null;
		}

		@Override
		public boolean hasNext() {
			if (this.current==null) {
				return false;
			}
			return this.current.getNext() != null;
		}

		@Override
		public T next() throws NoSuchElementException {
			if (this.current == null) {
				throw new NoSuchElementException();
			}
			this.early=this.previous;
			this.previous = this.current;
			this.current = this.current.getNext();
			return previous.getElement();
		}

		@Override
		public void remove() {
			if (this.previous == null) {
				throw new IllegalStateException();
			}
			this.list.remove(this.previous.getElement());
			this.previous=this.early;
		}
	}

}
