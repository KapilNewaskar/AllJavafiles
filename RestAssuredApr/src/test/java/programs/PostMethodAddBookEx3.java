package programs;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class PostMethodAddBookEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://216.10.245.166/";	
		String authorName = "Santosh";
		String version = "2.3";
		
		//send request in POST method and print the request & response in jSon LOG
		System.out.println("Ex:3 send request in POST method and print the request & response in jSon LOG");
		given().log().body().
				header("Content-Type","application/json")
		.body("{\r\n" + 
				"	\"name\":\"Learn Selenium Automation with Java\",\r\n" + 
				"	\"isbn\":\""+authorName+"\",\r\n" + 
				"	\"aisle\":\""+version+"\",\r\n" + 
				"	\"author\":\"SantoshKumar\"\r\n" + 
				"}").
		when().
				post("Library/Addbook.php")
		.then().log().body().assertThat().statusCode(200);
	}

}
