package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test5 {

	public static void main(String[] args) {
		String[] names = { "one", "two", "three", "four", "five" };
		ArrayList<String> strings = new ArrayList<>();
		for (String s : names)
			strings.add(s);
		// display list elems using Iterator : forward manner
		Iterator<String> stringItr = strings.iterator();
	//	strings.set(0, "zero");//no structural modi.
	//	strings.add("six");// structural modi.
		strings.remove(0);// structural modi.
		while (stringItr.hasNext()) {
			System.out.println(stringItr.next());//Conc.ModiExc
		}
		System.out.println("List again "+strings);

	}

}
