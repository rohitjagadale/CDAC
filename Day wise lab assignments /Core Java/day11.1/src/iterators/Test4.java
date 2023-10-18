package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		String[] names= {"one","two","three","four","five"};
		ArrayList<String> strings=new ArrayList<>();
		for(String s : names)
			strings.add(s);
		//display list elems using Iterator : forward manner
		Iterator<String> stringItr=strings.iterator();
		//cursor : before index 0 
		while(stringItr.hasNext()) {
			System.out.println(stringItr.next());			
		}
		System.out.println(stringItr.next());//NoSuchElemExc
		

	}

}
