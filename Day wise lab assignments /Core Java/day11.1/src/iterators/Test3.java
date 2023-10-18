package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		String[] names= {"one","two","three","four","five"};
		ArrayList<String> strings=new ArrayList<>();
		for(String s : names)
			strings.add(s);
		//display list elems using Iterator : forward manner
		Iterator<String> stringItr=strings.iterator();
		stringItr.remove();//IllegalStateExc
		//cursor : before index 0 
		while(stringItr.hasNext()) {
			System.out.println(stringItr.next());
			stringItr.remove();
			stringItr.remove();//IllegalStateExc
		}
		System.out.println("List after remove : "+strings);//[]
		

	}

}
