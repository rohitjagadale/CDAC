package tester;

import java.util.ArrayList;
import java.util.Collections;

public class StringList {

	public static void main(String[] args) {
		String[] names= {"one","two","three","four","five"};
		ArrayList<String> strings=new ArrayList<>();
		for(String s : names)
			strings.add(s);
		System.out.println("orig list");
		System.out.println(strings);
		Collections.sort(strings);
		System.out.println("sorted list");
		System.out.println(strings);

	}

}
