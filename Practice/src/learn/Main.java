package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		ListIterator<String> it = myList.listIterator();
		int index = 0;
		while(it.hasNext()){
			String value = it.next();
			
			if(value.equals("3")){
				//it.remove();
				it.add("6");
				it.add("7");
				//index++;
			}
			System.out.println("List Value:"+value);
			index++;
		}
		
		
		int listSize = myList.size();
		for(int i = 0; i < listSize; ++i){
			if(i == 2) {
				List<String> t = new ArrayList<String>();
				t.add("sub1");
				t.add("sub2");
				myList.addAll(i, t);
				listSize += t.size();
			}
			System.out.println(myList.get(i));
		}

		System.out.println("List Size:"+myList.size());

	}

}
