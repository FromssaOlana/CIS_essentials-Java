package likedList;

import java.util.NoSuchElementException;

/*
 * Author Fromssa Olana
 * 
 * a custom linkeList implementation 
 */
public class LinkedList {
	private class Node {
		private int data;
		private Node nextNode;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node firsNode;
	private Node lastNode;
	private int size;

	public int getSize() {
		return size;
	}

	// addFirst

	public void addFirst(int data) {
		var newNode = new Node(data);
		if (isEmpty()) {
			firsNode = lastNode = newNode;
		} else {
			newNode.nextNode = firsNode;
			firsNode = newNode;
		}

		size++;

	}

	private boolean isEmpty() {
		return firsNode == null;
	}

	// addLast

	public void addLast(int data) {
		var newNode = new Node(data);
		if (isEmpty()) {
			firsNode = lastNode = newNode;
		} else {
			lastNode.nextNode = newNode;
			lastNode = newNode;
		}

		size++;
	}

	// deleteFirst
	public void deletFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (firsNode == lastNode) {
			firsNode = lastNode = null;
			size = 0;
			return;
		}
		var pointer = firsNode;
		firsNode = firsNode.nextNode;
		pointer.nextNode = null;
		size--;

	}

	// deleteLast
	public void deletLast() {
		var pointer = firsNode;
		while (pointer.nextNode != lastNode) {
			pointer = pointer.nextNode;
		}

		lastNode = pointer;
		pointer.nextNode = null;
	}

	// contains
	public boolean contains(int data) {
		if (isEmpty()) {
			return false;
		}
		return indexOf(data) != -1;

	}

	// indexOf

	public int indexOf(int data) {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			int index = 0;
			Node pointerNode = firsNode;
			while (pointerNode.nextNode != null) {
				if (pointerNode.data == data) {
					return index;
				}
				pointerNode = pointerNode.nextNode;
				index++;
			}

		}
		return -1;
	}

	@Override
	public String toString() {
		var current = firsNode;
		String string = "[";
		while (current != null) {
			string += current.data;
			current = current.nextNode;
			string = current != null ? string + ", " : string + "";
		}
		string += "]";

		return string;
	}

}
