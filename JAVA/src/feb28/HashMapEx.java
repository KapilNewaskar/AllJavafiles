package feb28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Santosh", 1);
		hm.put("Shiva", 2);
		hm.put("Pavan", 3);
		hm.put("Adi", 4);
		System.out.println(hm);

		hm.put("Santosh", 10);
		System.out.println(hm);

		hm.put(null, null);
		System.out.println(hm);

		hm.put(null, null);
		System.out.println(hm);

		hm.put(null, null);
		System.out.println(hm);

		hm.put("a", null);
		hm.put("b", null);
		hm.put("c", 0);

		System.out.println(hm);

		Set set = hm.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Entry mp = (Entry) it.next();
			System.out.println(mp);
		}

	}

}
