package sort;

import java.util.ArrayList;

public class NamenSort {

	public static void main(String[] args) {
		String name1 = "A";
		String name2 = "a";
		//
		int differenz = name1.compareTo(name2);
		int differenz1 = name1.compareToIgnoreCase(name2);
		//
		System.out.println(differenz);
		System.out.println(differenz1);
		//
		ArrayList<String> namen = new ArrayList<String>();
		namen.add("a");
		namen.add("b");
		//
		System.out.println(namen.get(0).compareTo(namen.get(1)));

	}

}
