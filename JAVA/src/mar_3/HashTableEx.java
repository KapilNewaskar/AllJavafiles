package mar_3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Integer> hm = new Hashtable<String, Integer>();
		hm.put("Santosh", 1);
		hm.put("Shiva", 2);
		hm.put("Pavan", 3);
		hm.put("Adi", 4);
		System.out.println(hm);

		hm.put("Santosh", 10);
		hm.put("Santosh1", 10);
		hm.put("kk", 1);
		System.out.println(hm);

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
