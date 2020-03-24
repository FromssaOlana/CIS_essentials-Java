package likedList;

public class LinkedListDriver {
	public static void main(String[] args) {
		var mylist = new LinkedList();
		mylist.addFirst(2);
		mylist.addFirst(1);
		mylist.addFirst(0);
		mylist.addLast(3);
		mylist.addLast(4);

		System.out.println(mylist.contains(20));
		System.out.println(mylist.indexOf(10));

		System.out.println(mylist.toString());
		mylist.deletFirst();
		System.out.println(mylist.toString());
		mylist.deletLast();
		System.out.println(mylist.toString());

	}

}