package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
//		String[] names= {"one","two","three","four","five"};
//		ArrayList<String> strings=new ArrayList<>();
//		for(String s : names)
//			strings.add(s);
//		//display list elems using Iterator : forward manner
//		Iterator<String> stringItr=strings.iterator();
//		//cursor : before index 0 
//		while(stringItr.hasNext())
//			System.out.println(stringItr.next());
		
		
		String [] names= {"rohit","samir","ddn"};
		
		ArrayList<String> strings=new ArrayList<>();
		for(String i:names) {
			strings.add(i);
		}
		
		Iterator<String> it1= strings.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			it1.remove();
			System.out.println(it1.next());
		}
		

	}

}
