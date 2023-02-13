package programs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import scala.collection.mutable.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class PostMethodAddBookEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://216.10.245.166/";	
		//send request in POST method and validate the response with status code
		System.out.println("Ex:1 send request in POST method and validate the response with status code");
		
		String authorName = "Kapil";
		String version = "2.0";
		
		given().
				header("Content-Type","application/json")
		.body("{\r\n"
				+ "	\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "	\"isbn\":\""+authorName+"\",\r\n"
				+ "	\"aisle\":\""+version+"\",\r\n"
				+ "	\"author\":\"kkk\"\r\n"
				+ "}").
		when().
				post("Library/Addbook.php")
		.then().assertThat().statusCode(200);
		
		System.out.println("Book added successfully");
		
			
	
	
	}

}




