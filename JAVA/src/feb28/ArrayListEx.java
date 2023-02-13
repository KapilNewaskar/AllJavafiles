package feb28;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> studentNames = new ArrayList<String>();
//		studentNames.add("Adinarayana");
//		studentNames.add("Anusha");
//		studentNames.add("Anand");
//		studentNames.add("Anil");
//		System.out.println(studentNames);
//		
//		studentNames.remove(2);
//		System.out.println(studentNames);
//		
//		studentNames.add(2, "Ahmed");
//		studentNames.add(3, "Ahmed");
//		studentNames.add(3, "Mohd");
//		
//		System.out.println(studentNames);
//		
//		for(int i=0; i<studentNames.size(); i++) {
//			System.out.println(studentNames.get(i));
//		}
//		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("k1");
		names.add("k2");
		names.add("k3");
		names.add("k4");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		names.add(2,"k5");
		names.add(2,"k6");
		System.out.println(names);
	}

}
