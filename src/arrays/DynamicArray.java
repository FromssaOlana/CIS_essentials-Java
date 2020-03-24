package arrays;

import java.util.Arrays;

/*
 * Author Fromssa Olana
 * 
 * A dynamic array data structure that resize accordingly 
 */

public class DynamicArray {
	int[] array;
	int size = 0;

	// the constructor will initialize the first array with size
	public DynamicArray(int size) {
		array = new int[size];
	}

	public void insert(int value) {
		if (isfull()) {
			resizeArray();
		}
		array[size++] = value;

	}

	private void resizeArray() {
		int[] newArray = new int[array.length * 2];
		System.arraycopy(array, 0, newArray, 0, size);
		array = newArray;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException();
		}

		if (size == 1)
			array[index] = 0;
		else
			for (int i = index; i < size; i++)
				array[i] = array[i + 1];

		size--;

	}

	public int getSize() {
		return size;
	}

	public void print() {
//		for (int i : array) {
//			System.out.print(i + ",");
//		}
		Arrays.stream(array).forEach(System.out::println);
	}

	private boolean isfull() {
		return size == array.length;
	}

	public int indexOf(int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
