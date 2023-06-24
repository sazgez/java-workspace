package Collections;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push("Londra");
		stack.push("Moskova");
		stack.push("Ankara");
		stack.push("Paris");
		stack.push("Viyana");

		System.out.println(stack);
		System.out.println(stack.search("Ankara")); // 1'den baslar saymaya
		System.out.println(stack.peek()); // sondan ceker ve yerine koyar
		System.out.println(stack.pop()); // sondan ceker yerine koymaz
		System.out.println(stack);
}
}