package feb28;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> studentNames = new LinkedList<String>();
		studentNames.add("Adinarayana");
		studentNames.add("Anusha");
		studentNames.add("Anand");
		studentNames.add("Anil");
		System.out.println(studentNames);
		
		studentNames.remove(2);
		System.out.println(studentNames);
		
		studentNames.add(2, "Ahmed");
		studentNames.add(3, "Ahmed");
		studentNames.add(3, "Mohd");
		
		System.out.println(studentNames);
		
		for(int i=0; i<studentNames.size(); i++) {
			System.out.println(studentNames.get(i));
		}
		
		
		
	}

}
