package programs;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class PostMethodAddBookEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://216.10.245.166/";	
		String authorName = "Santosh";
		String version = "2.4";

		//Store the entire reponse in a string variable
		System.out.println("Ex:4 Store the entire reponse in a string variable");
		String response;
		response = given().
				header("Content-Type","application/json")
		.body("{\r\n" + 
				"	\"name\":\"Learn Selenium Automation with Java\",\r\n" + 
				"	\"isbn\":\""+authorName+"\",\r\n" + 
				"	\"aisle\":\""+version+"\",\r\n" + 
				"	\"author\":\"SantoshKumar\"\r\n" + 
				"}").
		when().
				post("Library/Addbook.php")
		.then().extract().response().asString();
		
		System.out.println(response);

	}

}
