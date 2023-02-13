package Basics_Project;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(Payload.CoursePrice());
		// Print no of courses return by API

		int count = js.getInt("courses.size()");

		System.out.println(count);

		// Print Purchase total ammount

		int totalAmmount = js.getInt("dashboard.purchaseAmount");

		System.out.println(totalAmmount);

		// Print title of first course

		String FirstCourse = js.get("courses[0].title");

		System.out.println(FirstCourse);

		// Print All course titles and their respective Prices

		for (int i = 0; i < count; i++) {

			String CourseTitles = js.get("courses[" + i + "].title");
			System.out.println(CourseTitles);
			System.out.println(js.get("courses[" + i + "].price").toString());
		}

		// Print no of copies sold by Cypress Course

		System.out.println("Print no of copies sold by Cypress Course");

		for (int j = 0; j < count; j++) {

			String CourseTitles = js.get("courses[" + j + "].title");
			if (CourseTitles.equals("Cypress")) {
				int copies = js.getInt("courses[" + j + "].copies");
				System.out.println(copies);
				break;
			}

		}

	}

}
