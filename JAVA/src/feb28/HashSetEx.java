package feb28;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("Santosh");
		hs.add("Shiva");
		hs.add("Pavan");
		hs.add("adi");
		// hs.add(null);

		System.out.println(hs);

		hs.add("Santosh");
		
		System.out.println(hs);

		hs.add("santosh");
		System.out.println(hs);

		hs.remove("santosh");
		System.out.println(hs);

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {

			String name = it.next();
			if (name.equals("adi")) {
				System.out.println("pass");
			}
		}

	}

}
