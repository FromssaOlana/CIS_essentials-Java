package arrays;

public class Driver {
	public static void main(String[] args) {
		var array = new DynamicArray(2);
		array.insert(1);
		// array.insert(7);
		// array.insert(9);
		array.print();
		System.out.println("size " + array.size);

		// array.removeAt(0);
		array.print();
		System.out.println("size" + array.size);

		System.out.println(array.indexOf(1));

	}
}
