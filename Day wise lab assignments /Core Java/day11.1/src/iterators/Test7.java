package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test7 {

	public static void main(String[] args) {
		String[] names= {"one","two","three","four","five"};
		ArrayList<String> strings=new ArrayList<>();
		for(String s : names)
			strings.add(s);
		//display list elems in reverse manner : ListIterator (can also be done using a for loop)
		//1. attach list itr : after the last elem
		ListIterator<String> stringItr=strings.listIterator(strings.size());
		while(stringItr.hasPrevious())
			System.out.println(stringItr.previous());
	//	System.out.println(stringItr.previous());//nosuchelemexc
	}

}
