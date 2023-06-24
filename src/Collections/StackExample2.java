package Collections;

import java.util.LinkedList;

public class StackExample2 {

	private LinkedList list = new LinkedList();

	public void push(Object v) {
		list.addFirst(v); // LIFO
	}

	public Object pop() {
		return list.removeFirst();
	}

	public static void main(String[] args) {
		StackExample2 stack = new StackExample2();
		for (int i = 0; i < 10; i++) stack.push(new Integer(i));
		for (int i = 0; i < 10; i++) System.out.print(" " + stack.pop()); // LIFO (Last In First Out)
	}
}