package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Main> mList = new HashSet<Main>();
		Map<String, Main> map = new HashMap<String, Main>();
		Main m = new Main();
		m.setMain("Test1");
		mList.add(m);
		map.put("Test1", m);
		
		m = new Main();
		m.setMain("Test2");
		mList.add(m);
		map.put("Test2", m);
		
		for(Entry<String, Main> entry:map.entrySet()) {
			//System.out.println(entry.getValue().getMain());
			entry.getValue().setMain("UpTest");
		}
		
		for(Main list: mList) {
			System.out.println(list.getMain());
		}
	}


}
