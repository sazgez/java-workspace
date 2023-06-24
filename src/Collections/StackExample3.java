package Collections;

import java.util.Stack;

public class StackExample3{
	public static void main(String[] args) {
		Stack st = new Stack();
		st.add("11");
		st.add("22");
		st.add("33");
		st.add("44");
		st.add("55");
		st.add("66");
		st.add("77");
		st.add("88");
		st.add("99");
		st.add("100");
		if (st.contains("33"))
			System.out.println("Aranan öğe bulundu!");
		else
			System.out.println("Böyle bir öge yok!");
	}
}